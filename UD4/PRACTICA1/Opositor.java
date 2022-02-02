package com.company.Examen;

import java.util.Objects;

public class Opositor {

    private String nombre;
    private String apellidos;
    private Integer añoNacimiento;
    private boolean adaptacion;
    private String descripcionAdaptacion;

    public Opositor(String nombre, String apellidos, Integer añoNacimiento, boolean adaptacion, String descripcionAdaptacion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.añoNacimiento = añoNacimiento;
        this.adaptacion = adaptacion;
        if (adaptacion==true) {
            this.descripcionAdaptacion = descripcionAdaptacion;
        }else{
            this.descripcionAdaptacion= null;
        }
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getAñoNacimiento() {
        return añoNacimiento;
    }

    public void setAñoNacimiento(Integer añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }

    public boolean isAdaptacion() {
        return adaptacion;
    }

    public void setAdaptacion(boolean adaptacion) {
        this.adaptacion = adaptacion;
    }

    public String getDescripcionAdaptacion() {
        return descripcionAdaptacion;
    }

    public void setDescripcionAdaptacion(String descripcionAdaptacion) {
        this.descripcionAdaptacion = descripcionAdaptacion;
    }

    public void mostrar_informacion(){
        System.out.println(nombre);
        System.out.println(apellidos);
        System.out.println(añoNacimiento);
        System.out.println(adaptacion);
        System.out.println(descripcionAdaptacion);
    }

    @Override
    public String toString() {
        return "Opositor{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", añoNacimiento=" + añoNacimiento +
                ", adaptacion=" + adaptacion +
                ", descripcionAdaptacion='" + descripcionAdaptacion + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Opositor opositor = (Opositor) o;
        return adaptacion == opositor.adaptacion && nombre.equals(opositor.nombre) && apellidos.equals(opositor.apellidos) && añoNacimiento.equals(opositor.añoNacimiento) && descripcionAdaptacion.equals(opositor.descripcionAdaptacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellidos, añoNacimiento, adaptacion, descripcionAdaptacion);
    }
}
