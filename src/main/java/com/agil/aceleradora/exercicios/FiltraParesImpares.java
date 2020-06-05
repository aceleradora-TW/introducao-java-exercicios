package com.agil.aceleradora.exercicios;

import java.util.Arrays;
import java.util.function.IntPredicate;

public class FiltraParesImpares {

    private static boolean ehPar(int numero) {
        return numero % 2 == 0;
    }

    private static boolean ehImpar(int numero) {
        return !ehPar(numero);
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

    // Outra forma de resolver sem duplicacao e com apenas um loop
    private static int[] filtraComCopia(IntPredicate predicado, int[] numeros) {
        int[] resultado = new int[1];
        int ocupacao = 0;

        for (int numero : numeros) {
            if (predicado.test(numero)) {
                if (arrayEstaCheio(ocupacao, resultado)) {
                    resultado = expandeArray(resultado);
                }

                resultado[ocupacao] = numero;
                ocupacao++;
            }
        }

        return resultado;
    }

    private static int[] filtraComStream(IntPredicate predicado, int[] numeros) {
        return Arrays.stream(numeros).filter(predicado).toArray();
    }

    // Dica: Utilize Arrays.toString(vetor) para imprimir um vetor de maneira legivel
    public static void main(String[] args) {
        int[] numeros = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] pares = filtraPares(numeros);
        int[] impares = filtraImpares(numeros);

        int[] pares2 = filtraComCopia(FiltraParesImpares::ehPar, numeros);
        int[] impares2 = filtraComCopia(FiltraParesImpares::ehImpar, numeros);

        int[] pares3 = filtraComStream(FiltraParesImpares::ehPar, numeros);
        int[] impares3 = filtraComStream(FiltraParesImpares::ehImpar, numeros);

        System.out.println("---------------------");
        System.out.println("Com dois loops:");
        System.out.println(Arrays.toString(pares));
        System.out.println(Arrays.toString(impares));
        System.out.println("---------------------");
        System.out.println("Com copia:");
        System.out.println(Arrays.toString(pares2));
        System.out.println(Arrays.toString(impares2));
        System.out.println("---------------------");
        System.out.println("Com streams:");
        System.out.println(Arrays.toString(pares3));
        System.out.println(Arrays.toString(impares3));
        System.out.println("---------------------");
    }
}
