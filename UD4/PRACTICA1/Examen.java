package com.company.Examen;

import java.util.Arrays;
import java.util.Calendar;

public class Examen {

    private Preguntas[] preguntas;
    private Calendar fecha;
    private String consejeria;
    private String url;
    private Sedes[] sede;

    public Examen(String consejeria, String url) {
        this.preguntas = new Preguntas[0];
        this.fecha = Calendar.getInstance();
        this.consejeria = consejeria;
        this.url = url;
        this.sede = new Sedes[0];
    }

    public Preguntas[] getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(Preguntas[] preguntas) {
        this.preguntas = preguntas;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public String getConsejeria() {
        return consejeria;
    }

    public void setConsejeria(String consejeria) {
        this.consejeria = consejeria;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Sedes[] getSede() {
        return sede;
    }

    public void setSede(Sedes[] sede) {
        this.sede = sede;
    }

    public boolean addSedes(Sedes sedeAñadida){
        Sedes[] resultado= Arrays.copyOf(sede,sede.length+1);
        resultado[resultado.length-1]= sedeAñadida;
        sede= resultado;
        return true;
    }



    public boolean addPreguntas(Preguntas preguntasAñadida){
        if (preguntas.length<100) {
            Preguntas[] resultado = Arrays.copyOf(preguntas, preguntas.length + 1);
            resultado[resultado.length - 1] = preguntasAñadida;
            preguntas = resultado;
            return true;
        }
        return false;
    }

    public void mostrar_informacion(){
        System.out.println(Arrays.toString(preguntas));
        System.out.println(fecha);
        System.out.println(consejeria);
        System.out.println(url);
        System.out.println(Arrays.toString(sede));
    }


    @Override
    public String toString() {
        return "Examen{" +
                "preguntas=" + Arrays.toString(preguntas) +
                ", fecha=" + fecha +
                ", consejeria='" + consejeria + '\'' +
                ", url='" + url + '\'' +
                ", sede=" + Arrays.toString(sede) +
                '}';
    }
}
