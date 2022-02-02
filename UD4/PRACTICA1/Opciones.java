package com.company.Examen;

import java.util.Arrays;

public class Opciones {

    private int[] opciones;
    private String respuestaTexto;
    private boolean respuesta;

    public Opciones(String respuestaTexto, boolean respuesta) {
        this.opciones = new int[3];
        this.respuestaTexto = respuestaTexto;
        this.respuesta = respuesta;
    }

    public int[] getOpciones() {
        return opciones;
    }

    public void setOpciones(int[] opciones) {
        this.opciones = opciones;
    }

    public String getRespuestaTexto() {
        return respuestaTexto;
    }

    public void setRespuestaTexto(String respuestaTexto) {
        this.respuestaTexto = respuestaTexto;
    }

    public boolean isRespuesta() {
        return respuesta;
    }

    public void setRespuesta(boolean respuesta) {
        this.respuesta = respuesta;
    }

    public void mostrar_informacion(){
        System.out.println(Arrays.toString(opciones));
        System.out.println(respuestaTexto);
        System.out.println(respuesta);
    }

    @Override
    public String toString() {
        return "Opciones{" +
                "opciones=" + Arrays.toString(opciones) +
                ", respuestaTexto='" + respuestaTexto + '\'' +
                ", respuesta=" + respuesta +
                '}';
    }
}
