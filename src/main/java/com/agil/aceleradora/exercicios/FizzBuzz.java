package com.agil.aceleradora.exercicios;

public class FizzBuzz {

    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";

    public String fizzBuzz(int numero) {
        boolean ehFizz = numero % 3 == 0;
        boolean ehBuzz = numero % 5 == 0;

        if (ehFizz && ehBuzz) {
            return FIZZ + BUZZ;
        }

        if (ehFizz) {
            return FIZZ;
        }

        if (ehBuzz) {
            return BUZZ;
        }

        return Integer.toString(numero);
    }

    //  Codigo de teste. Nao eh necessario alterar:
    public static void main(String[] args) {
        FizzBuzz fb = new FizzBuzz();

        for (int i = 0; i < 50; i++) {
            System.out.printf("FizzBuzz %d: %s\n", i, fb.fizzBuzz(i));
        }

    }
}
