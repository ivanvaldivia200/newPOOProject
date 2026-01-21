package edu.ivan.valdivia.act2.process;

/**Clase que realiza la operación de módulo*/
public class Modulo {

    /**Calcula el módulo de dos números enteros usando restas repetidas
     -@param a dividendo
     -@param b divisor
     -@return residuo de la división*/
    public static int realizarOperacion(int a, int b) {
        while (a >= b) {
            a = Resta.realizarOperacion(a, b);
        }
        return a;
    }
}

