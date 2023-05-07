/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
se puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 */
package ejercicio11;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Inrese el dia de la fecha XX");
        int dia = leer.nextInt();
        System.out.println("Inrese el mes de la fecha XX");
        int mes = leer.nextInt()-1;
        
        System.out.println("Inrese el año de la fecha XXXX");
        int ano = leer.nextInt()-1900;
        
        Date fecha1 = new Date(ano,mes,dia);
        System.out.println(fecha1.toString());
        
        Date fechaHoy = new Date();
        System.out.println(fechaHoy.toString());
        
        System.out.println("Enre las dos fechas hay "+(fechaHoy.getYear()-fecha1.getYear())+" años");

        
    }
    
}
