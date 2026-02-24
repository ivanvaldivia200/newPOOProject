package edu.ivan.valdivia.act3.process;

import edu.ivan.valdivia.act3.process.Empleados;
import edu.ivan.valdivia.act3.process.Empleados_lista;

import java.util.ArrayList;
import java.util.List;

public class Test_Empleados {
    public static void main(String[] args) {
        List<Empleados> empleados = new ArrayList<>();
        empleados.add(new Empleados(30, 20000, 1));
        empleados.add(new Empleados(25, 30000, 2));
        empleados.add(new Empleados(40, 25000, 1));
        empleados.add(new Empleados(25, 15000, 1));

        System.out.println("Mayor salario: " + Empleados_lista.mayorSalario(empleados).getSalario());

        System.out.println("Edad más común: " + Empleados_lista.edadMasComun(empleados));

        System.out.println("Promedio edad: " + Empleados_lista.promedioEdad(empleados));

        System.out.println("Promedio salario: " + Empleados_lista.promedioSalario(empleados));

        System.out.println("Promedio edad >25k: " + Empleados_lista.promedioEdadMas25k(empleados));

        System.out.println("Menores de 25: " + Empleados_lista.menoresDe25(empleados).size());

        System.out.println("Contar sistemas: " + Empleados_lista.contarSistemas(empleados));

        System.out.println("Mayor salario >30 años: " + Empleados_lista.mayorSalarioMas30(empleados).getSalario());

        System.out.println("Menor salario con edad menos común: " + Empleados_lista.menorSalarioEdadMenosComun(empleados).getSalario());
    }
}