/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio06;

import ejercicio06.Entidades.Cafetera;
import ejercicio06.Servicio.ServicioCafetera;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        ServicioCafetera sc = new ServicioCafetera();
        
        //Creamos una cafetera
        Cafetera c1 = sc.crearCafetera(); //2000 ml máximo y está vacia
        System.out.println(c1);
        System.out.println("");
        
        //Agregamos café 500ml
        sc.agrearCafe(500, c1);
        System.out.println("Agreamos 500 ml de café");
        System.out.println(c1);
        System.out.println("");
        
        //Servimos una taza de 100ml
        System.out.println("Servimos taza de café de 100ml");
        sc.servirTaza(100, c1);
        System.out.println(c1);
        System.out.println("");
        
        //Servimos taza de 450 ml
        System.out.println("Servimos taza de café de 450ml");
        sc.servirTaza(450, c1);
        System.out.println(c1);
        System.out.println("");
        
        //Agreamos café 150ml
        System.out.println("Agreamos 150ml de café a la cafetera");
        sc.agrearCafe(150, c1);
        System.out.println(c1);
        System.out.println("");
        
        //Aregamos café más de los que soporta la cafetera 1900ml
        System.out.println("Agreamos 1900ml de café a la cafetera");        
        sc.agrearCafe(1900, c1);
        System.out.println(c1);
        System.out.println("");
        
        //Vaciamos cafetera
        sc.vaciarCafetera(c1);
        System.out.println("Vaciamos cafetera");
        System.out.println(c1);
        System.out.println("");
        
        
        //LLenamos la cafetera nuevamente
        sc.llenarCafetera(c1);
        System.out.println("LLenamos cafetera (2000ml)");
        System.out.println(c1);
        
        
                

    }
    
}
