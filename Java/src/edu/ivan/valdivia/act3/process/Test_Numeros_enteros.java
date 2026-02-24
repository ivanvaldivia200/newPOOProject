package edu.ivan.valdivia.act3.process;

import java.util.ArrayList;
import java.util.List;

public class Test_Numeros_enteros {
    public static void main(String[] args) {
        List<Integer> lista1 = new ArrayList<>();
        lista1.add(0); lista1.add(2); lista1.add(1); lista1.add(4); lista1.add(0); lista1.add(2);
        System.out.println("Mover ceros: " + Numeros_enteros.moverCeros(lista1));

        List<Integer> lista2 = new ArrayList<>();
        lista2.add(3); lista2.add(4); lista2.add(5); lista2.add(7); lista2.add(6);
        System.out.println("Contar pares: " + Numeros_enteros.contarPares(lista2));
    }
}