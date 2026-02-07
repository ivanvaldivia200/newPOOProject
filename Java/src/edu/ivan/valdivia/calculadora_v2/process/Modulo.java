package edu.ivan.valdivia.calculadora_v2.process;

/**Clase que realiza la operación de módulo*/
public class Modulo extends Operacion {
    @Override
    public int apply(int a, int b) {
        validarEntrada(b);
        return a % b;
    }

    private void validarEntrada(int b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede calcular módulo con divisor cero");
        }
    }
}