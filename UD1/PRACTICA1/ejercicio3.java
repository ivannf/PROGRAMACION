package com.company;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int entradas;
        String dia;
        String tarjeta;
        float precio = 0;
        float preciopareja = 0;
        int entradasfinal=0;
        float descuento=0;
        float preciofinal=0;

        System.out.println("Numero de entradas:");
        entradas = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Dia de la semana: ");
        dia = teclado.nextLine();
        System.out.println("Tienes tarjeta (si/no): ");
        tarjeta = teclado.nextLine();

        if (dia.equals("Miercoles")) {
            precio = entradas * 5;
        } else if (dia.equals("Jueves")) {
            if (entradas%2==0) {
                entradasfinal = entradas / 2;
                precio = entradasfinal * 11;
            }else{
                entradasfinal = entradas / 2;
                precio = entradasfinal * 11;

                entradas=entradas-(entradasfinal*2);
                entradas= entradas*8;

                precio=precio+entradas;
            }
            } else {
                precio = entradas * 8;
            }

            if (tarjeta.equals("Si")){
                descuento= (precio*10)/100;
                preciofinal= precio-descuento;
            }
        System.out.println("Precio total= "+precio+" €");
        System.out.println("Descuento "+descuento+" €");
        System.out.println("A pagar "+preciofinal+" €");
        }
    }

