package com.company;

import java.util.Scanner;

public class EjercicioZ {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int altura;
        int nmx=0;
        int nme=0;

        System.out.println("Introduce la altura:");
        altura= teclado.nextInt();
        nme=altura-1;

        for (int i = 0; i < altura; i++) {
            if (i==0 || i==altura-1){
                System.out.print("*");
            }else {
                for (int j = 0; j < nme; j++) {
                    System.out.print("-");
                }
            }
            for (int j = 0; j < altura-1; j++) {
                System.out.print("*");
            }
            nme--;
            System.out.println();
          }
        }
    }

