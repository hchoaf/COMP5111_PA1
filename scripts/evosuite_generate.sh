#!/bin/bash

DIR=$( cd "$(dirname "$0")" >/dev/null 2>&1 || exit ; pwd -P )
ROOT_DIR="$DIR"/..
cd "$DIR"/.. || exit

# returns the JDK version.
# 8 for 1.8.0_nn, 9 for 9-ea etc, and "no_java" for undetected
jdk_version() {
  local result
  local java_cmd
  if [[ -n $(type -p java) ]]
  then
    java_cmd=java
  elif [[ (-n "$JAVA_HOME") && (-x "$JAVA_HOME/bin/java") ]]
  then
    java_cmd="$JAVA_HOME/bin/java"
  fi
  local IFS=$'\n'
  # remove \r for Cygwin
  local lines=$("$java_cmd" -Xms32M -Xmx32M -version 2>&1 | tr '\r' '\n')
  if [[ -z $java_cmd ]]
  then
    result=no_java
  else
    for line in $lines; do
      if [[ (-z $result) && ($line = *"version \""*) ]]
      then
        local ver=$(echo $line | sed -e 's/.*version "\(.*\)"\(.*\)/\1/; 1q')
        # on macOS, sed doesn't support '?'
        if [[ $ver = "1."* ]]
        then
          result=$(echo $ver | sed -e 's/1\.\([0-9]*\)\(.*\)/\1/; 1q')
        else
          result=$(echo $ver | sed -e 's/\([0-9]*\)\(.*\)/\1/; 1q')
        fi
      fi
    done
  fi
  echo "$result"
}
if [ "$(jdk_version)" != 11 ]; then
  echo "current jdk version is $(jdk_version), not using java 11"
  exit 1
fi

if [ ! -d "$ROOT_DIR"/target/classes ]; then
    mkdir -p "$ROOT_DIR"/target/classes
fi

if [ ! -d "$ROOT_DIR"/raw-classes ]; then
    mkdir -p "$ROOT_DIR"/raw-classes
fi


# compile class under test
echo "compiling castle.comp5111.assignment.cut.Subject ..."

javac -d "$ROOT_DIR"/raw-classes -g "$ROOT_DIR"/src/main/java/comp5111/assignment/cut/Subject.java


echo "Test Evosuite"
for i in 0 1
do
    echo "Generating Test Suite $i"

    # java -jar "$ROOT_DIR"/lib/evosuite-1.2.0.jar -help \

    java -jar "$ROOT_DIR"/lib/evosuite-1.2.0.jar -class comp5111.assignment.cut.Subject \
        -projectCP "$ROOT_DIR"/raw-classes \
        -criterion branch \
        -Dtest_dir="$ROOT_DIR"/src/test/evosuite$i \
        -Dreport_dir="$ROOT_DIR"/evosuite-reports/evosuite$i 
done
