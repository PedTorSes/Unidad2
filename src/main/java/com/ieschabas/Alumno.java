package com.ieschabas;

/**
 * Actividad en la cual vamos a establecer si el alumno ha aprobado = true o si ha suspendido = false
 * @author Pedro Torres
 * @version 1.0
 */

public class Alumno {
    private String nombre;
    private double nota;

    //Constructor

    public Alumno() {}

    //Constructor sobrecargado

    public Alumno (String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    //Getters
    public String getNombre(){
        return nombre;
    }

    public double getNota() {
        return nota;
    }

    public boolean aprobado(){ return (nota >= 5);
         }
         public void mostrarInformacion () {
             System.out.println("El alumno " + nombre + " ha sacado una nota de " + nota + " ¿se considera aprobado? " + aprobado());
         }

    }
