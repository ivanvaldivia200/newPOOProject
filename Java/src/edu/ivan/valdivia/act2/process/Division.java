package edu.ivan.valdivia.act2.process;

/**Clase que realiza la operación de división entera*/
public class Division {

    /**Divide dos números enteros usando restas repetidas
     -@param a dividendo
     -@param b divisor
     -@return resultado de la división entera*/
    public static int realizarOperacion(int a, int b) {
        int contador = 0;
        while (a >= b) {
            a = Resta.realizarOperacion(a, b);
            contador = Suma.realizarOperacion(contador, 1);
        }
        return contador;
    }
}
