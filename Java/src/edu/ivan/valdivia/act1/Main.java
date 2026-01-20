package edu.ivan.valdivia.act1;

import edu.ivan.valdivia.act1.ui.CLI;

/**Clase principal que inicia la aplicación de venta de vehículos BMW.
 * -Se encarga de crear la interfaz de línea de comandos del CLI y ejecutarla.*/

public class Main {

    /**Método principal de la aplicación.
     -@param args Argumentos de la línea de comandos (no utilizados en este programa)*/

    public static void main(String[] args) {
        CLI interfaz = new CLI();
        interfaz.iniciar();
    }
}
