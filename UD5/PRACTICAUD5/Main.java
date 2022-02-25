package com.company.Practica2;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        // Personas
        Persona p1 = new Persona("6373988H","Manuel","Rodriguex");
        Persona p2 = new Persona("7372647H","Rosa","Perez");
        Persona p3 = new Persona("5325324H","Manolo","Gonzalez");
        Persona p4 = new Persona("7535447H","Paco","Munian");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

        //Viviendas
        Vivienda v1 = new Vivienda(6,"Los palacios",9,3,2,2,1000.0);

        //Añadir y borrar personas
        v1.addPersona(p1);
        v1.addPersona(p2);
        System.out.println(v1);
        v1.removePersona(p1);
        System.out.println(v1);
        v1.mostrarPropiedad();
        v1.mostrarPrecioVenta();

        //LocalComercial
        LocalComercial lc1 = new LocalComercial(8,"Utrera",4,1050.0,"Tienda de ropa");

        lc1.mostrarPropiedad();
        lc1.mostrarPrecioVenta();

        //LocalIndustrial
        LocalIndustrial li1 = new LocalIndustrial(4,"Bormujos",7,1500.0,75);

        li1.mostrarPropiedad();
        li1.mostrarPrecioVenta();

        //EquipamientoServicio
        EquipamientoServicio es1 = new EquipamientoServicio(4,"Tomares",5, Servicio.EDUCATIVO);
        es1.mostrarPropiedad();

        //Registro
        Registro r1 = new Registro();

        //Añdir y borrar propiedades
        r1.addPropiedad(li1);
        r1.addPropiedad(lc1);
        r1.addPropiedad(v1);
        r1.addPropiedad(es1);
        System.out.println(r1);

        //OrdenarPorSuperficie
        r1.informeSuperficie();

        //OrdenarPorAntiguedad
        r1.informeAntiguedad();
    }

}
