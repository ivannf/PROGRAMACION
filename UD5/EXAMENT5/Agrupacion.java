package com.company;

import java.util.Comparator;
import java.util.Objects;

public abstract class Agrupacion {
    private String nombre;
    private String autor;
    private String autorMusica;
    private String autorLetra;
    private String tipo;
    private static Integer contadorAgrupaciones=0;

    public Agrupacion(String nombre, String autor, String autorMusica, String autorLetra, String tipo) {
        this.nombre = nombre;
        this.autor = autor;
        this.autorMusica = autorMusica;
        this.autorLetra = autorLetra;
        this.tipo = tipo;
        contadorAgrupaciones++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutorMusica() {
        return autorMusica;
    }

    public void setAutorMusica(String autorMusica) {
        this.autorMusica = autorMusica;
    }

    public String getAutorLetra() {
        return autorLetra;
    }

    public void setAutorLetra(String autorLetra) {
        this.autorLetra = autorLetra;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Agrupacion{" +
                "nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                ", autorMusica='" + autorMusica + '\'' +
                ", autorLetra='" + autorLetra + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Agrupacion that = (Agrupacion) o;
        return nombre.equals(that.nombre) && autor.equals(that.autor) && autorMusica.equals(that.autorMusica) && autorLetra.equals(that.autorLetra) && tipo.equals(that.tipo);
    }

    public abstract void cantar_la_presentacion();

    public abstract void hacer_tipo();

    @Override
    public int hashCode() {
        return Objects.hash(nombre, autor, autorMusica, autorLetra, tipo);
    }
}
