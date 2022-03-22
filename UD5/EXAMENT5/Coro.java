package com.company;

import java.util.Objects;

public class Coro extends AgrupacionOficial{
    private Integer numeroBandurrias;
    private Integer numeroGuitarras;
    private Integer puntosObtenidos;

    public Coro(String nombre, String autor, String autorMusica, String autorLetra, String tipo, Integer numeroBandurrias, Integer numeroGuitarras, Integer puntosObtenidos) {
        super(nombre, autor, autorMusica, autorLetra, tipo);
        this.numeroBandurrias = numeroBandurrias;
        this.numeroGuitarras = numeroGuitarras;
        this.puntosObtenidos = puntosObtenidos;
    }

    public Integer getNumeroBandurrias() {
        return numeroBandurrias;
    }

    public void setNumeroBandurrias(Integer numeroBandurrias) {
        this.numeroBandurrias = numeroBandurrias;
    }

    public Integer getNumeroGuitarras() {
        return numeroGuitarras;
    }

    public void setNumeroGuitarras(Integer numeroGuitarras) {
        this.numeroGuitarras = numeroGuitarras;
    }

    public Integer getPuntosObtenidos() {
        return puntosObtenidos;
    }

    public void setPuntosObtenidos(Integer puntosObtenidos) {
        this.puntosObtenidos = puntosObtenidos;
    }

    @Override
    public void camino_del_falla() {
        System.out.println("El coro "+this.getNombre()+" va caminito del falla");
    }

    @Override
    public String toString() {
        return "Coro{" +
                super.toString() +
                "numeroBandurrias=" + numeroBandurrias +
                ", numeroGuitarras=" + numeroGuitarras +
                ", puntosObtenidos=" + puntosObtenidos +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Coro coro = (Coro) o;
        return numeroBandurrias.equals(coro.numeroBandurrias) && numeroGuitarras.equals(coro.numeroGuitarras) && puntosObtenidos.equals(coro.puntosObtenidos);
    }

    @Override
    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentacion del Coro con nombre "+this.getNombre());
    }

    @Override
    public void hacer_tipo() {
        System.out.println("El coro "+this.getNombre()+" va de "+this.getTipo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numeroBandurrias, numeroGuitarras, puntosObtenidos);
    }
}
