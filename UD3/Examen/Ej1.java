package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int tm1,tm2;

        System.out.println("Introduce el tamaño de v1: ");
        tm1= sc.nextInt();

        System.out.println("Introduce el tamaño de v2: ");
        tm2= sc.nextInt();

        int[] v1= new int[tm1];
        int[] v2= new int[tm2];

        for (int i = 0; i < v1.length; i++) {
            System.out.println("Introduce el valor "+i+" de v1: ");
            v1[i]=sc.nextInt();
        }


        for (int i = 0; i < v2.length; i++) {
            System.out.println("Introduce el valor "+i+" de v2: ");
            v2[i]=sc.nextInt();
        }

        System.out.println(Arrays.toString(v1));
        System.out.println(Arrays.toString(v2));

        System.out.println("La media de vectores es: ");
        System.out.println(Arrays.toString(mediaVectores(v1,v2)));
    }

    public static float[] mediaVectores(int[] v1, int[] v2){
        float [] resultado= new float[v1.length > v2.length ? v1.length : v2.length];
        float suma=0;

        if (v1.length == v2.length){

            for (int i = 0; i < v1.length; i++) {
                for (int j = 0; j < v2.length; j++) {
                    suma= v1[i]+v2[i];
                    resultado[i]=suma/2;
                }

                suma=0;
            }
            return resultado;
        }else{
            for (int i = 0; i < resultado.length-1; i++) {
                    suma= v1[i]+v2[i];
                    resultado[i]=suma/2;

                suma=0;

            }
        }
        return resultado;
    }
}
