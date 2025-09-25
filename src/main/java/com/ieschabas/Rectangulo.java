package com.ieschabas;

/** CLASE QUE DEFINE UN RECTÁNGULO
 * @author Pedro Torres Sesé
 * @version 1.0
 */

public class Rectangulo {

    private double base;
    private double altura;

    /**
     * Constructor por defecto de la clase rectángulo
     */
    public Rectangulo(){}
    /**
    Constructor sobrecargado
     */
    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    //Setters
    /**
     * Método que establece la base del rectángulo
     */
    public void setBase(double base) {
        this.base = base;}
    /**
     * Método que establece la altura del rectángulo
     */
    public void setAltura(double altura){
        this.altura = altura;}

    //Getters
    /**
     * Método que devuelve la base del rectángulo
     * @return base
     */
    public double getBase() {
        return this.base;
    }
    /**
     * Método que devuelve la altura del rectángulo
     * @return altura
     */
    public double getAltura() {
        return this.altura;
    }
    /**
     * Método que calcula el área del rectángulo
     * @return area
     */
    public double calcularArea(){
        return this.base * this.altura;
    }


}

