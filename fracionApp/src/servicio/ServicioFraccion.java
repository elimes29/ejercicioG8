/*
Crear la clase servicio que contenga métodos para sumar, restar, multiplicar y dividir
fracciones.
 */
package servicio;

import entidad.Fraccion;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class ServicioFraccion {
    public Fraccion f;
    Scanner leer = new Scanner(System.in);
    
    public ServicioFraccion(){
        System.out.println("Ingrese el numerador del primer número");
        int a=leer.nextInt();
        System.out.println("Ingrese el denominador del primer número");
        int b = (leer.nextInt());
        System.out.println("Ingrese el numerador del segundo número");
        int c = (leer.nextInt());
        System.out.println("Ingrese el denominador del segundo número");
        int d = (leer.nextInt());
        f = new Fraccion(a,b,c,d);
    }
    
    public void Sumar(){
        System.out.println("El resultado de la suma es: ");
        System.out.println((f.getNum1()*f.getDen2())+(f.getDen1()*f.getNum2()));
        System.out.println("---");
        System.out.println(f.getDen1()*f.getDen2());
    }
    
    public void Restar(){
        System.out.println("El resultado de la resta es: ");
        System.out.println((f.getNum1()*f.getDen2())-(f.getDen1()*f.getNum2()));
        System.out.println("---");
        System.out.println(f.getDen1()*f.getDen2());
    }
    
    public void Multiplicar(){
        System.out.println("El resultado de la resta es: ");
        System.out.println((f.getNum1()*f.getNum2()));
        System.out.println("---");
        System.out.println(f.getDen1()*f.getDen2());
    }
        public void Dividir(){
        System.out.println("El resultado de la resta es: ");
        System.out.println((f.getNum1()*f.getDen2()));
        System.out.println("---");
        System.out.println(f.getDen1()*f.getNum2());
    }
}
