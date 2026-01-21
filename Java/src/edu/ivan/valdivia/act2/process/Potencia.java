package edu.ivan.valdivia.act2.process;

/**Clase que realiza la operación de potencia*/
public class Potencia {

    /**@param base número base
    -@param exponente número exponente
    -@return resultado de base^exponente*/
    public static int realizarOperacion(int base, int exponente) {
        int resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado = Multiplicacion.realizarOperacion(resultado, base);
        }
        return resultado;
    }
}

