package com.company.Examen;

public class Main {
    public static void main(String[] args) {

        Examen examen1 = new Examen("IESALIXAR","ALIXAR.COM");

        Sedes sede1= new Sedes("1",Capitales.SEVILLA);
        Opositor opositor1= new Opositor("Ivan","Negron",2003,false,"no");
        Opositor opositor2= new Opositor("Miguel","Nuñez",2003,true,"ciudad");
        Preguntas pregunta1= new Preguntas("Suma 2+2");
        Opciones opcion1= new Opciones("si",true);
        Opciones opcion2= new Opciones("si",false);
        Opciones opcion3= new Opciones("si",true);
        Preguntas pregunta2= new Preguntas("suma 4+4");
        Opciones opcion4= new Opciones("si",true);
        Opciones opcion5= new Opciones("si",false);
        Opciones opcion6= new Opciones("si",true);

        Sedes sede2= new Sedes("2",Capitales.HUELVA);
        Opositor opositor3= new Opositor("Manuel","Jaen",2003,false,"no");
        Opositor opositor4= new Opositor("Angel","Gonzalez",2002,true,"ciudad");
        Preguntas pregunta3= new Preguntas("Suma 2+2");
        Opciones opcion7= new Opciones("si",true);
        Opciones opcion8= new Opciones("si",false);
        Opciones opcion9= new Opciones("si",true);
        Preguntas pregunta4= new Preguntas("suma 4+4");
        Opciones opcion10= new Opciones("si",true);
        Opciones opcion11= new Opciones("si",false);
        Opciones opcion12= new Opciones("si",true);


    }
}
