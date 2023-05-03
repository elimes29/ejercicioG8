/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio05.Servicio;

import ejercicio05.Entidad.Cuenta;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class ServicioCuenta {

    public Cuenta CrearCuenta() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Inrese su DNI");
        int dni = leer.nextInt();
        System.out.println("Inrese su numero de cuenta");
        int numCuenta = leer.nextInt();
        System.out.println("Ingrese su saldo de apertura");
        double saldo = leer.nextFloat();
        System.out.println("Inrese el interes de la cuenta");
        float interes = leer.nextFloat();
        //crea y retorna una cuenta
        return new Cuenta(numCuenta, dni, saldo, interes);
    }

    public void Ingresar(double monto, Cuenta c) {
        c.setSaldo(c.getSaldo() + monto);
    }

    public void Retirar(double monto, Cuenta c) {
        c.setSaldo(c.getSaldo() - monto);
    }

    public void ExtraccionRapida(double monto, Cuenta c) {
        if (monto > 0.2 * c.getSaldo()) {
            System.out.println("No puede sacar esta cantidad");
        } else {
            c.setSaldo(c.getSaldo() - monto);
        }
    }
    
    public void ConsultarSaldo(Cuenta c){
        System.out.println("El monto en su centa es: "+c.getSaldo());
    } 
    
    public void ConsultarDatos(Cuenta c){
        System.out.println(c);
    }
}
