package edu.ivan.valdivia.act2.process;

/**Clase que calcula la raíz cuadrada*/
public class Raiz {

    /**@param indice índice de la raíz (solo se usa 2 en este ejemplo)
    -@param numero número al que se le calcula la raíz
    -@return raíz cuadrada positiva*/
    public static int realizarOperacion(int indice, int numero) {
        int resultado = 0;
        while (Multiplicacion.realizarOperacion(resultado, resultado) <= numero) {
            resultado = Suma.realizarOperacion(resultado, 1);
        }
        return Resta.realizarOperacion(resultado, 1);
    }
}
