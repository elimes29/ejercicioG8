/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13.Servicio;

import ejercicio13.Entidad.Curso;
import java.util.Scanner;

/**
 *
 * @author usuario  método cargarAlumnos(): este método le permitirá al usuario
 * ingresar los alumnos que asisten a las clases. Nosotros nos encargaremos de
 * almacenar esta información en un arreglo e iterar con un bucle, solicitando
 * en cada repetición que se ingrese el nombre de cada alumno.  Método
 * crearCurso(): el método crear curso, le pide los valores de los atributos al
 * usuario y después se le asignan a sus respectivos atributos para llenar el
 * objeto Curso. En este método invocaremos al método cargarAlumnos() para
 * asignarle valor al atributo alumnos  Método calcularGananciaSemanal(): este
 * método se encarga de calcular la ganancia en una semana por curso. Para ello,
 * se deben multiplicar la cantidad de horas por día, el precio por hora, la
 * cantidad
 */
public class ServicioCurso {

    Scanner leer = new Scanner(System.in);
    Scanner leer1 = new Scanner(System.in);

    public String[] cargarAlumnos() {
        String v[] = new String[7];

        for (int i = 0; i < 7; i++) {
            System.out.println("Ingrese el mombre del alumno #" + (i + 1));
            v[i] = leer.nextLine();
        }
        return v;
    }

    public Curso crearCurso() {
        String nombreCurso;
        int cantHorasPorDia;
        int cantDiasPorSemana;
        String turno;
        float precioPorHora;
        String[] alumnos= new String[5];
        
        System.out.println("Ingrese el nombre del curso");
        nombreCurso=leer.nextLine();
        System.out.println("Ingrese la cantidad de horas por día");
        cantHorasPorDia=leer1.nextInt();
        System.out.println("Ingrese la cantidad de días por semana");
        cantDiasPorSemana=leer1.nextInt();
        System.out.println("Ingrese el turno del curso");
        turno=leer.nextLine();
        System.out.println("Ingrese el precio por hora");
        precioPorHora=leer1.nextFloat();
        alumnos=cargarAlumnos();
        
        return new Curso(nombreCurso,cantHorasPorDia,cantDiasPorSemana,turno,precioPorHora,alumnos);
        
    }
    
    /*
    Método calcularGananciaSemanal(): este
 * método se encarga de calcular la ganancia en una semana por curso. Para ello,
 * se deben multiplicar la cantidad de horas por día, el precio por hora, la
 * cantidad de alumnos y la cantidad de días a la semana que
se repite el encuentro.
    */
    
    public float calcularGananciaSemanal(Curso c){
        return c.getCantHorasPorDia()*c.getPrecioPorHora()*7*c.getCantDiasPorSemana();
    }

}
