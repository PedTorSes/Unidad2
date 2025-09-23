package com.ieschabas;

public class PotenciaYRaiz {
    private int numero;
    public PotenciaYRaiz() {
    }
    public PotenciaYRaiz(int numero) {
        this.numero = numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    public int getNumero() {
        return this.numero;
    }
    //Número base
    public double calcularRaizCuadrada() {
        return Math.sqrt(this.numero);
    }
    //Exponente
    public double calcularPotencia(){
        return Math.pow(this.numero, 2);
    }

}
