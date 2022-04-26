import java.util.Objects;

public class Oferta{

    private Integer oferta;
    private String descripcion;
    private Trabajadores trabajador;
    private Boolean cubierta;

    public Oferta(Integer oferta, String descripcion, Boolean cubierta) {
        this.oferta = oferta;
        this.descripcion = descripcion;
        this.trabajador = trabajador;
        this.cubierta = cubierta;
    }

    public Integer getOferta() {
        return oferta;
    }

    public void setOferta(Integer oferta) {
        this.oferta = oferta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Trabajadores getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Trabajadores trabajador) {
        this.trabajador = trabajador;
    }

    public Boolean getCubierta() {
        return cubierta;
    }

    public void setCubierta(Boolean cubierta) {
        this.cubierta = cubierta;
    }

    @Override
    public String toString() {
        return "Oferta{" +
                "oferta=" + oferta +
                ", descripcion='" + descripcion + '\'' +
                ", trabajador=" + trabajador +
                ", cubierta=" + cubierta +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Oferta oferta1 = (Oferta) o;
        return oferta.equals(oferta1.oferta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(oferta);
    }
}
