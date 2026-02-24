package edu.ivan.valdivia.act3.process;

//Clase que representa a un empleado con edad, salario y departamento.
public class Empleados {
    private int edad;
    private double salario;
    private int departamento; // número en lugar de texto

    //Constructor para crear un empleado.

    public Empleados(int edad, double salario, int departamento) {
        this.edad = edad;
        this.salario = salario;
        this.departamento = departamento;
    }

    //obtiene la edad del empleado */
    public int getEdad() {
        return edad;
    }

    //obtiene el salario del empleado */
    public double getSalario() {
        return salario;
    }

    //obtiene el departamento del empleado */
    public int getDepartamento() {
        return departamento;
    }
}