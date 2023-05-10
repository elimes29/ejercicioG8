/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioex02;

import entidad.Puntos;
import servicio.ServicioPuntos;

/**
 *
 * @author usuario
 */
public class Ejercicioex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioPuntos servicioPuntos = new ServicioPuntos();
        Puntos p = servicioPuntos.crearPuntos();
        System.out.println("La distancia entre los puntos son: "+servicioPuntos.calcular(p));
    }
    
}
