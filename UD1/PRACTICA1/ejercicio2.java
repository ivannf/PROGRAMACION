package com.company;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int numero,cifra;
        int numerofinal=0;
        int ocurrencias=0;

        System.out.println("Introduce un numero: ");
        numero= teclado.nextInt();
        System.out.println("Introduce una cifra: ");
        cifra= teclado.nextInt();

        for (int i = 0; i < numero; i++) {
            numerofinal= (numerofinal*10) + (numero%10);
            if (numerofinal==cifra){
                ocurrencias++;
            }
            numero/=10;

        }
        System.out.println("Hay "+ocurrencias+" ocurrencias");


    }
}
