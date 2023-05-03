/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio03.Servicio;

import ejercicio03.Entidades.Operacion;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class ServicioOperacion {

    public Operacion crearOperacion() {

        Scanner leer = new Scanner(System.in);
        //Solicitamos los parámetros por pantalla
        System.out.println("Indiqe el primer número");
        int n1 = leer.nextInt();
        System.out.println("Indiqe el segundo número");
        int n2 = leer.nextInt();

        //llamamos constrcutor con atributos
        return new Operacion(n1, n2);
    }

    public int Sumar(Operacion o) {

        return o.getNumero1() + o.getNumero2();
    }

    public int Restar(Operacion o) {

        return o.getNumero1() - o.getNumero2();
    }

    public int Multiplicar(Operacion o) {
        if (o.getNumero1()*o.getNumero2()==0){ 
            System.out.println("Ingresó una miltiplicacion por cero");
            return 0;
        }else{
            return o.getNumero1() * o.getNumero2();
        }
    }
    
    public float Dividir(Operacion o) {
        if (o.getNumero2()==0){ 
            System.out.println("Ingresó una division por 0");
            return 0;
        }else{
            return (float) o.getNumero1() / o.getNumero2();
        }
    }

}
