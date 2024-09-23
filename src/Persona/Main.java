package Persona;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        System.out.println(persona);
        Persona persona1 = new Persona("A","B","C","D", "E", "F", "G", "H");
        System.out.println(persona1);
    }
}
