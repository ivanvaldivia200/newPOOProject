package edu.ivan.valdivia.act3.process;

import java.util.*;

/**Clase de utilidades para trabajar con listas de números enteros*/
public class Numeros_enteros {

    /**Mueve todos los ceros al final de la lista.
     -@param numeros lista de enteros
     -@return nueva lista con ceros al final*/
    public static List<Integer> moverCerosDerecha(List<Integer> numeros) {
        List<Integer> resultado = new ArrayList<>();
        int contadorCeros = 0;

        for (int n : numeros) {
            if (n == 0) contadorCeros++;
            else resultado.add(n);
        }

        for (int i = 0; i < contadorCeros; i++) {
            resultado.add(0);
        }

        return resultado;
    }

    /**Cuenta cuántos números pares hay en la lista.
     -@param numeros lista de enteros
     -@return cantidad de números pares*/
    public static int contarPares(List<Integer> numeros) {
        int contador = 0;
        for (int n : numeros) {
            if (n % 2 == 0) contador++;
        }
        return contador;
    }
}