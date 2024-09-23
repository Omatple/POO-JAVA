package PenDrive;

import javax.naming.OperationNotSupportedException;
import java.util.Objects;

public class PenDrive {
    private static final String FABRICANTE_DESCONOCIDO = "Desconocido";
    private static final int CAPACIDAD_MINIMA = 64;
    private static final int CAPACIDAD_MAXIMA = 1024;
    private String fabricante;
    private int capacidad;
    private int ocupado;

    public PenDrive() {
        fabricante = FABRICANTE_DESCONOCIDO;
        capacidad = CAPACIDAD_MINIMA;
        ocupado = 0;
    }

    public PenDrive(String fabricante, int capacidad) throws OperationNotSupportedException {
        this();
        setFabricante(fabricante);
        setCapacidad(capacidad);
    }

    public String getFabricante() {
        return fabricante;
    }

    private void setFabricante(String fabricante) {
        this.fabricante = Objects.requireNonNull(fabricante, "El fabricante no puede ser nulo. ");
    }

    public int getCapacidad() {
        return capacidad;
    }

    private void setCapacidad(int capacidad) throws OperationNotSupportedException {
        if (capacidad < CAPACIDAD_MINIMA) {
            throw new IllegalArgumentException("La capacidad del PenDrive no puede ser inferior a " + CAPACIDAD_MINIMA);
        } else if (capacidad > CAPACIDAD_MAXIMA) {
            throw new IllegalArgumentException("La capacidad del PenDrive no puede ser superior a " + CAPACIDAD_MAXIMA);
        } else {
            this.capacidad = Objects.requireNonNull(capacidad, "La capacidad no puede ser nula. ");
        }
    }

    public int getOcupado() {
        return ocupado;
    }

    public int getLibre() {
        return ((capacidad) - (ocupado));
    }

    public boolean estaVacio() {
        return (getLibre() == capacidad);
    }

    public boolean estaLleno() {
        return (getOcupado() == capacidad);
    }

    public void escribir(int cantidad) throws OperationNotSupportedException {
        if (cantidad > getLibre()) {
            throw new OperationNotSupportedException("No se puede escribir mas espacio que la cantidad que contiene el PenDrive. ");
        } else if (cantidad <= 0) {
            throw new IllegalArgumentException("No puedes escribir una cantidad negativa, no tiene sentido.");
        } else {
            this.ocupado += cantidad;
        }
    }

    public int leer(int cantidad) throws OperationNotSupportedException {
        if (ocupado < cantidad) {
            throw new OperationNotSupportedException("No se puede leer mas espacio de la cantidad ocupada del PenDrive. ");
        } else if (cantidad <= 0) {
            throw new IllegalArgumentException("No puedes leer una cantidad negativa, no tiene sentido.");
        } else {
            return cantidad;
        }
    }

    public void borrar(int cantidad) throws OperationNotSupportedException {
        if (ocupado < cantidad) {
            throw new OperationNotSupportedException("No se puede borrar mas espacio de la cantidad ocupada del PenDrive. ");
        } else if (cantidad <= 0) {
            throw new IllegalArgumentException("No puedes borrar una cantidad negativa, no tiene sentido.");
        } else {
            this.ocupado -= cantidad;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PenDrive penDrive = (PenDrive) o;
        return capacidad == penDrive.capacidad && Objects.equals(fabricante, penDrive.fabricante);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fabricante, capacidad);
    }

    @Override
    public String toString() {
        return "\nPenDrive -> " +
                "Fabricante = " + fabricante + '\'' +
                "\n            Capacidad = " + capacidad +
                "\n            Ocupado = " + ocupado;
    }
}
