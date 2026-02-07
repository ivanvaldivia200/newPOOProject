package edu.ivan.valdivia.calculadora_v2.ui;

import edu.ivan.valdivia.calculadora_v2.process.*;
import java.util.Scanner;

/**Clase que implementa la interfaz de línea de comandos (CLI) de la calculadora.*/
public class CLI {

    /**Método que inicia la calculadora en modo CLI*/
    public static void start() {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        int opcion;

        while (true) {
            showMenu();
            opcion = scanner.nextInt();
            if (opcion == 0) break;

            try {
                calculadora.setOperacion(opcion);
                aplicarOperacion(calculadora, scanner);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    /**Muestra el menú de operaciones*/
    private static void showMenu() {
        System.out.println("\n== Calculadora CLI ==");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Módulo");
        System.out.println("6. Potencia");
        System.out.println("7. Raíz");
        System.out.println("8. Logaritmo");
        System.out.println("0. Salir");
        System.out.print("Elige una opción: ");
    }

    /**Aplica la operación seleccionada*/
    private static void aplicarOperacion(Calculadora calculadora, Scanner scanner) {
        System.out.print("Ingresa el primer número: ");
        int a = scanner.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int b = scanner.nextInt();

        int resultado = calculadora.getOperacion().apply(a, b);
        System.out.println("Resultado: " + resultado);
    }
}