package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Introduce el tamaño de la matriz: ");
        int tamaño= sc.nextInt();

        int[][] matriz= new int[tamaño][tamaño];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j]= (int)(Math.random()*(201-100)+100);
            }
        }

        for (int[] row:matriz) {
            System.out.println(Arrays.toString(row));
        }
    }
    public static int numPicos(int[][] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {

            }
        }
        return 0;
    }
}
