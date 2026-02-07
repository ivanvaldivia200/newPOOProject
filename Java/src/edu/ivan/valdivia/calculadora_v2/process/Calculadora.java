package edu.ivan.valdivia.calculadora_v2.process;

import java.util.HashMap;
import java.util.Map;

/**Clase que centraliza y coordina las operaciones de la calculadora*/
public class Calculadora {

    private Operacion operacion;
    private final Map<Integer, Operacion> operaciones;

    /**Constructor: inicializa el mapa de operaciones*/
    public Calculadora() {
        operaciones = new HashMap<>();
        operaciones.put(1, new Suma());
        operaciones.put(2, new Resta());
        operaciones.put(3, new Multiplicacion());
        operaciones.put(4, new Division());
        operaciones.put(5, new Modulo());
        operaciones.put(6, new Potencia());
        operaciones.put(7, new Raiz());
        operaciones.put(8, new Logaritmo());
    }

    /**Selecciona la operación según la opción del menú*/
    public void setOperacion(int opcion) {
        if (!operaciones.containsKey(opcion)) {
            throw new IllegalArgumentException("Opción inválida");
        }
        operacion = operaciones.get(opcion);
    }

    /**Devuelve la operación actual seleccionada*/
    public Operacion getOperacion() {
        if (operacion == null) {
            throw new IllegalStateException("No se ha seleccionado ninguna operación");
        }
        return operacion;
    }
}