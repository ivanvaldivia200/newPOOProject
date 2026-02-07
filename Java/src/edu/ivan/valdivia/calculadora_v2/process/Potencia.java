package edu.ivan.valdivia.calculadora_v2.process;

/**Clase que realiza la operación de potencia*/
public class Potencia extends Operacion {
    @Override
    public int apply(int a, int b) {
        int resultado = 1;
        for (int i = 0; i < b; i++) {
            resultado *= a;
        }
        return resultado;
    }
}