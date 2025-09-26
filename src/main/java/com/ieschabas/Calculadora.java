package com.ieschabas;

/**
 * En la siguiente clase vamos a desarrollar una calculadora en la que podamos sumar, restar, multiplicar y dividir dos números
 * @author Pedro Enrique Torres
 * @version 1.0
 */

public class Calculadora {
    //Atributos
    private double numero1;
    private double numero2;

    // Constructor sobrecargado
    public Calculadora(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    //Getters
    /**
     * Getters para obtener el número1 y numero 2
     * @return numero1
     * @return numero2
     */

    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    //Setters
    /**
     * Setters para modificar el valor de número1
     * @param numero1
     */

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    /**
     * Setters para modificar el valor de número2
     * @param numero2
     */

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    //Suma

    /**
     * En esta parte del código, establecemos las variables públicas de sumar, restar, multiplicar y dividir y nos devuelve la operación que corresponda
     * @return resultados
     */
    public double sumar () {
        return numero1 + numero2;
    }
    public double restar (){
        return numero1 - numero2;
    }
    public double multiplicacion(){
        return numero1 * numero2;
    }
    public double division() {
        return numero1 / numero2;
    }
    //Para mostar información

    public void mostrarInformacion(){
        System.out.println("El valor del primer número es: " + numero1);
        System.out.println("El valor del segundo número es: " + numero2);
        System.out.println("El resultado de la suma de ambos números es: " + sumar());
        System.out.println("El resultado de la resta de ambos números es: " + restar());
        System.out.println("El resultado de la multiplicación de ambos números es: " + multiplicacion());
        System.out.println("El resultado de la división de ambos números es: " + division());
    }
}