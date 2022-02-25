package com.company.Practica2;

import java.util.Calendar;
import java.util.Objects;

public class LocalIndustrial extends Local implements PrecioVenta{
    private Integer consumo;

    public LocalIndustrial(Integer year, String direccion, Integer metros, Double precio, Integer consumo) {
        super(year, direccion, metros, precio);
        this.consumo = consumo;
    }

    public Integer getConsumo() {
        return consumo;
    }

    public void setConsumo(Integer consumo) {
        this.consumo = consumo;
    }

    @Override
    public void mostrarPropiedad() {
        System.out.println("Se esta llamando desde la clase LocalIndustrial");
        System.out.println(Calendar.getInstance());
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "LocalIndustrial{" +
                super.toString() +
                "consumo=" + consumo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        LocalIndustrial that = (LocalIndustrial) o;
        return consumo.equals(that.consumo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), consumo);
    }

    @Override
    public void mostrarPrecioVenta() {
        System.out.println("Soy un LocalIndustrial con un consumo máximo de "+consumo+" y valgo "+getPrecio());
    }
}
