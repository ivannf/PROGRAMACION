package com.company;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int numero;
        int numerofinal=0;

        do {
            System.out.println("Introduce el numero: ");
            numero= teclado.nextInt();

            numerofinal= (numerofinal*10) + (numero%10);
            numero/=10;

        }while(numero==0);
    }
}
