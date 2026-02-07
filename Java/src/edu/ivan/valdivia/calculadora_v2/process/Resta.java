package edu.ivan.valdivia.calculadora_v2.process;

/**Clase que realiza la operación de resta*/
public class Resta extends Operacion {
    @Override
    public int apply(int a, int b) {
        return a - b;
    }
}