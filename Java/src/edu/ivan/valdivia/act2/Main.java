package edu.ivan.valdivia.act2;

import edu.ivan.valdivia.act2.ui.CLI;

/**Clase principal que arranca la aplicación.*/
public class Main {
    /**Método principal que inicia la calculadora
     -@param args argumentos de línea de comandos*/
    public static void main(String[] args) {
        CLI.run(); // delega la ejecución al CLI
    }
}

