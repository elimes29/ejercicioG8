/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio05;

import ejercicio05.Entidad.Cuenta;
import ejercicio05.Servicio.ServicioCuenta;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
    
        ServicioCuenta sc = new ServicioCuenta();
        Cuenta c1 = sc.CrearCuenta();
        sc.ConsultarDatos(c1);
        
        //Depositando
        System.out.println("Cuanto desea Depositar??");
        sc.Ingresar(leer.nextDouble(), c1);
        sc.ConsultarDatos(c1);
        
        //Retirando
        System.out.println("Cuanto desea Retirar?");
        sc.Retirar(leer.nextDouble(), c1);
        sc.ConsultarDatos(c1);
        
        //Extraccion rápiada
        System.out.println("Esta es una extraccion rápida, solo puede retiarar hasta el 20% de su monto");
        System.out.println("Cuanto desea Retirar?");
        sc.ExtraccionRapida(leer.nextDouble(), c1);
        sc.ConsultarDatos(c1);
        
        //Consulta de saldo
        sc.ConsultarSaldo(c1);
        

        
    
    }
    
}
