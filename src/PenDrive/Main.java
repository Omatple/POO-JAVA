package PenDrive;

import org.iesalandalus.programacion.utilidades.Entrada;

import javax.naming.OperationNotSupportedException;

public class Main {
    public static void main(String[] args) throws OperationNotSupportedException {
        System.out.println("******** Pen Drive 1 ********");
        PenDrive penDrive1 = new PenDrive();
        System.out.println("Pen Drive 1 creado: " + penDrive1);
        try {
            System.out.print("Dima la cantidad de información que quieres escribir: ");
            penDrive1.escribir(Entrada.entero());
            System.out.println("Escritura correcta: " + penDrive1);
        } catch (IllegalArgumentException | OperationNotSupportedException e) {
            System.out.println("Error al escribir: " + e.getMessage());
        }
        try {
            System.out.print("Dima la cantidad de información que quieres borrar: ");
            penDrive1.borrar(Entrada.entero());
            System.out.println("Borrado correcto: " + penDrive1);
        } catch (IllegalArgumentException | OperationNotSupportedException e) {
            System.out.println("Error al borrar: " + e.getMessage());
        }

        System.out.println("******** Pen Drive 2 ********");
        PenDrive penDrive2 = new PenDrive("Kingston", 128);
        System.out.println("Pen Drive 2 creado: " + penDrive2);
        try {
            System.out.print("Dima la cantidad de información que quieres escribir: ");
            penDrive2.escribir(Entrada.entero());
            System.out.println("Escritura correcta: " + penDrive2);
        } catch (IllegalArgumentException | OperationNotSupportedException e) {
            System.out.println("Error al escribir: " + e.getMessage());
        }
        try {
            System.out.print("Dima la cantidad de información que quieres borrar: ");
            penDrive2.borrar(Entrada.entero());
            System.out.println("Borrado correcto: " + penDrive2);
        } catch (IllegalArgumentException | OperationNotSupportedException e) {
            System.out.println("Error al borrar: " + e.getMessage());
        }
    }
}
