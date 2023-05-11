/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioex04;

import entidad.NIF;
import servicio.NifServicio;

/**
 *
 * @author usuario
 */
public class Ejercicioex04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NifServicio nf = new NifServicio();
        NIF n = nf.crearNif();
        nf.mostrar(n);
        
        
        
    }
    
}
