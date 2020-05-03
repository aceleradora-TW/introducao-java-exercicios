package com.agil.aceleradora.exercicios;

public class FizzBuzz {

    public String fizzBuzz(int numero) {
        // Implemente o codigo aqui:
        return null;
    }

    //  Codigo de teste. Nao eh necessario alterar:
    public static void main(String[] args) {
        FizzBuzz solucaoFizzBuzz = new FizzBuzz();

        String fizz = solucaoFizzBuzz.fizzBuzz(3);
        String buzz = solucaoFizzBuzz.fizzBuzz(5);
        String fizzBuzz = solucaoFizzBuzz.fizzBuzz(15);
        String sete = solucaoFizzBuzz.fizzBuzz(7);

        if (!"Fizz".equals(fizz)) {
            System.err.printf("'Fizz' esta errado. Retornou: '%s'\n", fizz);
        }

        if (!"Buzz".equals(buzz)) {
            System.err.printf("'Buzz' esta errado. Retornou: '%s'\n", buzz);
        }

        if (!"com.agil.aceleradora.exercicios.FizzBuzz".equals(fizzBuzz)) {
            System.err.printf("'com.agil.aceleradora.exercicios.FizzBuzz' esta errado. Retornou: '%s'\n", fizzBuzz);
        }

        if (!"7".equals(sete)) {
            System.err.printf("'7' esta errado. Retornou: '%s'\n", sete);
        }
    }
}
