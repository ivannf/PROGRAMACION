package com.company.Practica2;

import java.util.Calendar;
import java.util.Objects;

public class LocalComercial extends Local implements PrecioVenta{
    private String actividad;

    public LocalComercial(Integer year, String direccion, Integer metros, Double precio, String actividad) {
        super(year, direccion, metros, precio);
        this.actividad = actividad;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    @Override
    public void mostrarPropiedad() {
        System.out.println("Se esta llamando desde la clase LocalComercial");
        System.out.println(Calendar.getInstance());
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "LocalComercial{" +
                super.toString()+
                "actividad='" + actividad + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        LocalComercial that = (LocalComercial) o;
        return actividad.equals(that.actividad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), actividad);
    }

    @Override
    public void mostrarPrecioVenta() {
        System.out.println("Soy un LocalComercial que me dedico a "+actividad+" y valgo "+getPrecio());
    }
}
