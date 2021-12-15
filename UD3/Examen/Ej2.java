package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] v={1,2,3,4,5};

        System.out.println("Introduce el valor que desea introducir: ");
        int valor= sc.nextInt();

        System.out.println("Introduce la posicion en la que desea introducirlo: ");
        int posicion= sc.nextInt();

        System.out.println("El vector actual es: ");
        System.out.println(Arrays.toString(v));
        System.out.println("El nuevo vector es: ");
        System.out.println(Arrays.toString(insertarValor(v,valor,posicion)));

    }

    public static int[] insertarValor(int[] v, int valor, int posicion){
        int[] resultado= new int[v.length+1];

        for (int i = 0; i < v.length; i++) {

                resultado = Arrays.copyOf(v, v.length + 1);
            for (int j = resultado.length-1; j > posicion ; j--) {
                resultado[j]=resultado[j-1];
            }
                resultado[posicion] = valor;

        }
        return resultado;
    }
}
