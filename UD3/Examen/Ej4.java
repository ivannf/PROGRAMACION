package com.company;

import java.util.Arrays;

public class Ej4 {
    public static void main(String[] args) {
        int[][] matriz= new int[4][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j]= (int)(Math.random()*(100-10)+10);
            }
        }
        for (int[] row:matriz) {
            System.out.println(Arrays.toString(row));
        }

        for (int[] row: eliminarFilasPares(matriz)){
            System.out.println(Arrays.toString(row));
        }
    }

    public static int[][] eliminarFilasPares(int[][] matriz){
        int[][] resultado= new int[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

            }
        }
        return resultado;
    }
}
