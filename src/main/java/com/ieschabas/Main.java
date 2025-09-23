package com.ieschabas;

public class Main {
    public static void main(String[] args){
        /**
         * Código para la clase Persona
         */
        Persona persona1 = new Persona("Pedro Torres", 31, "123456789P");
        persona1.mostrarInformacion();

        /**
         * Código para la clase Rectángulo para calcular el área
         */
        //Uso de la clase Rectangulo
        Rectangulo rectangulo1 = new Rectangulo();
        Rectangulo rectangulo2 = new Rectangulo(2.3,3.5);
        //Setear la base y la altura del rectángulo1
        rectangulo1.setBase(4.5);
        rectangulo1.setAltura(8.4);

        System.out.println("Area del rectángulo1: " + rectangulo1.calcularArea());
        System.out.println("Área del rectángulo2: " + rectangulo2.calcularArea());

        /** Código para la clase CuentaBancaria
         */

        //Uso de la clase CuentaBancaria
        CuentaBancaria cuentaBancaria1 = new CuentaBancaria("Pedro Enrique", 100, 20);
        cuentaBancaria1.mostrarInformacion();
    }
}