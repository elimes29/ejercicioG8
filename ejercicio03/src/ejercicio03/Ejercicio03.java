/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio03;

import ejercicio03.Entidades.Operacion;
import ejercicio03.Servicio.ServicioOperacion;

/**
 *
 * @author usuario
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ServicioOperacion sop = new ServicioOperacion();
        Operacion op = sop.crearOperacion();
        
        System.out.println("La suma de los dos números es " + sop.Sumar(op));
        System.out.println("La resta de los dos números es "+sop.Restar(op));
        System.out.println("La multiplicacion de los dos números es "+sop.Multiplicar(op));
        System.out.println("La resta de los dos números es "+sop.Dividir(op));
    }
    
}
