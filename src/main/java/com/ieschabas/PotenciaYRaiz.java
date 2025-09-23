package com.ieschabas;

public class PotenciaYRaiz {
    private int numero;

    public PotenciaYRaiz() {
    }

    public PotenciaYRaiz(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return this.numero();
    }

    private int numero() {
    }

    public double calcularRaizCuadrada() {
        return Math.sqrt(this.numero);

    }
    public double calcularPotencia(){
        return Math.pow(this.numero, 2);


    }

}
