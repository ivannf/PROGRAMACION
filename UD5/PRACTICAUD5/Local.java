package com.company.Practica2;

import java.util.Arrays;
import java.util.Objects;

public abstract class Local extends Propiedad{
    private Persona[] propietario;
    private Double precio;

    public Local(Integer year,String direccion, Integer metros, Double precio) {
        super(year,direccion,metros);
        this.propietario = new Persona[0];
        this.precio = precio;
    }

    public Persona[] getPropietario() {
        return propietario;
    }

    public void setPropietario(Persona[] propietario) {
        this.propietario = propietario;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Local{" +
                "propietario=" + Arrays.toString(propietario) +
                ", precio=" + precio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Local local = (Local) o;
        return Arrays.equals(propietario, local.propietario) && precio.equals(local.precio);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(precio);
        result = 31 * result + Arrays.hashCode(propietario);
        return result;
    }
}
