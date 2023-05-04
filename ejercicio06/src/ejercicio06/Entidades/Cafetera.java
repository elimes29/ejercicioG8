/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio06.Entidades;

/**
 *
 * @author usuario
 */
public class Cafetera {
    private int capacidadMax;
    private int cantidadActual;

    public Cafetera() {
    }

    public Cafetera(int capacidadMax, int cantidadActual) {
        this.capacidadMax = capacidadMax;
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMax() {
        return capacidadMax;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCapacidadMax(int capacidadMax) {
        this.capacidadMax = capacidadMax;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    @Override
    public String toString() {
        return "Cafetera{" + "capacidadMax=" + capacidadMax + ", cantidadActual=" + cantidadActual + '}';
    }
    
    
    
}
