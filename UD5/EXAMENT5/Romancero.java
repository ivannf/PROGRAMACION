package com.company;

import java.util.Objects;

public class Romancero extends Agrupacion implements Callejera{
    private String tematicaCartelon;

    public Romancero(String nombre, String autor, String autorMusica, String autorLetra, String tipo, String tematicaCartelon) {
        super(nombre, autor, autorMusica, autorLetra, tipo);
        this.tematicaCartelon = tematicaCartelon;
    }

    public String getTematicaCartelon() {
        return tematicaCartelon;
    }

    public void setTematicaCartelon(String tematicaCartelon) {
        this.tematicaCartelon = tematicaCartelon;
    }

    @Override
    public String toString() {
        return "Romancero{" +
                super.toString() +
                "tematicaCartelon='" + tematicaCartelon + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Romancero romancero = (Romancero) o;
        return tematicaCartelon.equals(romancero.tematicaCartelon);
    }

    @Override
    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentacion del Romancero con nombre "+this.getNombre());
    }

    @Override
    public void hacer_tipo() {
        System.out.println("El romancero "+this.getNombre()+" va de "+this.getTipo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tematicaCartelon);
    }

    @Override
    public void amo_a_escucha() {
        System.out.println("Amo a escucha el Romancero "+this.getNombre());
    }
}
