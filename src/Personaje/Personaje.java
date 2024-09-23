package Personaje;

import javax.naming.OperationNotSupportedException;
import java.util.Objects;

public class Personaje {

    private static final String PREFIJO_NOMBRE = "Personaje ";
    private static final int ENERGIA_INICIAL = 100;
    private static final Color COLOR_INICIAL = Color.ROJO;
    private static final int MIN_ENERGIA = 0;
    private static final int MAX_ENERGIA = 100;

    private static int numPersonajes = 0;

    private String nombre;
    private int energia;
    private Color color;
    private Posicion posicion;

    public Personaje() {
        numPersonajes++;
        nombre = PREFIJO_NOMBRE + numPersonajes;
        energia = ENERGIA_INICIAL;
        color = COLOR_INICIAL;
        posicion = new Posicion();
    }

    public Personaje(String nombre) {
        this();
        setNombre(nombre);
    }

    public Personaje(String nombre, int energia, Color color, Posicion posicion) {
        this();
        setNombre(nombre);
        setEnergia(energia);
        setColor(color);
        setPosicion(posicion);
    }

    public Personaje(Personaje personaje) {
        this();
        Objects.requireNonNull(personaje, "No puedo copiar un personaje nulo.");
        nombre = personaje.nombre;
        energia = personaje.energia;
        color = personaje.color;
        posicion = personaje.posicion;
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = Objects.requireNonNull(nombre, "El nombre del personaje no puede ser nulo.");
    }

    public int getEnergia() {
        return energia;
    }

    private void setEnergia(int energia) {
        if (energia < MIN_ENERGIA) {
            throw new IllegalArgumentException("El valor de la energía no puede ser menor que el mínimo establecido.");
        } else if (energia > MAX_ENERGIA) {
            throw new IllegalArgumentException("El valor de la energía no puede ser mayor que el máximo establecido.");
        }
        this.energia = energia;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = Objects.requireNonNull(color, "El color del personaje no puede ser nulo.");
    }

    public Posicion getPosicion() {
        return posicion;
    }

    private void setPosicion(Posicion posicion) {
        this.posicion = Objects.requireNonNull(posicion, "La posición del personaje no puede ser nula.");
    }

    public void chocar(int posiblePerdida) {
        setEnergia(energia - posiblePerdida);
    }

    public void charlar(int posibleGanancia) {
        setEnergia(energia + posibleGanancia);
    }

    public void mover(int x, int y) throws OperationNotSupportedException{
        try {
            posicion = new Posicion(posicion.x() + x, posicion.y() + y);
        } catch (IllegalArgumentException e) {
            throw new OperationNotSupportedException("Movimiento no válido: " + e.getMessage());
        }
    }

    public void mover(Direccion direccion, int pasos) throws OperationNotSupportedException {
        Objects.requireNonNull(direccion, "La dirección no puede ser nula.");
        if (pasos <= 0) {
            throw new IllegalArgumentException("El número de pasos debe ser mayor que cero.");
        }
        int nuevaX = posicion.x();
        int nuevaY = posicion.y();
        switch (direccion) {
            case ARRIBA -> nuevaY += pasos;
            case ABAJO -> nuevaY -= pasos;
            case DERECHA -> nuevaX += pasos;
            case IZQUIERDA -> nuevaX -= pasos;
        }
        try {
            posicion = new Posicion(nuevaX, nuevaY);
        } catch (IllegalArgumentException e) {
            throw new OperationNotSupportedException("Movimiento no válido: " + e.getMessage());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Personaje that)) return false;
        return energia == that.energia && Objects.equals(nombre, that.nombre) && Objects.equals(color, that.color) && Objects.equals(posicion, that.posicion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, energia, color, posicion);
    }

    @Override
    public String toString() {
        return String.format("Personaje.Personaje[nombre=%s, energía=%s, color=%s, posición=%s]", this.nombre, this.energia, this.color, this.posicion);
    }

}