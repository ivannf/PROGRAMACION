package com.company.Practica2;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Objects;

public class Vivienda extends Propiedad implements PrecioVenta{
    private Integer numBanhos;
    private Integer numHabitaciones;
    private Integer capacidad;
    private Double precio;
    private Persona[] numPersonas;

    public Vivienda(Integer year, String direccion, Integer metros, Integer numBanhos, Integer numHabitaciones, Integer capacidad, Double precio) {
        super(year, direccion, metros);
        this.numBanhos = numBanhos;
        this.numHabitaciones = numHabitaciones;
        this.capacidad = capacidad;
        this.precio = precio;
        this.numPersonas = new Persona[0];
    }

    public Integer getNumBanhos() {
        return numBanhos;
    }

    public void setNumBanhos(Integer numBanhos) {
        this.numBanhos = numBanhos;
    }

    public Integer getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(Integer numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Persona[] getNumPersonas() {
        return numPersonas;
    }

    public void setNumPersonas(Persona[] numPersonas) {
        this.numPersonas = numPersonas;
    }

    public boolean addPersona(Persona personaAñadida) {
        if (numPersonas.length < capacidad && !estaPersona(personaAñadida)) {
            Persona[] resultado = Arrays.copyOf(numPersonas, numPersonas.length + 1);
            resultado[resultado.length - 1] = personaAñadida;
            numPersonas = resultado;
            return true;
        }
        return false;
    }

    public boolean removePersona(Persona personaRemovida) {
        if (estaPersona(personaRemovida)) {
            Persona[] resultado = new Persona[0];
            for (int i = 0; i < numPersonas.length; i++) {
                if (!numPersonas[i].equals(personaRemovida)) {
                    resultado = Arrays.copyOf(numPersonas, numPersonas.length - 1);
                    resultado[resultado.length - 1] = numPersonas[i];
                }
            }
            numPersonas = resultado;
            return true;
        }
        return false;
    }

    public boolean estaPersona(Persona persona) {
        for (int i = 0; i < numPersonas.length; i++) {
            if (numPersonas[i].equals(persona)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void mostrarPropiedad() {
        System.out.println("Se esta llamando desde la clase Vivienda");
        System.out.println(Calendar.getInstance());
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Vivienda{" +
                super.toString()+
                "numBanhos=" + numBanhos +
                ", numHabitaciones=" + numHabitaciones +
                ", capacidad=" + capacidad +
                ", precio=" + precio +
                ", numPersonas=" + Arrays.toString(numPersonas) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Vivienda vivienda = (Vivienda) o;
        return numBanhos.equals(vivienda.numBanhos) && numHabitaciones.equals(vivienda.numHabitaciones) && capacidad.equals(vivienda.capacidad) && precio.equals(vivienda.precio) && Arrays.equals(numPersonas, vivienda.numPersonas);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(super.hashCode(), numBanhos, numHabitaciones, capacidad, precio);
        result = 31 * result + Arrays.hashCode(numPersonas);
        return result;
    }

    @Override
    public void mostrarPrecioVenta() {
        System.out.println("Soy una Vivienda con capacidad máxima "+capacidad+" y valgo "+precio);
    }
}
