/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio05.Entidad;

/**
 *
 * @author usuario
 */
public class Cuenta {
    private int numCuenta;
    private int dni;
    private double saldo;
    private float interes;
    private String nombre;

    public Cuenta() {
    }

    public Cuenta(int numCuenta, int dni, double saldo, float interes) {
        this.numCuenta = numCuenta;
        this.dni = dni;
        this.saldo = saldo;
        this.interes = interes;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public int getDni() {
        return dni;
    }

    public double getSaldo() {
        return saldo;
    }

    public float getInteres() {
        return interes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setInteres(float interes) {
        this.interes = interes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numCuenta=" + numCuenta + ", dni=" + dni + ", saldo=" + saldo + ", interes=" + interes + ", nombre=" + nombre + '}';
    }
    
    
    
            
    
}
