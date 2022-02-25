package com.company.Practica2;

import java.util.Arrays;
import java.util.Comparator;

public class Registro{
    private Propiedad[] propiedades;

    public Registro() {
        this.propiedades = new Propiedad[0];
    }

    public Propiedad[] getPropiedades() {
        return propiedades;
    }

    public void setPropiedades(Propiedad[] propiedades) {
        this.propiedades = propiedades;
    }

    public boolean addPropiedad(Propiedad propiedadAñadida){
        Propiedad[] resultado = Arrays.copyOf(propiedades,propiedades.length+1);
        resultado[resultado.length-1]= propiedadAñadida;
        propiedades=resultado;
        return true;
    }

    public boolean removePropiedad(Propiedad removePropiedad) {
        if (estaPropiedad(removePropiedad)) {
            Propiedad[] resultado = new Propiedad[0];
            for (int i = 0; i < propiedades.length; i++) {
                if (!propiedades[i].equals(removePropiedad)) {
                    resultado = Arrays.copyOf(propiedades, propiedades.length - 1);
                    resultado[resultado.length - 1] = propiedades[i];
                }
            }
            propiedades = resultado;
            return true;
        }
        return false;
    }

    public boolean estaPropiedad(Propiedad propiedad) {
        for (int i = 0; i < propiedades.length; i++) {
            if (propiedades[i].equals(propiedad)) {
                return true;
            }
        }
        return false;
    }

    public void informeSuperficie(){
        Arrays.sort(propiedades);
        System.out.println(Arrays.toString(propiedades));
    }

    public void informeAntiguedad(){
        Arrays.sort(propiedades, new Comparator<Propiedad>() {
            @Override
            public int compare(Propiedad p1, Propiedad p2) {
                if (p1.getYear()==p2.getYear()){
                    return p2.getMetros()-p1.getMetros();
                }
                return p1.getYear()-p2.getYear();
            }
        });
        System.out.println(Arrays.toString(propiedades));
    }

    @Override
    public String toString() {
        return "Registro{" +
                "propiedades=" + Arrays.toString(propiedades) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Registro registro = (Registro) o;
        return Arrays.equals(propiedades, registro.propiedades);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(propiedades);
    }
}
