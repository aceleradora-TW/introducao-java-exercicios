#!/bin/bash -eu

readonly CLASSE="com.agil.aceleradora.exercicios.${1:-FizzBuzz}"
readonly CLASSPATH="${PWD}/build/classes/java/main"

print_exercise_name() {
  printf "\n"
  printf "====================================================================================\n"
  printf "\t Executando Exercicio ${CLASSE}\n"
  printf "====================================================================================\n"
  printf "\n"
}

./gradlew build \
  && print_exercise_name \
  && java -classpath ${CLASSPATH} ${CLASSE}
