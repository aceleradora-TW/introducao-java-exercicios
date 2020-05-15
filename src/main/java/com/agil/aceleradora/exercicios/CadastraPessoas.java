package com.agil.aceleradora.exercicios;

import java.util.Arrays;
import java.util.Scanner;

/*

Implemente o metodo cadastrarNomes, que deve ler a entrada
de usuario para cadastrar nomoes de pessoas em um vetor.

O tamanho do vetor eh preenchido manualmente ao iniciar o programa.

Lembre-se de utilizar repeticoes: for ou while

 */
public class CadastraPessoas {

    private static Scanner leitor = new Scanner(System.in);

    private static String[] cadastrarNomes(int quantidadeDeNomes) {
        String[] nomes = new String[quantidadeDeNomes];

        for (int i = 0; i < quantidadeDeNomes; i++) {
            System.out.printf("\nPreencha o %d nome: \n", i + 1);
            String nome = leitor.next();
            nomes[i] = nome;
        }

        return nomes;
    }

    public static void main(String[] args) {
        System.out.println("Preencha o nome do administrador: ");
        String nomeAdministrador = leitor.nextLine();

        System.out.println("Digite quantos nomes deseja cadastrar: ");
        int quantidadeNomes = leitor.nextInt();

        String[] nomesCadastrados = cadastrarNomes(quantidadeNomes);

        System.out.println("Administrador: " + nomeAdministrador);
        System.out.println(Arrays.toString(nomesCadastrados));
    }

}
