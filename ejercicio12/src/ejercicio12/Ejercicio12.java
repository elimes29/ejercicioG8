/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;

import ejercicio12.Entidad.Persona;
import ejercicio12.Servicio.ServicioPersona;

/**
 *
 * @author usuario
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServicioPersona sp = new ServicioPersona();
        Persona p = sp.crearPersona();
        
        System.out.println("Es menor que 40 "+sp.menorQue(40, p));
        
        sp.mostrarPersona(p);
        
                
    }
    
}
