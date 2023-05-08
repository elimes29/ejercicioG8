/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13;

import ejercicio13.Entidad.Curso;
import ejercicio13.Servicio.ServicioCurso;

/**
 *
 * @author usuario
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServicioCurso sc = new ServicioCurso();
        
        Curso c1=sc.crearCurso();
        
        System.out.println("La ganancia semanal de este curso es: "+sc.calcularGananciaSemanal(c1));
        System.out.println(c1);
    }
    
    
}
