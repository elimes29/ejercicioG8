/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Puntos;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class ServicioPuntos {
    Scanner leer = new Scanner(System.in);
    
    public Puntos crearPuntos(){
        System.out.println("Ingrese el valor x del punto 1");
        float x1=leer.nextFloat();
        System.out.println("Ingrese el valor y del punto 1");
        float y1=leer.nextFloat();
        System.out.println("Ingrese el valor x del punto 2");
        float x2=leer.nextFloat();
        System.out.println("Ingrese el valor y del punto 2");
        float y2=leer.nextFloat();
        return new Puntos(x1,y1,x2,y2);
    }
    
    public double calcular(Puntos p){
        return Math.sqrt((Math.pow(p.getX2()-p.getX1(),2)+Math.pow(p.getY2()-p.getY1(),2)));
    }
}
