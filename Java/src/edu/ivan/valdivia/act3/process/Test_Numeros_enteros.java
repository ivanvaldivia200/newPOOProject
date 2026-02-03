package edu.ivan.valdivia.act3.process;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;

import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas para los métodos de Numeros_enteros.
 */
public class Test_Numeros_enteros {

    @Test
    void testMoverCerosDerecha() {
        List<Integer> entrada = List.of(0,2,1,4,0,2);
        List<Integer> esperado = List.of(2,1,4,2,0,0);
        assertEquals(esperado, Numeros_enteros.moverCerosDerecha(entrada));
    }

    @Test
    void testContarPares() {
        assertEquals(2, Numeros_enteros.contarPares(List.of(3,4,5,7,6)));
    }
}