package edu.ivan.valdivia.act3.process;

/**
 * Clase con métodos simples para trabajar con cadenas de texto.
 */
public class CadenaUtils {

    //Verifica si una cadena es un palíndromo.
 public static boolean esPalindromo(String texto) {
        texto = texto.toLowerCase().replace(" ", "");
        int i = 0;
        int j = texto.length() - 1;

        while (i < j) {
            if (texto.charAt(i) != texto.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    //Cuenta cuántas vocales hay en la cadena.

    public static int contarVocales(String texto) {
        int contador = 0;
        texto = texto.toLowerCase();
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        return contador;
    }

    //Invierte una cadena sin usar reverse().
    public static String invertir(String texto) {
        String resultado = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            resultado += texto.charAt(i);
        }
        return resultado;
    }

    //Busca la primera posición de un carácter en la cadena.

    public static int buscarCaracter(String texto, char c) {
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == c) {
                return i;
            }
        }
        return -1;
    }
}