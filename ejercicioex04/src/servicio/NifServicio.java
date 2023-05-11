/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.NIF;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class NifServicio {

    Scanner leer = new Scanner(System.in);

    public NIF crearNif() {
        NIF n = new NIF();
        System.out.println("Ingrese el número DIN");
        long dni = leer.nextLong();
        n.setDni(dni);
        String[] vector = new String[23];
        vector[0] = "T";
        vector[1] = "R";
        vector[2] = "W";
        vector[3] = "A";
        vector[4] = "G";
        vector[5] = "M";
        vector[6] = "Y";
        vector[7] = "F";
        vector[8] = "P";
        vector[9] = "D";
        vector[10] = "X";
        vector[11] = "B";
        vector[12] = "N";
        vector[13] = "J";
        vector[14] = "Z";
        vector[15] = "S";
        vector[16] = "Q";
        vector[17] = "V";
        vector[18] = "H";
        vector[19] = "L";
        vector[20] = "C";
        vector[21] = "K";
        vector[22] = "E";

        n.setLetra(vector[(int) (dni % 23)]);
        return n;

    }

    public void mostrar(NIF n) {
        //System.out.println(n);
        System.out.println(n.getDni() + "-" + n.getLetra());
    }

}
