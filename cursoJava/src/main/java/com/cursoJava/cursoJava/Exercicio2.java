package com.cursoJava.cursoJava;
/*Faça um programa em Java para exibir a tabuada de 0 a 9.*/

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

            for(int x = 0; x <= 9; x++)
                for(int y = 0; y <= 9; y++)
                    System.out.println(x+"X"+y+"="+x*y);
        }
    }

