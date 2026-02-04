package edu.ivan.valdivia.act1.process;

import edu.ivan.valdivia.act1.data.Catalogo.Marca;
import edu.ivan.valdivia.act1.data.Catalogo.Vehiculo;
import java.util.*;

/**La clase Carros se encarga de generar un catálogo de vehículos BMW
 con diferentes tipos y modelos disponibles
 Devuelve una lista de vehículos con sus respectivas marcas y características
 @return Lista de objetos Vehiculo que representan el catálogo disponible*/
public class Carros {
    public static List<Vehiculo> obtenerCatalogo() {
        List<Vehiculo> vehiculos = new ArrayList<>();

        vehiculos.add(new Vehiculo("Sedan", Arrays.asList(
                new Marca("BMW Serie 3", 1400000, 2026,"Motor 2.0L, 4 puertas, Vmax 226 km/h")
        )));

        vehiculos.add(new Vehiculo("SUV", Arrays.asList(
                new Marca("BMW X6 M", 3000000, 2026,"Motor V8 biturbo de 4.4 litros, 0-100 km/h en 3.9s, Potencia de 625 HP"),
                new Marca("BMW X2 sDrive20i", 1400000, 2026,"Motor turbo 1.5L, 4 puertas, Vmax 231 km/h")
        )));

        vehiculos.add(new Vehiculo("Coupe", Arrays.asList(
                new Marca("BMW Serie 2 Coupé M", 1350000, 2026,"Motor turbo 3.0L, 2 puertas, Potencia 480 HP"),
                new Marca("BMW Serie 2 Gran Coupé", 1179900, 2026,"Motor turbo 1.5L, 4 puertas, Potencia 156 HP")
        )));

        return vehiculos;
    }
}
