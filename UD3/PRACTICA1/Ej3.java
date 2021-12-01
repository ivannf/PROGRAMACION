package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce el tamaño deseado: ");
        int medida=sc.nextInt();

        int[][] vector=new int[medida][medida];

        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector[i].length; j++) {
                int randomNum = (int)(Math.random() * (66-18)+18);
                vector[i][j]=randomNum;
            }
        }

        for (int[] row:vector) {
            System.out.println(Arrays.toString(row));
        }

        int[] diagonal=new int[vector.length];

        for(int i=0;i<vector.length;i++){
            for(int j=0;j<vector[i].length;j++){
                if(i==j){
                    diagonal[i] = vector[i][j];
                }
            }
        }
        System.out.println("La diagonal es:"+Arrays.toString(diagonal));

        int min=diagonal[0];
        int max=diagonal[0];
        for (int i = 0; i < vector.length ; i++) {
            if (diagonal[i]>max){
                max=diagonal[i];
            }else if (diagonal[i]<min){
                min=diagonal[i];
            }
        }

        int suma=0;

        for (int i = 0; i < diagonal.length; i++) {
            suma+=diagonal[i];
        }

        int media=suma/ diagonal.length;

        System.out.println("El máximo es: "+max);
        System.out.println("El mínimo es: "+min);
        System.out.println("La media es: "+media);
    }
}

