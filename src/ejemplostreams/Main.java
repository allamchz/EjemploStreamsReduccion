package ejemplostreams;

/**
 * Programa principal donde se aplican operaciones de reducción sobre un stream
 */

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        List<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(new Persona("Nacho", 42));
        listaPersonas.add(new Persona("Juan", 70));
        listaPersonas.add(new Persona("Mario", 7));
        listaPersonas.add(new Persona("Enrique", 42));
        listaPersonas.add(new Persona("Laura", 4));
        listaPersonas.add(new Persona("May", 41));

        int sumaEdades = listaPersonas.stream()
                                      .mapToInt(p -> p.getEdad())
                                      .reduce(0, (e1, e2) -> e1 + e2);
        System.out.println("Suma de edades: " + sumaEdades);

        if (listaPersonas.stream().anyMatch(p -> p.getEdad() >= 18))
        {
            System.out.println("Hay al menos un adulto en el grupo");
        }

    }
}
