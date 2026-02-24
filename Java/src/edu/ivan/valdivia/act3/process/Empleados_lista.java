package edu.ivan.valdivia.act3.process;

import java.util.List;
import java.util.ArrayList;

//Clase para trabajar con listas de empleados.
public class Empleados_lista {

    //Devuelve el empleado con mayor salario.

    public static Empleados mayorSalario(List<Empleados> lista) {
        Empleados mayor = lista.get(0);
        for (Empleados e : lista) {
            if (e.getSalario() > mayor.getSalario()) {
                mayor = e;
            }
        }
        return mayor;
    }

    //Encuentra la edad más común entre los empleados.

    public static int edadMasComun(List<Empleados> lista) {
        int masComun = lista.get(0).getEdad();
        int maxFrecuencia = 0;

        for (Empleados e1 : lista) {
            int frecuencia = 0;
            for (Empleados e2 : lista) {
                if (e1.getEdad() == e2.getEdad()) {
                    frecuencia++;
                }
            }
            if (frecuencia > maxFrecuencia) {
                maxFrecuencia = frecuencia;
                masComun = e1.getEdad();
            }
        }
        return masComun;
    }

    //Calcula el promedio de edad de los empleados.

    public static double promedioEdad(List<Empleados> lista) {
        int suma = 0;
        for (Empleados e : lista) {
            suma += e.getEdad();
        }
        return (double) suma / lista.size();
    }

    //Calcula el promedio de salario de los empleados.

    public static double promedioSalario(List<Empleados> lista) {
        double suma = 0;
        for (Empleados e : lista) {
            suma += e.getSalario();
        }
        return suma / lista.size();
    }

    //Calcula el promedio de edad de empleados con salario mayor a 25mil.

    public static double promedioEdadMas25k(List<Empleados> lista) {
        int suma = 0;
        int contador = 0;
        for (Empleados e : lista) {
            if (e.getSalario() > 25000) {
                suma += e.getEdad();
                contador++;
            }
        }
        if (contador == 0) return 0;
        return (double) suma / contador;
    }

    //Filtra empleados menores de 25 años.

    public static List<Empleados> menoresDe25(List<Empleados> lista) {
        List<Empleados> resultado = new ArrayList<>();
        for (Empleados e : lista) {
            if (e.getEdad() < 25) {
                resultado.add(e);
            }
        }
        return resultado;
    }

    //Cuenta empleados en el departamento de sistemas.

    public static int contarSistemas(List<Empleados> lista) {
        int contador = 0;
        for (Empleados e : lista) {
            if (e.getDepartamento() == 1) {
                contador++;
            }
        }
        return contador;
    }

    //Devuelve el empleado con mayor salario y edad mayor a 30.

    public static Empleados mayorSalarioMas30(List<Empleados> lista) {
        Empleados mayor = null;
        for (Empleados e : lista) {
            if (e.getEdad() > 30) {
                if (mayor == null || e.getSalario() > mayor.getSalario()) {
                    mayor = e;
                }
            }
        }
        return mayor;
    }

    //Devuelve el empleado con menor salario y que la edad sea la menos común.

    public static Empleados menorSalarioEdadMenosComun(List<Empleados> lista) {
        int menosComun = lista.get(0).getEdad();
        int minFrecuencia = lista.size();

        for (Empleados e1 : lista) {
            int frecuencia = 0;
            for (Empleados e2 : lista) {
                if (e1.getEdad() == e2.getEdad()) {
                    frecuencia++;
                }
            }
            if (frecuencia < minFrecuencia) {
                minFrecuencia = frecuencia;
                menosComun = e1.getEdad();
            }
        }

        Empleados menor = null;
        for (Empleados e : lista) {
            if (e.getEdad() == menosComun) {
                if (menor == null || e.getSalario() < menor.getSalario()) {
                    menor = e;
                }
            }
        }
        return menor;
    }
}