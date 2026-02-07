package edu.ivan.valdivia.act2.process;

/**Clase que realiza la operación de logaritmo*/
public class Logaritmo {

    /**Se hace de manera sencilla probando valores hasta encontrar el resultado
     -@param base la base del logaritmo
     -@param numero el número al que se le aplica el logaritmo
     -@return el exponente tal que base exponente = numero*/
    public static int realizarOperacion(int base, int numero) {
        int resultado = 0;
        int potencia = 1;

        // vamos multiplicando la base hasta alcanzar el número
        while (potencia < numero) {
            potencia = Potencia.realizarOperacion(base, resultado);
            if (potencia == numero) {
                return resultado;
            }
            resultado = Suma.realizarOperacion(resultado, 1);
        }

        return resultado;
    }
}
