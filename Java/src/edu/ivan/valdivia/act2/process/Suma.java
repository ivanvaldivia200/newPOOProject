package edu.ivan.valdivia.act2.process;

/**Clase que realiza la operación de suma*/
public class Suma {

    /**@param a primer número
    - @param b segundo número
    - @return resultado de la suma*/
    public static int realizarOperacion(int a, int b) {
        for (int i = 0; i < b; i++) {
            a++;
        }
        return a;
    }
}

