package com.ieschabas;

/**
 * CLASE EN LA CUAL VAMOS A ESTABLECER UNOS USUARIOS CON SUS DATOS PERSONALES
 * @author Pedro Enrique Torres Sesé
 * @version 1.0
 */

public class Persona {
    // Atributos
    /**
     * Aquí establecemos los datos internos en la clase de nombre, edad y documentación de los usuarios
     */
    private String nombre;
    private int edad;
    private String documentacion;

    // Constructores

    /**
     * En este apartado del documento establecemos los parámetros que solicitamos para realizar la ficha personal
     * @param nombre
     * @param edad
     * @param documentacion
     */
    public Persona(String nombre, int edad, String documentacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.documentacion = documentacion;
    }

    /**
     * Finalmente, establecemos el código para que nos muestre el mensaje personalizado con los datos insertados
     */
    // Método para mostrar la información
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + " Documentación: " + documentacion);
    }
}