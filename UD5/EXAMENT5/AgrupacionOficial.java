package com.company;

import java.util.Arrays;

public abstract class AgrupacionOficial extends Agrupacion{
    private Integrante[] integrantes;

    public AgrupacionOficial(String nombre, String autor, String autorMusica, String autorLetra, String tipo) {
        super(nombre, autor, autorMusica, autorLetra, tipo);
        this.integrantes = new Integrante[0];
    }

    public Integrante[] getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(Integrante[] integrantes) {
        this.integrantes = integrantes;
    }

    public void insertar_integrante(Integrante i){
        if (!estaIntegrante(i)){
            Integrante[] resultado = Arrays.copyOf(integrantes, integrantes.length + 1);
            resultado[resultado.length-1] = i;
            integrantes = resultado;
        }
    }

    public boolean eliminar_integrante(Integrante integranteEliminado){
        if (estaIntegrante(integranteEliminado)){
            Integrante[] resultado = new Integrante[0];
            for (int i = 0; i < integrantes.length; i++) {
                if (!integrantes[i].equals(integranteEliminado)){
                    resultado = Arrays.copyOf(resultado, resultado.length + 1);
                    resultado[resultado.length-1] = integrantes[i];
                }
            }
            integrantes = resultado;
            return true;
        }
        return false;
    }

    public boolean estaIntegrante(Integrante i){
        for (int j = 0; j < integrantes.length; j++) {
            if (integrantes[j].equals(i)){
                return true;
            }
        }
        return false;
    }

    public abstract void camino_del_falla();

    @Override
    public String toString() {
        return "AgrupacionOficial{" +
                super.toString() +
                "integrantes=" + Arrays.toString(integrantes) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AgrupacionOficial that = (AgrupacionOficial) o;
        return Arrays.equals(integrantes, that.integrantes);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Arrays.hashCode(integrantes);
        return result;
    }
}
