/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02.Servicio;

import ejercicio02.Entidades.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class ServicioCircunferencia {

    public Circunferencia crearCircunferencia() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Indique el radio de la circunferencia");
        float radio = leer.nextFloat();
        return new Circunferencia(radio);
    }

    public float area(float radio) {
        
        return (float)(3.14*radio*radio);
    }
    public float perimetro(float radio) {
        
        return (float)(2*3.14*radio);
    }
    
}

