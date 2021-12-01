package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] v1 = {1, 2, 3, 4, 5, 6};
        int[] v2 = {3, 9, 12, 5, 7};


        System.out.println("v1: " + Arrays.toString(v1));
        System.out.println("v2: " + Arrays.toString(v2));

        System.out.println("Resultado: ");

    }

    public static int[] interseccionVectores(int[] a, int[] b) {
        int[] resultado = new int[0];
        for (int i = 0; i < a.length; i++) {

        }
        return resultado;
    }

    public static boolean esta(int num, int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (num == a[i]) {
                return true;
            }
        }
        return false;
    }
}
