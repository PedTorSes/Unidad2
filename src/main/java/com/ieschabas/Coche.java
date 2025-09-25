package com.ieschabas;

/**
 * Clase Coche donde asignamos la velocidad del vehículo y calculamos una velocidad en aceleración y otra en frenado
 * @author Pedro Enrique Torres
 * @version 1.0
 */

public class Coche {
    private double velocidad;

    /**
     * Establecemos los parámetros del coche
     * @param velocidad
     */
    public Coche(double velocidad) {
        this.velocidad = velocidad;

    }
    //Getter

    /**
     * Pedimos la velocidad
     * @return velocidad
     */

        public double getVelocidad(){
        return this.velocidad;
        }

    /**
     * Método para calcular la aceleración del coche
     */
    public void acelerar () {
        this.velocidad++;
    }

    /**
     * Método para calcular el frenado del coche
     */
        public void frenar() {
            this.velocidad--;
            }

        }

