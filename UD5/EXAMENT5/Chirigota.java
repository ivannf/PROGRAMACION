package com.company;

import java.util.Arrays;
import java.util.Objects;

public class Chirigota extends AgrupacionOficial implements Callejera{
    private Integer numeroCuples;
    private Integer puntosObtenidos;

    public Chirigota(String nombre, String autor, String autorMusica, String autorLetra, String tipo, Integer numeroCuples, Integer puntosObtenidos) {
        super(nombre, autor, autorMusica, autorLetra, tipo);
        this.numeroCuples = numeroCuples;
        this.puntosObtenidos = puntosObtenidos;
    }

    public Integer getNumeroCuples() {
        return numeroCuples;
    }

    public void setNumeroCuples(Integer numeroCuples) {
        this.numeroCuples = numeroCuples;
    }

    public Integer getPuntosObtenidos() {
        return puntosObtenidos;
    }

    public void setPuntosObtenidos(Integer puntosObtenidos) {
        this.puntosObtenidos = puntosObtenidos;
    }

    @Override
    public void camino_del_falla() {
        System.out.println("La chirigota "+this.getNombre()+" va caminito del falla");
    }

    @Override
    public String toString() {
        return "Chirigota{" +
                super.toString() +
                "numeroCuples=" + numeroCuples +
                ", puntosObtenidos=" + puntosObtenidos +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Chirigota chirigota = (Chirigota) o;
        return numeroCuples.equals(chirigota.numeroCuples) && puntosObtenidos.equals(chirigota.puntosObtenidos);
    }

    @Override
    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentación de la Chirigota con nombre "+this.getNombre());
    }

    @Override
    public void hacer_tipo() {
        System.out.println("La Chirigota "+this.getNombre()+" va de "+this.getTipo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numeroCuples, puntosObtenidos);
    }

    @Override
    public void amo_a_escucha() {
        System.out.println("Amo a escucha la Chirigota "+this.getNombre());
    }
}
