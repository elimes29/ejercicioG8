/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio01.servicio;

import ejercicio01.Entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class ServicioLibro {
     
    public Libro cargarLibro(){
        Scanner leer = new Scanner(System.in);
                
        System.out.println("Indique el ISBN del líbro");
        String isbn = leer.nextLine();
        System.out.println("Indique el título del líbro");
        String titulo = leer.nextLine();
        System.out.println("Indique el autor del líbro");
        String autor = leer.nextLine();
        System.out.println("Indique el número de páginas del líbro");
        int numPagina = leer.nextInt();
        
        return new Libro(isbn,titulo,autor,numPagina);
           
    }
}
