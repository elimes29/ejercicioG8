/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14.Servicio;

import ejercicio14.Entidad.Movil;
import java.util.Scanner;

/**
 *
 * @author usuario  Método cargarCelular(): se solicita al usuario que ingrese
 * los datos necesarios para instanciar un objeto Celular y poder cargarlo en
 * nuestro programa.  Método ingresarCodigo(): este método permitirá ingresar
 * el código completo de siete números de un celular. Para ello, puede
 * utilizarse un bucle repetitivo
 */
public class ServicioMovil {

    Scanner leer1 = new Scanner(System.in);
    Scanner leer2 = new Scanner(System.in);

    public Movil cargarCelular() {
        System.out.println("Ingrese la marca del celular");
        String marca = leer1.nextLine();
        System.out.println("Ingrese el precio del celular");
        float precio = leer2.nextFloat();
        System.out.println("Ingrese el modelo del celular");
        String modelo = leer1.nextLine();
        System.out.println("Ingrese la memoria RAM del celular");
        int memoriaRam = leer2.nextInt();
        System.out.println("Ingrese la memoria de almacenamiento del celular");
        int almacenamiento = leer2.nextInt();
        int[] codigo = ingresarCodigo();
        return new Movil(marca, precio, modelo, memoriaRam, almacenamiento, codigo);

    }

    public int[] ingresarCodigo() {

        int[] v = new int[7];
        for (int i = 0; i < 7; i++) {
            System.out.println("Ingrese el digito #" + (i + 1) + " del código del celular");
            v[i] = leer2.nextInt();
        }
        return v;
    }
}
