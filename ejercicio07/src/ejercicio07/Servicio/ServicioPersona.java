/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio07.Servicio;

import ejercicio07.Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class ServicioPersona {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Scanner leer2 = new Scanner(System.in);
    public Persona CrearPersona(){
        System.out.println("Indique el nombre de la Persona");
        String nombre=leer2.nextLine();
        System.out.println("Indique la edad de la Persona");
        int edad=leer.nextInt();
        System.out.println("Indique el sexo de la persona ('H' hombre, 'M' mujer, 'O' otro");
        char sexo=leer.next().charAt(0);
        System.out.println("Indique el peso de la Persona");
        float peso=leer.nextFloat();
        System.out.println("Indique la estatura de la Persona");
        float estatura=leer.nextFloat();
        
        return new Persona(nombre,edad,sexo,peso,estatura);
    }
    
    /*
Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
    */
    
    public int CalcularIMC(Persona p){
        float imc=(p.getPeso()/(p.getAltura()*p.getAltura()));
        int cent;
        if (imc<20){
            cent=-1;
        }else if(20<=imc && imc>=25){
            cent=0;
        }else{
            cent=1;
        }
        return cent;
    }
    
    /*
    Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
    */
    
    public boolean EsMayorDeEdad(Persona p){
        return p.getEdad()>=18;
    }
}
