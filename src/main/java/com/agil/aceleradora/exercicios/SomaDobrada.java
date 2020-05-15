package com.agil.aceleradora.exercicios;

public class SomaDobrada {

    /*
    A implementação deve considerar as seguintes regras:
    - Caso os dois números recebidos sejam iguais, o método retorna o dobro da soma;
    - Caso um dos números seja menor do que 1, o método retorna -1;
    - Caso nenhuma das condições anteriores seja verdadeira, o método retorna a soma dos dois números.

    Exemplos de entrada e saida:
      somaDobrada(1, 2); // retorna 3
      somaDobrada(3, 2); // retorna 5
      somaDobrada(2, 2); // retorna 8
      somaDobrada(7, 7); // retorna 28
      somaDobrada(3, -3); // retorna -1
     */
    public static int somaDobrada(int a, int b) {
        if (a < 1 || b < 1) {
            return -1;
        }

        int soma = a + b;

        return a == b
                ? soma * 2
                : soma;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 10; j >= 0; j--) {
                System.out.printf("%d + %d = %d\n", i, j, somaDobrada(i, j));
            }
        }
    }
}
