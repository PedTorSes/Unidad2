package com.ieschabas;

public class Circulo {

    private final double pi = 3.14;
    private double radio;

    //Constructores
    public Circulo(){}

    //Constructor sobrecargado
    public Circulo(double radio){
        this.radio = radio;
    }
    //Setters
    public void setRadio(double radio){
        this.radio = radio;
    }

    //Getter
    public double getRadio() {return this.radio;
    }

    public double calcularArea(){
        return this.radio * this.radio * pi;
    }
    public void mostrarInformacion() {
        System.out.printf("El área del círculo con radio " + radio + " es igual a " + calcularArea());
    }
}
