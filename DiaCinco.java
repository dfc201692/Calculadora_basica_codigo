import util.Persona;
import java.util.Calendar;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        
        Persona persona = new Persona();
        Persona personaDos = new Persona("Ricardo", 30, "Masculino");

        persona.setNombre("Alfredo");
        String nombrePersona = persona.getNombre();
        
        persona.setEdad(37);
        int edad = persona.getEdad();

        persona.setSexo("Masculino");
        String sexo = persona.getSexo();

        System.out.println("sexo = " + sexo);

        System.out.println("edad = " + edad);

        System.out.println("nombrePersona = " + nombrePersona);

        System.out.println("Los valores de la persona dos son, nombre: " + personaDos.getNombre()
                        + ", edad: "+ personaDos.getEdad()+", sexo: "+personaDos.getSexo());
        
        boolean esMayorEdad = personaDos.mayorEdad(personaDos);

        System.out.println("esMayorEdad = " + esMayorEdad);

        System.out.println(" Clase Math " + Math.sqrt(4));
        System.out.println(" Clase Math " + Math.min(10, 40));

    }
}