/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14;

import ejercicio14.Entidad.Movil;
import ejercicio14.Servicio.ServicioMovil;

/**
 *
 * @author usuario
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServicioMovil sv = new ServicioMovil();
        Movil m = sv.cargarCelular();
        System.out.println(m);
    }
    
}
