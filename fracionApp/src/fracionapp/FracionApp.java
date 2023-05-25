/*
Crear una clase llamada fracción que contenga 4 atributos (denominador y numerador de cada
fracción). Crear la clase servicio que contenga métodos para sumar, restar, multiplicar y dividir
fracciones. Mostrar por pantalla un menú de opciones para que el usuario decida que ver.
 */
package fracionapp;

import java.util.Scanner;
import servicio.ServicioFraccion;

/**
 *
 * @author usuario
 */
public class FracionApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        ServicioFraccion sf = new ServicioFraccion();
        boolean cent = true;
        String opc;

        //Menú
        do {
            System.out.println("***********************************");
            System.out.println("Que desea hacer con las fracciones?");
            System.out.println("1: Sumar");
            System.out.println("2: Restar");
            System.out.println("3: Multiplicar");
            System.out.println("4: Dividir");
            System.out.println("Otro: Salir");
            opc = leer.nextLine();
            switch (opc) {
                case "1":
                    sf.Sumar();
                    break;
                case "2":
                    sf.Restar();
                    break;
                case "3":
                    sf.Multiplicar();
                    break;
                case "4":
                    sf.Dividir();
                    break;
                default:
                    System.out.println("Gracias por utilizar la calculadora de fracciones");
                    cent = false;
                    break;
            }

        } while (cent);

    }

}
