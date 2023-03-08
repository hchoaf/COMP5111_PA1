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

# test generation using randoop
# We set the output directory to maven test source folder
for i in 0 1 2 3 4
do
  echo "Generating test suite $i"

  java -ea -classpath "$ROOT_DIR"/lib/randoop-all-4.3.1.jar:"$ROOT_DIR"/raw-classes \
    randoop.main.Main gentests \
    --testclass=comp5111.assignment.cut.Subject \
    --randomseed=$i \
    --time-limit=5 \
    --junit-package-name=comp5111.assignment.cut \
    --junit-output-dir="$ROOT_DIR"/src/test/randoop$i \
    --regression-test-basename=RegressionTest$i

  echo "test suite $i done"
done

