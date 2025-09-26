package com.ieschabas;
/**
 * Clase Main agrupando los resultados de todas las demás clases para verlos en pantalla
 * @author Pedro Enrique Torres
 */

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

        /**
         * Código para la clase coche, con su velocidad incial, si velocidad tras acelerar y frenar
         */
        //Uso de la clase Coche
        //Velocidad incial
        Coche coche1 = new Coche(100);
        coche1.getVelocidad();
        System.out.println("La velocidad de inicial del coche es: " + coche1.getVelocidad());
        // Aceleración
        coche1.acelerar();
        System.out.println("Después de acelerar el coche está yendo a una velocidad de: " + coche1.getVelocidad());
        //Frenado
        coche1.frenar();
        System.out.println("Después de un frenazo intenso, el coche circula a: " + coche1.getVelocidad());


        /**
         * Código de la clase PotenciaYRaíz
         */

        //Cálculo de la raíz cuadrada

        Math raizCuadrada = new Math(3);
        double resultadoRaizCuadrada = raizCuadrada.calcularRaizCuadrada();
        System.out.println("La raíz cuadrada de 5 es: " + resultadoRaizCuadrada);

        //Cálculo de la potencia

        Math potencia = new Math(5);
        double resultadoPotencia = potencia.calcularPotencia();

        System.out.println("La potencia del 5 es: " + resultadoPotencia);

        /**
         * Código para la clase Libro
         */
        //Datos del libro
        Libro libro1 = new Libro("Programación para dummies", "Pedro Torres", 1 );
        libro1.mostrarInformacion();

        /**
         * Código para la clase Alumno, aquí trataremos de anunciar si el alumno ha aprobado 5< o si ha suspendido 5>
         */
        // Resultados
        Alumno alumno1 = new Alumno("Pedro Torres", 5);
        alumno1.mostrarInformacion();

        /**
         * Código para mostrar la clase Círculo donde calculamos el área de un círculo
         */

        Circulo circulo1 = new Circulo(10);
        circulo1.mostrarInformacion();

        /**
         * Código para mostrar las operaciones que queremos realizar con la calculadora y su resultado
         */
        Calculadora calculadora1 = new Calculadora(10, 8);
        calculadora1.mostrarInformacion();



    }
}
