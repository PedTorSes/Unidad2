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
    /**
     * Establecemos son los atributos de la clase
     * @param nombre
     * @param nota
     */
    public Alumno (String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    //Getters

    /**
     * Método que establece el nombre del alumno
     * @return nombre alumno
     */
    public String getNombre(){
        return nombre;
    }

    /**
     * Método que establece la nota del alumno
     * @return nota
     */
    public double getNota() {
        return nota;
    }
//Mostrar en pantalla

    public boolean aprobado(){ return (nota >= 5);
         }
         public void mostrarInformacion () {
             System.out.println("El alumno " + nombre + " ha sacado una nota de " + nota + " ¿se considera aprobado? " + aprobado());
         }

    }
