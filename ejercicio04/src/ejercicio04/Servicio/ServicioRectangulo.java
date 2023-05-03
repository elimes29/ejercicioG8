/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio04.Servicio;

import ejercicio04.Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class ServicioRectangulo {
    
    public Rectangulo CrearRectangulo(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Indique base de rectángulo");
        int base=leer.nextInt();
        System.out.println("Indique altura de rectángulo");
        int altura=leer.nextInt();
        
        return new Rectangulo(base,altura);
    }
    
    public int Superficie(Rectangulo r){
        return r.getBase()*r.getAltura();
    }
    
    public int Perimetro(Rectangulo r){
        return (2*r.getAltura()+2*r.getBase());
    }
    
    public void DibujaRectangulo(Rectangulo r){
        
        for (int i = 0; i < r.getAltura(); i++) {
            for (int j = 0; j < r.getBase(); j++) {
                if ((i==0) || (i==r.getAltura()-1) || (j==0) || (j==r.getBase()-1)){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println("");
        }
        
    }
    
}
