package PersonaRefactorizado;

import java.util.Objects;

public class DatosContacto {
    private String telefono;
    private String email;
    private DireccionPostal direccionPostal;

    public DatosContacto(String telefono, String email, DireccionPostal direccionPostal) {
        setTelefono(telefono);
        setEmail(email);
        setDireccionPostal(new DireccionPostal(direccionPostal));
    }

    public DatosContacto(DatosContacto datosContacto) {
        Objects.requireNonNull(datosContacto, "Los datos de contacto no puede ser nulo. ");
        setTelefono(datosContacto.telefono);
        setEmail(datosContacto.email);
        setDireccionPostal(new DireccionPostal(datosContacto.direccionPostal));
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = Objects.requireNonNull(telefono, "Este atributo no puede ser nulo. ");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = Objects.requireNonNull(email, "Este atributo no puede ser nulo. ");
    }

    public DireccionPostal getDireccionPostal() {
        return new DireccionPostal(direccionPostal);
    }

    public void setDireccionPostal(DireccionPostal direccionPostal) {
        this.direccionPostal = new DireccionPostal(Objects.requireNonNull(direccionPostal, "La direccion postal no puede ser nula. "));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DatosContacto that = (DatosContacto) o;
        return Objects.equals(telefono, that.telefono) && Objects.equals(email, that.email) && Objects.equals(direccionPostal, that.direccionPostal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(telefono, email, direccionPostal);
    }

    @Override
    public String toString() {
        return "DatosContacto{" +
                "telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", direccionPostal=" + direccionPostal +
                '}';
    }
}
