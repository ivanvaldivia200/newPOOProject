package edu.ivan.valdivia.calculadora_v2.process;

/**Clase que realiza la operación de raíz n-ésima*/
public class Raiz extends Operacion {
    @Override
    public int apply(int a, int b) {
        validarEntrada(a, b);

        int resultado = 0;
        while (potencia(resultado, b) <= a) {
            resultado++;
        }
        return resultado - 1;
    }

    private int potencia(int base, int exponente) {
        int resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }

    private void validarEntrada(int a, int b) {
        if (b <= 0) {
            throw new IllegalArgumentException("El índice de la raíz debe ser mayor que 0");
        }
    }
}