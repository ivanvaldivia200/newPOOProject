package edu.ivan.valdivia.act3.process;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**Pruebas para los métodos de CadenaUtils.*/
public class Test_Cadenautil {

    @Test
    void testPalindromo() {
        assertFalse(CadenaUtils.esPalindromo("hola mundo"));
        assertTrue(CadenaUtils.esPalindromo("ana"));
    }

    @Test
    void testContarVocales() {
        assertEquals(2, CadenaUtils.contarVocales("hola"));
    }

    @Test
    void testInvertir() {
        assertEquals("aloh", CadenaUtils.invertir("hola"));
    }

    @Test
    void testPrimeraOcurrencia() {
        assertEquals(1, CadenaUtils.primeraOcurrencia("hola", 'o'));
        assertEquals(-1, CadenaUtils.primeraOcurrencia("hola", 'r'));
    }
}