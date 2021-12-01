package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce las filas deseadas: ");
        int fils = sc.nextInt();

        System.out.println("Itroduce las columnas deseadas: ");
        int colums= sc.nextInt();

        System.out.println("Matriz inicial: ");

        int[][] v1 = new int[fils][colums];

        for (int i = 0; i < v1.length; i++) {
            for (int j = 0; j < v1[i].length; j++) {
                int randomNum = (int) (Math.random() * 20);
                v1[i][j] = randomNum;
            }
        }
        for (int[]row:v1) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println("Introduce el número de posiciones a desplazar: ");
        int Columna= sc.nextInt();

        System.out.println("La matriz desplazada es: ");
        for (int[]row:desplazarMatriz(Columna, v1)) {
            System.out.println(Arrays.toString(row));
        }
    }
    public static int[][] desplazarMatriz (int Colums, int[][] numero){
        int[][]resultado=new int[numero.length][numero[0].length];
        while (Colums>=numero[0].length){
            Colums-=numero[0].length;
        }
        for (int i = 0; i <numero.length; i++) {
            for (int j = 0; j <numero[i].length; j++) {
                if (j+Colums<numero[i].length){
                    resultado[i][j+Colums]=numero[i][j];
                }else {
                    resultado[i][j+Colums-numero[i].length]=numero[i][j];
                }
            }
        }
        return resultado;
    }
}
