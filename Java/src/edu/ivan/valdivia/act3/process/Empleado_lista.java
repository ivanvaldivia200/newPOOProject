package edu.ivan.valdivia.act3.process;

import java.util.*;
import java.util.stream.Collectors;

/**Métodos utilitarios para trabajar con listas de empleados.*/
public class Empleados_lista {

    public static Empleados mayorSalario(List<Empleados> empleados) {
        return empleados.stream()
                .max(Comparator.comparingDouble(Empleados::getSalario))
                .orElse(null);
    }

    public static int edadMasComun(List<Empleados> empleados) {
        return empleados.stream()
                .collect(Collectors.groupingBy(Empleados::getEdad, Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(-1);
    }

    public static double promedioEdad(List<Empleados> empleados) {
        return empleados.stream()
                .mapToInt(Empleados::getEdad)
                .average()
                .orElse(0.0);
    }

    public static double promedioSalario(List<Empleados> empleados) {
        return empleados.stream()
                .mapToDouble(Empleados::getSalario)
                .average()
                .orElse(0.0);
    }

    public static double promedioEdadMas25K(List<Empleados> empleados) {
        return empleados.stream()
                .filter(e -> e.getSalario() > 25000)
                .mapToInt(Empleados::getEdad)
                .average()
                .orElse(0.0);
    }

    public static List<Empleados> menoresDe25(List<Empleados> empleados) {
        return empleados.stream()
                .filter(e -> e.getEdad() < 25)
                .collect(Collectors.toList());
    }

    public static long contarSistemas(List<Empleados> empleados) {
        return empleados.stream()
                .filter(e -> e.getDepartamento().equalsIgnoreCase("sistemas"))
                .count();
    }

    public static Empleados mayorSalarioMas30(List<Empleados> empleados) {
        return empleados.stream()
                .filter(e -> e.getEdad() > 30)
                .max(Comparator.comparingDouble(Empleados::getSalario))
                .orElse(null);
    }

    public static Empleados menorSalarioEdadMenosComun(List<Empleados> empleados) {

        /**Contar ocurrencias de cada edad*/
        Map<Integer, Long> conteoEdades = empleados.stream()
                .collect(Collectors.groupingBy(Empleados::getEdad, Collectors.counting()));

        /**Encontrar la frecuencia mínima*/
        long frecuenciaMinima = conteoEdades.values().stream()
                .min(Long::compare)
                .orElse(Long.MAX_VALUE);

        /**Filtrar empleados cuya edad tenga esa frecuencia mínima*/
        return empleados.stream()
                .filter(e -> conteoEdades.get(e.getEdad()) == frecuenciaMinima)
                .min(Comparator.comparingDouble(Empleados::getSalario))
                .orElse(null);
    }
}