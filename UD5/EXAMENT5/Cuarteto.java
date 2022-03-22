package com.company;

import java.util.Objects;

public class Cuarteto extends AgrupacionOficial implements Callejera{
    private Integer numeroMiembros;
    private Integer puntosObtenidos;

    public Cuarteto(String nombre, String autor, String autorMusica, String autorLetra, String tipo, Integer numeroMiembros, Integer puntosObtenidos) {
        super(nombre, autor, autorMusica, autorLetra, tipo);
        this.numeroMiembros = numeroMiembros;
        this.puntosObtenidos = puntosObtenidos;
    }

    public Integer getNumeroMiembros() {
        return numeroMiembros;
    }

    public void setNumeroMiembros(Integer numeroMiembros) {
        this.numeroMiembros = numeroMiembros;
    }

    public Integer getPuntosObtenidos() {
        return puntosObtenidos;
    }

    public void setPuntosObtenidos(Integer puntosObtenidos) {
        this.puntosObtenidos = puntosObtenidos;
    }

    @Override
    public void camino_del_falla() {
        System.out.println("El cuarteto "+this.getNombre()+" va caminito del falla");
    }

    @Override
    public String toString() {
        return "Cuarteto{" +
                super.toString() +
                "numeroMiembros=" + numeroMiembros +
                ", puntosObtenidos=" + puntosObtenidos +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cuarteto cuarteto = (Cuarteto) o;
        return numeroMiembros.equals(cuarteto.numeroMiembros) && puntosObtenidos.equals(cuarteto.puntosObtenidos);
    }

    @Override
    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentacion del Cuarteto con nombre "+this.getNombre());
    }

    @Override
    public void hacer_tipo() {
        System.out.println("El cuarteto "+this.getNombre()+" va de "+this.getTipo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numeroMiembros, puntosObtenidos);
    }

    @Override
    public void amo_a_escucha() {
        System.out.println("Amo a escucha el Cuarteto "+this.getNombre());
    }
}
