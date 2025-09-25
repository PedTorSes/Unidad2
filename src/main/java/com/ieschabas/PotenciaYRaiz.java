package com.ieschabas;

/**
 * Clase PotenciayRaiz en la cual calcularemos la potencia y la raíz cuadrada de los valores que asignemos
 * @author Pedro Enrique Torres Sesé
 * @version 1.0
 */


public class PotenciaYRaiz {

    // Atributo
    private int numero;

    //Constructores
    public PotenciaYRaiz() {
    }
    //Constructor sobrecargado
    public PotenciaYRaiz(int numero) {
        this.numero = numero;
    }
    //Setter

    /**
     * Método para establece el número que vamos a elevar
     * @param numero
     */

    public void setNumero(int numero){
        this.numero = numero;
    }
    //Getter

    /**
     * Método en el que devuelve el número establecido en el setter
     * @return numero
     */
    public int getNumero() {
        return this.numero;
    }
    //Número base
    /**
     * Método para calcular la raíz cuadrada del número
     * @return  resultado raíz cuadrada
     */
    public double calcularRaizCuadrada() {
        return Math.sqrt(this.numero);
    }
    //Exponente

    /**
     * Método para calcular la potencia del número
     * @return resultado potencia
     */
    public double calcularPotencia(){
        return Math.pow(this.numero, 2);
    }

}
