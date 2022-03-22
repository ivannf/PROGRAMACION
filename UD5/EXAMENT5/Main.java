package com.company;

public class Main {
    public static void main(String[] args) {

        /* Creacion de agrupaciones*/
        Chirigota c1 = new Chirigota("Juanito el de los palotes","Juanito","Juanito","Juanito","Payasos",2,3);
        Comparsa co1 = new Comparsa("Arcoiris universal","Marcos","Alberto","Alberto","Elfos","Accenture",5);
        Coro cor1 = new Coro("Los chicos del coro","Luis","Luis","Luis","Estudiantes",3,4,8);
        Cuarteto cu1 = new Cuarteto("La era de los dinosaurios","Adrian","Adrian","Adrian","Dinosaurios",10,4);
        Romancero r1 = new Romancero("Romeo y Julieta","Pepe","Pepe","Pepe","Humanos","Amor");

       /* Metodos cantar y hacer */
        c1.cantar_la_presentacion();
        c1.hacer_tipo();
        System.out.println();
        co1.cantar_la_presentacion();
        co1.hacer_tipo();
        System.out.println();
        cor1.cantar_la_presentacion();
        cor1.hacer_tipo();
        System.out.println();
        cu1.cantar_la_presentacion();
        cu1.hacer_tipo();
        System.out.println();
        r1.cantar_la_presentacion();
        r1.hacer_tipo();

        /*Integrantes*/
        Integrante i1 = new Integrante(10,"Juan",12,"Castilleja");
        Integrante i2 = new Integrante(11,"Carla",17,"Bormujos");

        /*Añade integrante*/
        System.out.println();
        c1.insertar_integrante(i1);
        c1.insertar_integrante(i2);
        System.out.println(c1);

        /* Elimina integrante*/
        c1.eliminar_integrante(i1);
        System.out.println(c1);

        /*Interfaz callejera*/
        System.out.println();
        c1.amo_a_escucha();
        cu1.amo_a_escucha();
        r1.amo_a_escucha();

        /*Metodo caminito falla*/
        System.out.println();
        c1.camino_del_falla();
        co1.camino_del_falla();
        cor1.camino_del_falla();
        cu1.camino_del_falla();

        /* metodos COAC*/
        COAC coac1 = new COAC();

        /*Inscribir agrupacion*/
        System.out.println();
        coac1.inscribir_agrupacion(c1);
        coac1.inscribir_agrupacion(co1);
        System.out.println(coac1);

        /* Eliminar agrupacion*/
        coac1.eliminar_agrupacion(c1);
        System.out.println(coac1);
    }
}
