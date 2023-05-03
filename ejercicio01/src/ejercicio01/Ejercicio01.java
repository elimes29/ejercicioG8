/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio01;

import ejercicio01.Entidades.Libro;
import ejercicio01.servicio.ServicioLibro;

/**
 *
 * @author usuario
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Creando libro en clase SrevicioLibro, método crearlibro
        ServicioLibro sl = new ServicioLibro();
        //Asinando liro creado en ServicioLibro a l1 de clase libro para poder usar el toString
        Libro l1 = sl.cargarLibro();
        System.out.println(l1);
        
        
    }

}
