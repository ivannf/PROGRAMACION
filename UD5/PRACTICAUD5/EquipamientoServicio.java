package com.company.Practica2;

import java.util.Calendar;
import java.util.Objects;

public class EquipamientoServicio extends Propiedad{
    private Servicio servicio;

    public EquipamientoServicio(Integer year, String direccion, Integer metros, Servicio servicio) {
        super(year, direccion, metros);
        this.servicio = servicio;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    @Override
    public void mostrarPropiedad() {
        System.out.println("Se esta llamando desde la clase EquipamientoServicio");
        System.out.println(Calendar.getInstance());
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "EquipamientoServicio{" +
                super.toString()+
                "servicio=" + servicio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        EquipamientoServicio that = (EquipamientoServicio) o;
        return servicio == that.servicio;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), servicio);
    }

}
