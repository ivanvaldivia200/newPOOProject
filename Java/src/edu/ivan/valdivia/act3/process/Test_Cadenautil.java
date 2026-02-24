package edu.ivan.valdivia.act3.process;

public class Test_Cadenautil {
    public static void main(String[] args) {
        System.out.println("Es palíndromo 'ana': " + CadenaUtils.esPalindromo("ana"));

        System.out.println("Es palíndromo 'hola mundo': " + CadenaUtils.esPalindromo("hola mundo"));

        System.out.println("Contar vocales 'hola': " + CadenaUtils.contarVocales("hola"));

        System.out.println("Invertir 'hola': " + CadenaUtils.invertir("hola"));

        System.out.println("Buscar caracter 'o' en 'hola': " + CadenaUtils.buscarCaracter("hola", 'o'));

        System.out.println("Buscar caracter 'r' en 'hola': " + CadenaUtils.buscarCaracter("hola", 'r'));
    }
}