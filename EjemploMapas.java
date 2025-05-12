import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EjemploMapas {

    public static void main(String[] args) {

        Map<String, String> persona = new HashMap<>();
        persona.put("nombre", "Alfredo");
        persona.put("Apellido", "Leal");
        persona.put("edad", "37");
        persona.put("mail", "aleal@gmail.com");

        System.out.println("persona = " + persona);
        String apellido = persona.get("Apellido");
        System.out.println("apellido = " + apellido);
        
        persona.remove("mail");
        System.out.println("persona = " + persona);
        
        boolean exixsteClave = persona.containsKey("nombre");
        System.out.println("exixsteClave = " + exixsteClave);
        
        boolean existeValor = persona.containsValue("Alfredo");
        System.out.println("existeValor = " + existeValor);

        persona.forEach((llave, valor) -> {
            System.out.println("llave = " + llave + " valor: "+ valor);
        });

        Collection<String> valores = persona.values();
        for(String value: valores){
            System.out.println("value = " + value);
        }

        Set<String> keys = persona.keySet();
        for (String ke: keys){
            System.out.println("ke = " + ke);
        }

        System.out.println("persona.size() = " + persona.size());
        System.out.println("persona.replace()" + persona.replace("nombre", "Ricardo"));
        System.out.println("persona = " + persona);
        
    }
}
