package com.company.Practica2;

import java.util.Objects;

public abstract class Propiedad implements Comparable<Propiedad>{
    private Integer year;
    private String direccion;
    private Integer metros;
    private static Integer contadorPropiedades=0;

    public Propiedad(Integer year, String direccion, Integer metros) {
        this.year = year;
        this.direccion = direccion;
        this.metros = metros;
        Propiedad.contadorPropiedades++;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getMetros() {
        return metros;
    }

    public void setMetros(Integer metros) {
        this.metros = metros;
    }

    public static Integer getContadorPropiedades() {
        return contadorPropiedades;
    }

    public static void setContadorPropiedades(Integer contadorPropiedades) {
        Propiedad.contadorPropiedades = contadorPropiedades;
    }

    public abstract void mostrarPropiedad();

    @Override
    public int compareTo(Propiedad o) {
        Propiedad p = (Propiedad) o;
        return this.metros- p.getMetros();
    }



    @Override
    public String toString() {
        return "Propiedad{" +
                "year=" + year +
                ", direccion='" + direccion + '\'' +
                ", metros=" + metros +
                "\n"+
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Propiedad propiedad = (Propiedad) o;
        return year.equals(propiedad.year) && direccion.equals(propiedad.direccion) && metros.equals(propiedad.metros);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, direccion, metros);
    }
}
