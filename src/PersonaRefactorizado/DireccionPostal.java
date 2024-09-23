package PersonaRefactorizado;

import java.util.Objects;

public class DireccionPostal {
    private String direccion;
    private String codigoPostal;
    private String localidad;

    public DireccionPostal(String direccion, String codigoPostal, String localidad){
        setDireccion(direccion);
        setCodigoPostal(codigoPostal);
        setLocalidad(localidad);
    }

    public DireccionPostal(DireccionPostal direccionPostal){
    Objects.requireNonNull(direccionPostal, "La direccion postal no puede ser nula. ");
        setDireccion(direccionPostal.direccion);
        setCodigoPostal(direccionPostal.codigoPostal);
        setLocalidad(direccionPostal.localidad);
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = Objects.requireNonNull(direccion, "Este atributo no puede ser nulo. ");
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = Objects.requireNonNull(codigoPostal, "Este atributo no puede ser nulo. ");
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = Objects.requireNonNull(localidad, "Este atributo no puede ser nulo. ");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DireccionPostal that = (DireccionPostal) o;
        return Objects.equals(direccion, that.direccion) && Objects.equals(codigoPostal, that.codigoPostal) && Objects.equals(localidad, that.localidad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(direccion, codigoPostal, localidad);
    }

    @Override
    public String toString() {
        return "DireccionPostal{" +
                "direccion='" + direccion + '\'' +
                ", codigoPostal='" + codigoPostal + '\'' +
                ", localidad='" + localidad + '\'' +
                '}';
    }
}
