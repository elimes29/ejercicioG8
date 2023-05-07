/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12.Servicio;

import ejercicio12.Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class ServicioPersona {

    Scanner leer1 = new Scanner(System.in);
    Scanner leer2 = new Scanner(System.in);

    /*
    Agregar un método de creación del objeto que respete la siguiente firma:
    crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
    usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
    fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
     */
    public Persona crearPersona() {
        System.out.println("Ingrese el nombre de la persona");
        String nombre = leer1.nextLine();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el dia de la fecha de nacimiento XX");
        int dia = leer.nextInt();
        System.out.println("Inrese el mes de la fecha de nacimiento XX");
        int mes = leer.nextInt() - 1;
        System.out.println("Ingrese el año de la fecha de nacimiento XXXX");
        int ano = leer.nextInt() - 1900;
        Date fecha = new Date(ano, mes, dia);
        return new Persona(nombre, fecha);
    }

    /*
    Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
    en cuenta que para conocer la edad de la persona también se debe conocer la fecha
    actual.
     */
    public long calcularEdad(Persona p) {
        Date hoy = new Date();
        int edad = hoy.getYear() - p.getFechaNac().getYear() - 1;

        if (hoy.getMonth() > p.getFechaNac().getMonth()) {
            edad++;
        }

        if (hoy.getMonth() == p.getFechaNac().getMonth()) {
            if ((hoy.getDate()) >= (p.getFechaNac().getDate())) {
                edad++;
            }
        }
        return edad;
    }
    /*
    Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
    edad y retorna true en caso de que el receptor tenga menor edad que la persona que
    se recibe como parámetro, o false en caso contrario.
     */
    
    public boolean menorQue(int edad,Persona p){
        return calcularEdad(p)<edad;
    }
    
    /*
    Metodo mostrarPersona(): este método muestra la persona creada en el método
    anterior.
    */
     public void mostrarPersona(Persona p){
         System.out.println("El nombre de la persona es: "+p.getNombre());
         System.out.println("Su fecha de nacimeinto es: "+p.getFechaNac().getDate()+"/"+(p.getFechaNac().getMonth()+1)+"/"+(p.getFechaNac().getYear()+1900));
         System.out.println("Tiene "+calcularEdad(p)+" años de edad");
     }
}
