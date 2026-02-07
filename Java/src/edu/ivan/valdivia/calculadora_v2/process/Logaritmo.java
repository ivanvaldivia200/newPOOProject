package edu.ivan.valdivia.calculadora_v2.process;

/**Clase que realiza la operación de logaritmo*/
public class Logaritmo extends Operacion {
    @Override
    public int apply(int a, int b) {
        validarEntrada(a, b);

        int resultado = 0;
        int potencia = 1;

        while (potencia <= a) {
            potencia *= b;
            resultado++;
        }
        return resultado - 1;
    }

    private void validarEntrada(int a, int b) {
        if (a <= 0) {
            throw new IllegalArgumentException("El argumento del logaritmo debe ser mayor que 0");
        }
    }
}