package edu.ivan.valdivia.act2.process;

/**Clase que realiza la operación de multiplicación*/
public class Multiplicacion {

    /**@param a primer número
    -@param b segundo número
    -@return resultado de la multiplicación*/
    public static int realizarOperacion(int a, int b) {
        int resultado = 0;
        for (int i = 0; i < b; i++) {
            resultado = Suma.realizarOperacion(resultado, a);
        }
        return resultado;
    }
}

