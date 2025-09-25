package com.ieschabas;

public class Coche {
    private double velocidad;

    public Coche(double velocidad) {
        this.velocidad = velocidad;

    }

        public double getVelocidad(){
        return this.velocidad;
        }
        public void acelerar () {
        this.velocidad++;}

        public void frenar() {
            this.velocidad--;
            }

        }

