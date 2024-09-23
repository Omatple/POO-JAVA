package Persona;

import java.util.Objects;

public class Persona {
    private String nombre;
    private String dni;
    private String fechaNacimiento;
    private String email;
    private String telefono;
    private String direccion;
    private String codigoPostal;
    private String localidad;

    public Persona() {
        nombre = "Persona";
        dni = "Desconocido";
        fechaNacimiento = "Desconocido";
        email = "Desconocido";
        telefono = "Desconocido";
        direccion = "Desconocido";
        codigoPostal = "Desconocido";
        localidad = "Desconocido";
    }

    public Persona(String nombre, String dni, String fechaNacimiento, String email, String telefono, String direccion, String codigoPostal, String localidad) {
        this();
        setNombre(nombre);
        setDni(dni);
        setFechaNacimiento(fechaNacimiento);
        setEmail(email);
        setTelefono(telefono);
        setDireccion(direccion);
        setCodigoPostal(codigoPostal);
        setLocalidad(localidad);
    }

    public Persona(Persona persona) {
        Objects.requireNonNull(persona, "La persona no puede ser nula.");
        setNombre(persona.nombre);
        setDni(persona.dni);
        setFechaNacimiento(persona.fechaNacimiento);
        setEmail(persona.email);
        setTelefono(persona.telefono);
        setDireccion(persona.direccion);
        setCodigoPostal(persona.codigoPostal);
        setLocalidad(persona.localidad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = Objects.requireNonNull(nombre, "Este atributo no puede ser nulo. ");
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = Objects.requireNonNull(dni, "Este atributo no puede ser nulo. ");
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = Objects.requireNonNull(fechaNacimiento, "Este atributo no puede ser nulo. ");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = Objects.requireNonNull(email, "Este atributo no puede ser nulo. ");
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = Objects.requireNonNull(telefono, "Este atributo no puede ser nulo. ");
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
        Persona persona = (Persona) o;
        return Objects.equals(dni, persona.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", email='" + email + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                ", codigoPostal='" + codigoPostal + '\'' +
                ", localidad='" + localidad + '\'' +
                '}';
    }
}
