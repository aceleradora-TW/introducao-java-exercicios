package com.agil.aceleradora.exercicios;

import java.util.Arrays;

public class FiltraParesImpares {

    /*
    Este metodo recebe um vetor de inteiros como parametros e
    deve retornar um novo vetor contendo somente os numeros
    pares do vetor recebido.

    Se a entrada for: [1, 2, 3, 4, 5]
    A saida deve ser um vetor contendo: [2, 4]
     */
    public static int[] filtraPares(int[] numeros) {
        return new int[]{};
    }

    /*
    Este metodo recebe um vetor de inteiros como parametro e
    deve retornar um novo vetor contendo somente os numeros
    impares do vetor recebido.

    Se a entrada for: [1, 2, 3, 4, 5]
    A saida deve ser um vetor contendo: [1, 3, 5]
     */
    public static int[] filtraImpares(int[] numeros) {
        return new int[]{};
    }

    // Dica: Utilize Arrays.toString(vetor) para imprimir um vetor de maneira legivel
    public static void main(String[] args) {
        int[] pares = filtraPares(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        int[] impares = filtraImpares(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10});

        System.out.println(Arrays.toString(pares));
    }
}
