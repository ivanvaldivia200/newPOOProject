package edu.ivan.valdivia.act3.process;

import java.util.List;
import java.util.ArrayList;

//Clase para trabajar con listas de números enteros.

public class Numeros_enteros {

    //Mueve todos los ceros de la lista al final.
    public static List<Integer> moverCeros(List<Integer> numeros) {
        List<Integer> resultado = new ArrayList<>();
        int contadorCeros = 0;

        for (int n : numeros) {
            if (n != 0) {
                resultado.add(n);
            } else {
                contadorCeros++;
            }
        }

        for (int i = 0; i < contadorCeros; i++) {
            resultado.add(0);
        }

        return resultado;
    }

    //Cuenta cuántos números pares hay en la lista.
    public static int contarPares(List<Integer> numeros) {
        int contador = 0;
        for (int n : numeros) {
            if (n % 2 == 0) {
                contador++;
            }
        }
        return contador;
    }
}