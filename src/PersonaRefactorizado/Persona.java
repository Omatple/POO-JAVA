package PersonaRefactorizado;

import java.util.Objects;

public class Persona {
    private DatosPersonales datosPersonales;
    private DatosContacto datosContacto;

    public Persona(DatosPersonales datosPersonales, DatosContacto datosContacto) {
        setDatosPersonales(new DatosPersonales(datosPersonales));
        setDatosContacto(new DatosContacto(datosContacto));
    }

    public Persona(Persona persona) {
        Objects.requireNonNull(persona, "Persona no puede ser nula. ");
        setDatosPersonales(new DatosPersonales(persona.datosPersonales));
        setDatosContacto(new DatosContacto(persona.datosContacto));
    }

    public DatosPersonales getDatosPersonales() {
        return new DatosPersonales(datosPersonales);
    }

    public void setDatosPersonales(DatosPersonales datosPersonales) {
        this.datosPersonales = new DatosPersonales(Objects.requireNonNull(datosPersonales, "Los datos personales no puede ser nulo. "));
    }

    public DatosContacto getDatosContacto() {
        return new DatosContacto(datosContacto);
    }

    public void setDatosContacto(DatosContacto datosContacto) {
        this.datosContacto = new DatosContacto(Objects.requireNonNull(datosContacto, "Los datos de contacto no puede ser nulo. "));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(datosPersonales, persona.datosPersonales) && Objects.equals(datosContacto, persona.datosContacto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(datosPersonales, datosContacto);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "datosPersonales=" + datosPersonales +
                ", datosContacto=" + datosContacto +
                '}';
    }
}
