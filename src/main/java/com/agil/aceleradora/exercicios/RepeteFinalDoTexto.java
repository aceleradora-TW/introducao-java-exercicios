package com.agil.aceleradora.exercicios;

/*
Implemente o método repetir, que recebe como argumento uma String e um número inteiro.
O método deve retornar uma nova String contendo a junção dos n últimos caracteres da string recebida repetidos n vezes,
onde n é o número passado como argumento para o método.

Exemplos de entrada e saida:

repetir("teste", 2); // retorna "tete"

repetir("coca-cola", 3); // retorna "olaolaola"

repetir("oi", 0); // retorna ""

repetir("pepsi", 5); // retorna "pepsipepsipepsipepsipepsi"
 */
public class RepeteFinalDoTexto {

    public static String repetir(String texto, int repeticoes) {
        return repeticoes == 0
                ? ""
                : texto
                .substring(texto.length() - repeticoes)
                .repeat(repeticoes);
    }

    public static String repetirManual(String texto, int repeticoes) {
        if (repeticoes == 0) {
            return "";
        }

        String pedaco = texto.substring(texto.length() - repeticoes);

        String resultado = "";
        for (int i = 0; i < repeticoes; i++) {
            resultado += pedaco;
        }

        return resultado;
    }

    public static void main(String[] args) {
        System.out.println(repetir("teste", 2));
        System.out.println(repetir("coca-cola", 3));
        System.out.println(repetir("oi", 0));
        System.out.println(repetir("pepsi", 5));
        System.out.println("-------------------------");
        System.out.println(repetirManual("teste", 2));
        System.out.println(repetirManual("coca-cola", 3));
        System.out.println(repetirManual("oi", 0));
        System.out.println(repetirManual("pepsi", 5));
    }
}
