package PersonaRefactorizado;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona(new DatosPersonales("A", "B", "C"), new DatosContacto("D","E", new DireccionPostal("F", "G", "H")));
        System.out.println(persona);
        Persona persona1 = new Persona(new DatosPersonales("Z", "B", "C"), new DatosContacto("D","E", new DireccionPostal("F", "G", "H")));
        System.out.println(persona1);
        persona = persona1;

        // persona = new Persona(persona1.getDatosPersonales(), persona1.getDatosContacto());

        DatosPersonales nuevoNombre = new DatosPersonales(persona1.getDatosPersonales());
        nuevoNombre.setNombre("Manuel");
        persona1.setDatosPersonales(nuevoNombre);

        System.out.println(persona);
        System.out.println(persona1);

    }
}
