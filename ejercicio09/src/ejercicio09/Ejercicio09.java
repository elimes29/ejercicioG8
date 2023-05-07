/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio09;

import ejercicio09.Entidades.Matematica;
import ejercicio09.Servicio.ServicioMatematica;

/**
 *
 * @author usuario
 */
public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Creando el objeto con constructor vacio
        Matematica m = new Matematica();
        //llenando con valores 
        m.setNum1((float) Math.random() * 100);
        m.setNum2((float) Math.random() * 100);
        ServicioMatematica sm = new ServicioMatematica();
        
        System.out.println(m.getNum1()+" "+m.getNum2());
        System.out.println("El número mayor es: " +sm.devolverMayor(m));
        System.out.println("El numero mayor elevado al menor es: "+sm.calclarPotencia(m));
        System.out.println("La raiz del número menor es: "+sm.calcularRaiz(m));
        
        
        

    }

}
