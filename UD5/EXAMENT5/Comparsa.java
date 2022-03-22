package com.company;

import java.util.Objects;

public class Comparsa extends AgrupacionOficial{
    private String empresaAtrezzo;
    private Integer puntosObtenidos;

    public Comparsa(String nombre, String autor, String autorMusica, String autorLetra, String tipo, String empresaAtrezzo, Integer puntosObtenidos) {
        super(nombre, autor, autorMusica, autorLetra, tipo);
        this.empresaAtrezzo = empresaAtrezzo;
        this.puntosObtenidos = puntosObtenidos;
    }

    public String getEmpresaAtrezzo() {
        return empresaAtrezzo;
    }

    public void setEmpresaAtrezzo(String empresaAtrezzo) {
        this.empresaAtrezzo = empresaAtrezzo;
    }

    public Integer getPuntosObtenidos() {
        return puntosObtenidos;
    }

    public void setPuntosObtenidos(Integer puntosObtenidos) {
        this.puntosObtenidos = puntosObtenidos;
    }

    @Override
    public void camino_del_falla() {
        System.out.println("La comparsa "+this.getNombre()+" va caminito del falla");
    }

    @Override
    public String toString() {
        return "Comparsa{" +
                super.toString() +
                "empresaAtrezzo='" + empresaAtrezzo + '\'' +
                ", puntosObtenidos=" + puntosObtenidos +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Comparsa comparsa = (Comparsa) o;
        return empresaAtrezzo.equals(comparsa.empresaAtrezzo) && puntosObtenidos.equals(comparsa.puntosObtenidos);
    }

    @Override
    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentación de la Comparsa con nombre "+this.getNombre());
    }

    @Override
    public void hacer_tipo() {
        System.out.println("La comparsa "+this.getNombre()+" va de "+this.getTipo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), empresaAtrezzo, puntosObtenidos);
    }
}
