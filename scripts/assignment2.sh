#!/bin/bash

DIR=$( cd "$(dirname "$0")" >/dev/null 2>&1 || exit ; pwd -P )
ROOT_DIR="$DIR"/..
cd "$DIR"/.. || exit



if [ ! -d "$ROOT_DIR"/raw-classes ]; then
    mkdir -p "$ROOT_DIR"/raw-classes
fi

# 1. we compile the class under test castle.comp5111.example.Subject
echo "compiling comp5111.assignment.cut.Subject ..."
javac -d "$ROOT_DIR"/raw-classes "$ROOT_DIR"/src/main/java/comp5111/assignment/cut/Subject.java

# 2. we compile the classes to instrument Subject and count invocations using soot
echo "compiling instrumentation classes ..."
if [ ! -d "$ROOT_DIR"/target/classes ]; then
    mkdir -p "$ROOT_DIR"/target/classes
fi

find "$ROOT_DIR"/src/main/java -name "*.java" -print0 | xargs -0 \
  javac -classpath .:"$ROOT_DIR"/lib/* -d "$ROOT_DIR"/target/classes

for i in 0
do
  echo "###########################################################################"
  echo "Test Suite $i \n"
  # 1. we compile the class under test castle.comp5111.example.Subject
  echo "compiling comp5111.assignment.cut.Subject ..."
  javac -d "$ROOT_DIR"/raw-classes "$ROOT_DIR"/src/main/java/comp5111/assignment/cut/Subject.java

  # 2. we compile the classes to instrument Subject and count invocations using soot
  echo "compiling instrumentation classes ..."
  if [ ! -d "$ROOT_DIR"/target/classes ]; then
      mkdir -p "$ROOT_DIR"/target/classes
  fi

  find "$ROOT_DIR"/src/main/java -name "*.java" -print0 | xargs -0 \
    javac -classpath .:"$ROOT_DIR"/lib/* -d "$ROOT_DIR"/target/classes

  # 3. we run the main method of castle.comp5111.Assignment2
  java -classpath .:"$ROOT_DIR"/lib/*:"$ROOT_DIR"/target/classes comp5111.assignment.Assignment2
done
# Below is to cross-check with provided example

# java -classpath .:"$ROOT_DIR"/lib/*:"$ROOT_DIR"/target/classes comp5111.assignment.EntryPoint 