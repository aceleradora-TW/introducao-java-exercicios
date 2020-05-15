package com.agil.aceleradora.exercicios;

/*

Implemente os metodos Abaixoo cumprindo cada um dos requisitos.

Teste os metodos no metodo main abaixo. Preste atencao
em quais deles sao estaticos e quais nao sao, lembre-se que
os metodos que nao sao estaticos necessitam ser chamados
atraves de um objeto.
 */
public class Calculos {

    // Implemente a soma de a + b
    public static int soma(int a, int b) {
        return a + b;
    }

    // Implemente a subtracao de a - b
    public int diferenca(int a, int b) {
        return a - b;
    }

    // Implemente a media aritmetica a, b, c
    // Formula: (a + b + c) / 3
    public float media(int a, int b, int c) {
        return (a + b + c) / 3;
    }

    // Distancia entre a e b
    // Distancia eh o resultado da subtracao sem sinal
    // Lembre-se do metodo Math.abs()
    public int distancia(int a, int b) {
        return Math.abs(diferenca(a, b));
    }

    // Retorna o maior entre a e b
    // Formula: (a + b + Math.abs(a - b)) / 2
    // Bonus: Pesquise um metodo da classe Math que faca o calculo acima.
    public static int maximo(int a, int b) {
        return (a + b + Math.abs(a - b)) / 2;
    }

    // Retorna o menor entre a e b
    // Formula: (a + b - Math.abs(a - b)) / 2
    // Bonus: Pesquise um metodo da classe Math que faca o calculo acima.
    public static int minimo(int a, int b) {
        return ((a + b) - Math.abs(a - b)) / 2;
    }

    // Teste os metodos aqui:
    public static void main(String[] args) {
        Calculos c = new Calculos();

        System.out.printf("Soma de 2 e 1: %d\n", Calculos.soma(2, 1));
        System.out.printf("Diferenca entre 2 e 1: %d\n", c.diferenca(2, 1));
        System.out.printf("Media de 1, 2 e 3: %.2f\n", c.media(2, 1, 3));
        System.out.printf("Distancia entre 1 e 3: %d\n", c.distancia(1, 3));
        System.out.printf("Maximo entre 1 e 3: %d\n", Calculos.maximo(1, 3));
        System.out.printf("Minimo entre 1 e 3: %d\n", Calculos.minimo(1, 3));
    }
}
