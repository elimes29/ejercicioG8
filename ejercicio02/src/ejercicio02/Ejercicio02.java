/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02;

import ejercicio02.Entidades.Circunferencia;
import ejercicio02.Servicio.ServicioCircunferencia;

/**
 *
 * @author usuario
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Creando libro en clase SrevicioLibro, método crearlibro
        ServicioCircunferencia sc = new ServicioCircunferencia();
        //Asinando liro creado en ServicioLibro a l1 de clase libro para poder usar el toString
        Circunferencia c1 = sc.crearCircunferencia();
        System.out.println(c1);
        
        //Calculo de area
        System.out.println("El área del la circinferencia es: "+sc.area(c1.getRadio()));
        
        //Calculo de perímetro
        System.out.println("El perímetro del la circinferencia es: "+sc.perimetro(c1.getRadio()));
    }
    
}
