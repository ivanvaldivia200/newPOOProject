package edu.ivan.valdivia.act3.process;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

/**
 * Pruebas para los métodos de Empleados_lista.
 */
public class Test_Empleados {

    @Test
    void testMayorSalario() {
        List<Empleados> empleados = List.of(
                new Empleados("Ana", 28, 30000, "sistemas"),
                new Empleados("Luis", 35, 40000, "ventas")
        );
        assertEquals("Luis", Empleados_lista.mayorSalario(empleados).getNombre());
    }

    @Test
    void testEdadMasComun() {
        List<Empleados> empleados = List.of(
                new Empleados("Ana", 28, 30000, "sistemas"),
                new Empleados("Pedro", 28, 25000, "ventas"),
                new Empleados("Luis", 35, 40000, "ventas")
        );
        assertEquals(28, Empleados_lista.edadMasComun(empleados));
    }

    @Test
    void testPromedioEdad() {
        List<Empleados> empleados = List.of(
                new Empleados("Ana", 28, 30000, "sistemas"),
                new Empleados("Luis", 32, 40000, "ventas")
        );
        assertEquals(30.0, Empleados_lista.promedioEdad(empleados));
    }

    @Test
    void testPromedioSalario() {
        List<Empleados> empleados = List.of(
                new Empleados("Ana", 28, 30000, "sistemas"),
                new Empleados("Luis", 32, 40000, "ventas")
        );
        assertEquals(35000.0, Empleados_lista.promedioSalario(empleados));
    }

    @Test
    void testPromedioEdadMas25K() {
        List<Empleados> empleados = List.of(
                new Empleados("Ana", 28, 30000, "sistemas"),
                new Empleados("Pedro", 22, 20000, "ventas")
        );
        assertEquals(28.0, Empleados_lista.promedioEdadMas25K(empleados));
    }

    @Test
    void testMenoresDe25() {
        List<Empleados> empleados = List.of(
                new Empleados("Ana", 28, 30000, "sistemas"),
                new Empleados("Pedro", 22, 25000, "ventas")
        );
        assertEquals(1, Empleados_lista.menoresDe25(empleados).size());
    }

    @Test
    void testContarSistemas() {
        List<Empleados> empleados = List.of(
                new Empleados("Ana", 28, 30000, "sistemas"),
                new Empleados("Luis", 35, 40000, "ventas"),
                new Empleados("Pedro", 22, 25000, "sistemas")
        );
        assertEquals(2, Empleados_lista.contarSistemas(empleados));
    }

    @Test
    void testMayorSalarioMas30() {
        List<Empleados> empleados = List.of(
                new Empleados("Ana", 28, 30000, "sistemas"),
                new Empleados("Luis", 35, 40000, "ventas")
        );
        assertEquals("Luis", Empleados_lista.mayorSalarioMas30(empleados).getNombre());
    }

    @Test
    void testMenorSalarioEdadMenosComun() {
        List<Empleados> empleados = List.of(
                new Empleados("Ana", 28, 30000, "sistemas"),
                new Empleados("Pedro", 22, 25000, "ventas"),
                new Empleados("Juan", 22, 27000, "ventas"),
                new Empleados("Luis", 35, 40000, "ventas")
        );
        // Ahora la edad menos común es 28 (solo Ana), menor salario con esa edad = Ana
        assertEquals("Ana", Empleados_lista.menorSalarioEdadMenosComun(empleados).getNombre());
    }
}