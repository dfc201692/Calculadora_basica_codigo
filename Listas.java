import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Listas {

    public static void main(String[] args) {

        List<String> nombres = new ArrayList<>();
        nombres.add("Alfredo");
        nombres.add("Ricardo");
        nombres.add("Jose");
        nombres.add("Javier");

        System.out.println("nombres = " + nombres);

        nombres.forEach( name -> {
            System.out.println("name = " + name);
        });
        
        boolean elemento = nombres.contains("Alfredoooo");
        System.out.println("elemento = " + elemento);

        boolean eliminado = nombres.remove("Javier");
        System.out.println("nombres = " + nombres);

        System.out.println(" Tamaño arreglo: " +nombres.size());

        Collections.sort(nombres);
        nombres.forEach( name -> {
            System.out.println("name = " + name);
        });
        
        
    }
}
