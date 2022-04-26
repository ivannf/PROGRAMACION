public class Main {
    public static void main(String[] args) {
        Trabajadores t1 = new Trabajadores("111111H","Pepe","Ruiz",34,"Bachillerato");
        Trabajadores t2 = new Trabajadores("222222H","Luis","Rodriguez",17,"Grado Superior");
        Trabajadores t3 = new Trabajadores("333333H","Rosa","Fernandez",67,"Grado Universitario");
        Trabajadores t4 = new Trabajadores("444444H","Paco","Nuñez",56,"Grado Universitario");
        Trabajadores t5 = new Trabajadores("555555H","Lucia","Hernandez",9,"Bachillerato");
        Trabajadores t6 = new Trabajadores("666666H","Maria","Muñoz",23,"Grado Medio");
        Trabajadores t7 = new Trabajadores("777777H","Adrian","Gonzalez",49,"Bachillerato");
        Trabajadores t8 = new Trabajadores("888888H","Roberto","Carrasco",73,"Grado Superior");
        Trabajadores t9 = new Trabajadores("999999H","Alberto","Segura",81,"Grado Medio");
        Trabajadores t10 = new Trabajadores("1010101H","Lola","Oliver",38,"Bachillerato");


        Oferta o1 = new Oferta(3232,"Prueba",false);
        Oferta o2 = new Oferta(3233,"Prueba",false);
        Oferta o3 = new Oferta(3234,"Prueba",false);
        Oferta o4 = new Oferta(3235,"Prueba",false);
        Oferta o5 = new Oferta(3236,"Prueba",false);
        SAE sae1 = new SAE();


        sae1.addOferta(o1);
        sae1.addOferta(o2);
        sae1.addOferta(o3);
        sae1.addOferta(o4);
        sae1.addOferta(o5);

        sae1.addTrabajador(3232,t1);
        sae1.addTrabajador(3232,t5);

        /*sae1.removeTrabajador(3232,t1);*/

        sae1.mostrarTrabajadores(3232);

        sae1.mostrarTrabajadoresXEdad(3232);

        sae1.guardarDatos();
        sae1.cargarDatos();


    }
}
