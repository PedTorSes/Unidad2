package com.ieschabas;

/** CLASE PARA UNA CUENTA BANCARIA
 * @author Pedro Enrique Torres Sesé
 * @version 1.0
 */

public class CuentaBancaria {
    /**
     * Atributos del titular de la cuenta y del sueldo
     */
    private String titular;
    private double saldo = 0.0;
    /**
     * Aquí asignamos los parámetros que queremos para la clase
     * @param titular
     * @param ingresar
     * @param retirar
     */
    public CuentaBancaria(String titular, double ingresar, double retirar){
        this.titular = titular;
        this.saldo = 0.0;
        ingresar(ingresar);
        retirar(retirar);
    }
    //SETTERS
    /**
     * Método para ingresar en la cuenta corriente del banco
     */
    public void ingresar(double ingreso){
        this.saldo = this.saldo + ingreso;
        //También podría ser: this.saldo += ingreso;
    }
    /**
     * Metodo para retirar de la cuenta corriente del banco
     */
    public void retirar(double retiro){
        this.saldo = this.saldo - retiro;
        //También podría ser: this.saldo -= retiro;
    }
    /**
     * Método para mostrar la información de la cuenta
     */
    public void mostrarInformacion(){
        System.out.println("Titular: " + titular + ". Y su saldo es de: " + saldo + "€.");
    }
}
