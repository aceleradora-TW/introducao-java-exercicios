package com.agil.aceleradora.exercicios;

/*
Implemente o método contaOcorrencias, que recebe como argumento duas Strings:
  - uma frase
  - uma letra.

O método deve retornar quantas vezes a letra aparece no texto.

Exemplos de entrada e saida:

contaOcorrencias("bolo", "o"); // retorna 2

contaOcorrencias("batata", "a"); // retorna 3

contaOcorrencias("Alejandro", "a"); // retorna 1

contaOcorrencias("Uma Escola", "b"); // retorna 0

Observe que o metodo nao eh estatico, portanto, lembre-se de instanciar
a classe ContaOcorrencia para testar o metodo.
 */
public class ContaOcorrencias {

    private int contaOcorrencias(String frase, String conteudoBuscado) {
        String[] letras = frase.split("");

        int contador = 0;
        for (int i = 0; i < letras.length; i++) {
            if (letras[i].equals(conteudoBuscado)) {
                contador++;
            }
        }

        return contador;
    }

    private int contaOcorrenciasComForeach(String frase, String conteudoBuscado) {
        String[] letras = frase.split("");

        int contador = 0;
        for (String letra : letras) {
            if (letra.equals(conteudoBuscado)) {
                contador++;
            }
        }

        return contador;
    }

    public static void main(String[] args) {
        ContaOcorrencias co = new ContaOcorrencias();

        System.out.println(co.contaOcorrencias("Bolo", "o"));
        System.out.println(co.contaOcorrencias("Batata", "a"));
        System.out.println(co.contaOcorrencias("Alejandro", "a"));
        System.out.println(co.contaOcorrencias("Uma Escola", "b"));
    }
}
