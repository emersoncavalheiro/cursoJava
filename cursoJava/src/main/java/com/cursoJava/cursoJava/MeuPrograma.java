package com.cursoJava.cursoJava;

import java.util.Scanner;

public class MeuPrograma {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");

        double numero1 = scanner.nextDouble();

        System.out.println("Digite o segundo numero: ");

        double numero2 = scanner.nextDouble();

        double resultadoFinal = numero1 + numero2;

        if (resultadoFinal > 30) {

            System.out.println("Valor maximo excedido!");
        }
        else{
            System.out.println("A soma dos numeros e: " + resultadoFinal);
        }
    }
}
