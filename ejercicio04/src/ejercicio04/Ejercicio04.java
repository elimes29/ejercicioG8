/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio04;

import ejercicio04.Entidad.Rectangulo;
import ejercicio04.Servicio.ServicioRectangulo;

/**
 *
 * @author usuario
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServicioRectangulo sr = new ServicioRectangulo();
        Rectangulo r = sr.CrearRectangulo();
        
        System.out.println(r);
        
        System.out.println("La superficie del rectángulo es: "+sr.Superficie(r));
        System.out.println("El perímetro del rectángulo es: "+sr.Perimetro(r));
        sr.DibujaRectangulo(r);
    }

}
