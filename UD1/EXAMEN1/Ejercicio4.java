package com.company;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        Double altura, anchura;
        String bordado;
        Double cm2;
        Double preciobandera;
        Double preciobordado=0.0;
        Double preciosinbordar= 0.0;
        Double envio=3.25;
        Double preciototal=0.0;

        System.out.println("Introduzca la altura de la bandera en cm: ");
        altura= teclado.nextDouble();
        System.out.println("Ahora introduzca la anchura: ");
        anchura= teclado.nextDouble();

        cm2= altura*anchura;
        preciobandera= cm2/100;

        teclado.nextLine();
        System.out.println("¿Quieres escudo bordado? (s/n): ");
        bordado= teclado.nextLine();

        if (bordado.equals("s")){
            preciobordado+=2.50;
        }

        preciototal= preciobandera+preciobordado+envio;


        System.out.println("Gracias. Aquí tiene el desglose de su compra.");
        System.out.println("Bandera de "+cm2+"cm2: "+preciobandera+" €");
        if (bordado.equals("s")){
            System.out.println("Con escudo: "+preciobordado+" €");
        }else{
            System.out.println("Sin escudo: "+preciosinbordar+" €");
        }
        System.out.println("Gastos de envío: "+envio+" €");
        System.out.println("Total: "+preciototal+" €");
    }
}
