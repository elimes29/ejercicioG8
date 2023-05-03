/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej01;

import Entidad.Persona;

/**
 *
 * @author usuario
 */
public class POOEj01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Instanciación utilizando el constructor vacío
        Persona primeraPersona = new Persona();
        //Instanciacion utilizando el constructor por parámetro
        Persona segundaPersona = new Persona("Elimes Rodríguez", 39, "venezolano");
        
        //Usos de set
        primeraPersona.setNombre("Dionelys Barazarte");
        primeraPersona.setEdad(32);
        primeraPersona.setNacionalidad("Venezolana");
        
        //Usos de get
        System.out.println(segundaPersona.getNombre());
        System.out.println(primeraPersona.getNombre());
    
        //Set y get
        segundaPersona.setEdad(40);
        System.out.println(segundaPersona.getEdad());
        System.out.println(primeraPersona.getEdad());
        
    }

}
