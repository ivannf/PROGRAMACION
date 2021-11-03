package com.company;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int altura;


        do {
            System.out.println("Por favor, introduce la altura del árbol: ");
            altura= teclado.nextInt();
        }while(altura<4);

        int nme= altura-3;
        int nmx=1;


        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < nme; j++) {
                System.out.print(" ");

            }

            for (int j = 0; j < nmx; j++) {
                if (j==0 && i==0){
                    System.out.print("*");
                }
                if (j==altura-1 && i==altura-1){
                    System.out.print("Y");
                }
                if (j==1 || i==altura-2 || j== nmx-2){
                    System.out.print("^");
                }else{
                    System.out.print(" ");
                }
            }

            nmx+=2;
            nme--;
            System.out.println();
        }
    }
}
