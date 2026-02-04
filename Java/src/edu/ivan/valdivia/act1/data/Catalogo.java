package edu.ivan.valdivia.act1.data;

import java.util.List;

/**Tenemos una marca de vehículo con nombre, precio, año y características.*/

public class Catalogo {
    public static class Marca {
        public String nombre;
        public double precio;
        public int anio;
        public String caracteristicas;

        /** Constructor de la clase Marca
         * @param nombre=Nombre del vehículo
         * @param precio=Precio del vehículo
         * @param anio=Anio del modelo
         * @param caracteristicas descriptivas del vehículo
         */

        public Marca(String nombre, double precio, int anio, String caracteristicas) {
            this.nombre = nombre;
            this.precio = precio;
            this.anio = anio;
            this.caracteristicas = caracteristicas;
        }
    }

    /** Representa un tipo de vehículo que contiene varias marcas
     -Tipo de vehículo (Sedán, SUV, Coupe.)
     -Lista de marcas disponibles para este tipo de vehículo */

    public static class Vehiculo {
        public String tipo;
        public List<Marca> marcas;

        /**Constructor de la clase Vehiculo
         -@param tipo Tipo de vehículo (Sedan, SUV, Coupe)
         - @param marcas Lista de marcas disponibles para este tipo*/

        public Vehiculo(String tipo, List<Marca> marcas) {
            this.tipo = tipo;
            this.marcas = marcas;
        }
    }
}
