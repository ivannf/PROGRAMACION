package com.company.Examen;

import java.util.Arrays;

public class Preguntas {

  private String enunciado;
  private Opciones[] opciones;

  public Preguntas(String enunciado) {
    this.enunciado = enunciado;
    this.opciones = new Opciones[0];
  }

  public String getEnunciado() {
    return enunciado;
  }

  public void setEnunciado(String enunciado) {
    this.enunciado = enunciado;
  }

  public Opciones[] getOpciones() {
    return opciones;
  }

  public void setOpciones(Opciones[] opciones) {
    this.opciones = opciones;
  }

  public boolean addOpciones(Opciones opcionAñadida) {
    if (opciones.length < 3) {
      Opciones[] resultado = Arrays.copyOf(opciones, opciones.length + 1);
      resultado[resultado.length - 1] = opcionAñadida;
      opciones = resultado;
      return true;
    }
    return false;
  }

  public void mostrar_informacion(){
    System.out.println(enunciado);
    System.out.println(Arrays.toString(opciones));
  }

  @Override
  public String toString() {
    return "Preguntas{" +
            "enunciado='" + enunciado + '\'' +
            ", opciones=" + Arrays.toString(opciones) +
            '}';
  }
}
