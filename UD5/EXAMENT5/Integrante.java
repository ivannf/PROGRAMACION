package com.company;

import java.util.Objects;

public class Integrante {
    private Integer numeroParticipante;
    private String nombre;
    private Integer edad;
    private String localidad;

    public Integrante(Integer numeroParticipante, String nombre, Integer edad, String localidad) {
        this.numeroParticipante = numeroParticipante;
        this.nombre = nombre;
        this.edad = edad;
        this.localidad = localidad;
    }

    public Integer getNumeroParticipante() {
        return numeroParticipante;
    }

    public void setNumeroParticipante(Integer numeroParticipante) {
        this.numeroParticipante = numeroParticipante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    @Override
    public String toString() {
        return "Integrante{" +
                "numeroParticipante=" + numeroParticipante +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", localidad='" + localidad + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Integrante that = (Integrante) o;
        return numeroParticipante.equals(that.numeroParticipante);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroParticipante);
    }
}
