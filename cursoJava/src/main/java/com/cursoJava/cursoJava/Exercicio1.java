package com.cursoJava.cursoJava;

/*Escreva um programa em Java que lê 15 valores reais, encontra o maior e o menor deles e mostra
o resultado.*/

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int menorValor = 0;
        int maiorValor = 0;


        for(int i = 0; i < 5; i++) {
            System.out.println("Digite um numero: ");
            int numeroDigitado = scanner.nextInt();

            boolean ehAPimeiraVez = i == 0;

            if(ehAPimeiraVez) {
                maiorValor = numeroDigitado;
                menorValor = numeroDigitado;
            }

            if(maiorValor < numeroDigitado){
                maiorValor = numeroDigitado;
            }

            if(numeroDigitado < menorValor){
                menorValor = numeroDigitado;
            }
        }


        System.out.println("O maior valor digitado e: " + maiorValor);
        System.out.println("O menor valor digitado e: " + menorValor);

    }
}
