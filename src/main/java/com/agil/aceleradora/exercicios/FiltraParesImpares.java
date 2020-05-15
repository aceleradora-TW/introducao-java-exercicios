package com.agil.aceleradora.exercicios;

import java.util.Arrays;

public class FiltraParesImpares {

    private static boolean ehPar(int numero) {
        return numero % 2 == 0;
    }

    private static int[] expandeArray(int[] original) {
        return Arrays.copyOf(original, original.length + 1);
    }

    private static boolean arrayEstaCheio(int ocupacao, int[] array) {
        return array.length == ocupacao;
    }


    /*
    Este metodo recebe um vetor de inteiros como parametros e
    deve retornar um novo vetor contendo somente os numeros
    pares do vetor recebido.

    Se a entrada for: [1, 2, 3, 4, 5]
    A saida deve ser um vetor contendo: [2, 4]
     */
    public static int[] filtraPares(int[] numeros) {
        int tamanho = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (ehPar(numeros[i])) {
                tamanho++;
            }
        }

        int[] pares = new int[tamanho];

        int indice = 0;
        int contador = 0;
        while (contador < numeros.length) {
            if (ehPar(numeros[contador])) {
                pares[indice] = numeros[contador];
                indice++;
            }
            contador++;
        }

        return pares;
    }

    /*
    Este metodo recebe um vetor de inteiros como parametro e
    deve retornar um novo vetor contendo somente os numeros
    impares do vetor recebido.

    Se a entrada for: [1, 2, 3, 4, 5]
    A saida deve ser um vetor contendo: [1, 3, 5]
     */
    public static int[] filtraImpares(int[] numeros) {
        int tamanho = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (!ehPar(numeros[i])) {
                tamanho++;
            }
        }

        int[] impares = new int[tamanho];

        int indice = 0;
        int contador = 0;
        while (contador < numeros.length) {
            if (!ehPar(numeros[contador])) {
                impares[indice] = numeros[contador];
                indice++;
            }
            contador++;
        }

        return impares;
    }

    // Outra forma de resolver com apenas um loop
    private static int[] filtraParesComCopia(int[] numeros) {
        int[] pares = new int[1];
        int ocupacao = 0;

        for (int i = 0; i < numeros.length; i++) {
            boolean ehUltimaIteracao = i == numeros.length - 1;

            if (ehPar(numeros[i])) {
                pares[ocupacao] = numeros[i];
                ocupacao++;
                if (arrayEstaCheio(ocupacao, pares) && !ehUltimaIteracao) {
                    pares = expandeArray(pares);
                }
            }
        }

        return pares;
    }

    // Dica: Utilize Arrays.toString(vetor) para imprimir um vetor de maneira legivel
    public static void main(String[] args) {
        int[] pares = filtraPares(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        int[] pares2 = filtraParesComCopia(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        int[] impares = filtraImpares(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});

        System.out.println(Arrays.toString(pares));
        System.out.println(Arrays.toString(pares2));
        System.out.println(Arrays.toString(impares));
    }
}
