/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio06.Servicio;

import ejercicio06.Entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class ServicioCafetera {
    Scanner leer = new Scanner(System.in);
    
    public Cafetera crearCafetera(){

        return new Cafetera(2000,0);
    }
    
    public void llenarCafetera(Cafetera c){
        c.setCantidadActual(c.getCapacidadMax());
}
    public void servirTaza(int capTaza, Cafetera c){
        if (capTaza<c.getCantidadActual()){
            c.setCantidadActual(c.getCantidadActual()-capTaza);
            System.out.println("Se llenó satisfactoriamente la taza");
        }else{
            System.out.println("No se llenó la taza completa, solo se llenaron "+c.getCantidadActual());
            c.setCantidadActual(0);
        }
    }
    public void vaciarCafetera(Cafetera c){
        c.setCantidadActual(0);
    }
    
    public void agrearCafe(int cant, Cafetera c){
        if (cant+c.getCantidadActual()>c.getCapacidadMax()){
            System.out.println("La cantidad que se deseaba agrear era mayor a la que soporta la cafetera, se llenó totalmente pero quedaron "+(c.getCapacidadMax()-cant-c.getCantidadActual())+" ml que no entraron");
            llenarCafetera(c);
        }else{
            c.setCantidadActual(cant+c.getCantidadActual());
        }
    }
}
