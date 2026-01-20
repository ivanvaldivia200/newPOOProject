package edu.ivan.valdivia.act1.ui;

import edu.ivan.valdivia.act1.data.Catalogo.Marca;
import edu.ivan.valdivia.act1.data.Catalogo.Vehiculo;
import edu.ivan.valdivia.act1.process.Carros;
import java.text.SimpleDateFormat;
import java.util.*;

/**La clase CLI representa la interfaz de la línea de comandos del sistema de venta de vehículos BMW
 -Permite al usuario interactuar con el catálogo, seleccionar vehículos y generar un ticket de compra
 -Scanner para leer la entrada del usuario
 -Total acumulado de la compra
 -Cantidad de vehículos comprados
 -Texto con el detalle de las selecciones realizadas*/

public class CLI {
    private Scanner sc = new Scanner(System.in);
    private double total = 0;
    private int cantidadComprados = 0;
    private String seleccion = "";

    /**Inicia la aplicación de venta de vehículos
     -Permite al usuario ingresar su nombre, seleccionar vehículos del catálogo*/

    public void iniciar() {
        System.out.println("===Bienvenido al futuro con BMW==="
        );
        System.out.print("Ingrese su nombre: ");
        String cliente = sc.nextLine();

        List<Vehiculo> vehiculos = Carros.obtenerCatalogo();

        /**Muestra los tipos de vehículos*/
        System.out.println("\nCatalogo de vehiculos:");
        for (int i = 0; i < vehiculos.size(); i++) {
            System.out.println((i+1) + ". " + vehiculos.get(i).tipo);
        }

        while (true) {
            System.out.print("\nElija la categoria de su coche (Seleccione 0 para concluir): ");
            int opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 0) break; //
            if (opcion >= 1 && opcion <= vehiculos.size()) {
                Vehiculo elegido = vehiculos.get(opcion-1);

                /**Muestra las marcas*/
                System.out.println("\nCarros disponibles para " + elegido.tipo + ":");
                for (int j = 0; j < elegido.marcas.size(); j++) {
                    Marca m = elegido.marcas.get(j);
                    System.out.println((j+1) + ". " + m.nombre + " (" + m.anio + ") - $" + m.precio);
                    System.out.println("Características: " + m.caracteristicas);

                }

                /** Solicita al usuario que seleccione un carro por número*/

                System.out.print("\nSeleccione con el numero correspondiente el carro que desea: ");
                int marcaOpcion = sc.nextInt();
                sc.nextLine();

                /** Verifica que la opción seleccionada esté dentro del rango válido de marcas
                 -Si es válida, se agrega el vehículo al ticket de compra, se actualiza el total y se incrementa la cantidad de coches comprados.*/

                if (marcaOpcion >= 1 && marcaOpcion <= elegido.marcas.size()) {
                    Marca marcaElegida = elegido.marcas.get(marcaOpcion-1);
                    total += marcaElegida.precio;
                    cantidadComprados++;
                    seleccion += elegido.tipo + " - " + marcaElegida.nombre + " (" + marcaElegida.anio + ") ($" + marcaElegida.precio + ")\n";
                    System.out.println("Has comprado " + cantidadComprados + " Coche(s) comprados");
                } else {
                    System.out.println("Opcion inválida.");
                }
            } else {
                System.out.println("Opción inválida.");
            }
        }

        /** Tenemos los codigos para el tiket que te pone la fecha, nombre del cliente, vehiculos que compro,y su total que va a pagar.*/
        Date fecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm");

        System.out.println("\n====Ticket de Venta====");
        System.out.println("Cliente: " + cliente);
        System.out.println("Fecha: " + formato.format(fecha));
        System.out.println("Vehículos comprados:\n" + seleccion);
        System.out.println("Total a pagar: $" + total);
        System.out.println("========================");
    }
}

