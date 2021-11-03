package com.company;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int numero;
        int numeroreverse=0;
        int numeroaux=0;

        System.out.println("Introduce un número: ");
        numero= teclado.nextInt();

        while (numero>0){
            numeroreverse= (numeroreverse*10)+(numero%10);
            numero/=10;
        }

        while (numeroreverse>0){
            numero= (numero*10)+(numeroreverse%10);
            numeroreverse/=10;

            for (int i = 0; i < numero; i++) {
                System.out.print("*");
            }
            System.out.print("_");

            numeroaux=numero;
            numero=0;
        }
    }
}
