package edu.ivan.valdivia.act3.process;

/**Clase de utilidades para trabajar con cadenas de texto*/
public class CadenaUtils {

    /**Verifica si un texto es palíndromo.
     -@param texto cadena a evaluar
     -@return true si es palíndromo, false si no*/
    public static boolean esPalindromo(String texto) {
        String limpio = texto.replaceAll("\\s+", "").toLowerCase();
        int i = 0, j = limpio.length() - 1;
        while (i < j) {
            if (limpio.charAt(i) != limpio.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }

    /**Cuenta cuántas vocales tiene un texto.
     -@param texto cadena a evaluar
     -@return número de vocales*/
    public static int contarVocales(String texto) {
        int contador = 0;
        for (char c : texto.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) contador++;
        }
        return contador;
    }

    /**Invierte una cadena sin usar reverse().
     -@param texto cadena original
     -@return cadena invertida*/
    public static String invertir(String texto) {
        char[] chars = texto.toCharArray();
        String resultado = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            resultado += chars[i];
        }
        return resultado;
    }

    /**Busca la primera ocurrencia de un caracter en un texto.
     -@param texto cadena donde buscar
     -@param c caracter a buscar
     -@return posición del caracter o -1 si no se encuentra*/
    public static int primeraOcurrencia(String texto, char c) {
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == c) return i;
        }
        return -1;
    }
}