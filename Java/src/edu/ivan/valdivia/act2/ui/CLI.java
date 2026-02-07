package edu.ivan.valdivia.act2.ui;

import java.util.Scanner;
import edu.ivan.valdivia.act2.process.*;

/**Clase que implementa la interfaz de línea de comandos (CLI) de la calculadora.*/
public class CLI {
    /**
     * Método que muestra el menú y permite al usuario elegir operaciones.
     */
    public static void run() {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("\n==Calculadora CLI==");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Módulo");
            System.out.println("6. Potencia");
            System.out.println("7. Raíz cuadrada");
            System.out.println("8. Logaritmo");
            System.out.println("9. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            if (opcion >= 1 && opcion <= 8) {
                System.out.print("Ingresa el primer número: ");
                int a = sc.nextInt();
                System.out.print("Ingresa el segundo número: ");
                int b = sc.nextInt();

                int resultado = 0;

                switch (opcion) {
                    case 1: resultado = Suma.realizarOperacion(a, b); break;
                    case 2: resultado = Resta.realizarOperacion(a, b); break;
                    case 3: resultado = Multiplicacion.realizarOperacion(a, b); break;
                    case 4: resultado = Division.realizarOperacion(a, b); break;
                    case 5: resultado = Modulo.realizarOperacion(a, b); break;
                    case 6: resultado = Potencia.realizarOperacion(a, b); break;
                    case 7: resultado = Raiz.realizarOperacion(a, b); break;
                    case 8: resultado = Logaritmo.realizarOperacion(a, b); break;
                }

                System.out.println("Resultado: " + resultado);
            }

        } while (opcion != 9);
    }
}
