package com.company.Examen;

import java.util.Arrays;

public class Sedes {

    private String codigoSede;
    private Capitales capitales;
    private Opositor[] maxOpositores;

    public Sedes(String codigoSede, Capitales capitales) {
        this.codigoSede = codigoSede;
        this.capitales = capitales;
        this.maxOpositores = new Opositor[0];
    }

    public String getCodigoSede() {
        return codigoSede;
    }

    public void setCodigoSede(String codigoSede) {
        this.codigoSede = codigoSede;
    }

    public Capitales getCapitales() {
        return capitales;
    }

    public void setCapitales(Capitales capitales) {
        this.capitales = capitales;
    }

    public Opositor[] getMaxOpositores() {
        return maxOpositores;
    }

    public void setMaxOpositores(Opositor[] maxOpositores) {
        this.maxOpositores = maxOpositores;
    }

    private boolean estaOpositor(Opositor opositor) {
        for (int i = 0; i < maxOpositores.length; i++) {
            if (maxOpositores[i].equals(opositor)) {
                return true;
            }
        }
        return false;
    }

    public boolean addOpositor(Opositor opositorAñadido){
        if (!estaOpositor(opositorAñadido)) {
            Opositor[] resultado= Arrays.copyOf(maxOpositores,maxOpositores.length+1);
            resultado[resultado.length-1]= opositorAñadido;
            maxOpositores= resultado;
            return true;
        }
        return false;
    }

    public boolean removeOpositor(Opositor opositorRemovido) {
        if (estaOpositor(opositorRemovido)) {
            Opositor[] resultado = new Opositor[0];
            for (int i = 0; i < maxOpositores.length ; i++) {
                if (!maxOpositores[i].equals(opositorRemovido)) {
                    resultado = Arrays.copyOf(maxOpositores,maxOpositores.length+1);
                    resultado[resultado.length-1] =  maxOpositores[i];
                }
            }
            maxOpositores = resultado;
            return true;
        }
        return false;
    }

    public void mostrar_informacion(){
        System.out.println(codigoSede);
        System.out.println(capitales);
        System.out.println(Arrays.toString(maxOpositores));
    }

    @Override
    public String toString() {
        return "Sedes{" +
                "codigoSede='" + codigoSede + '\'' +
                ", capitales=" + capitales +
                ", maxOpositores=" + Arrays.toString(maxOpositores) +
                '}';
    }
}
