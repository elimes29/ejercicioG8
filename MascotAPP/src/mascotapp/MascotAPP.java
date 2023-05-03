package mascotapp;

import java.util.Scanner;
import mascotapp.entidades.Mascota;

public class MascotAPP {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Mascota m1 = new Mascota("papa","Cholo", "perro");
        System.out.println(m1.getNombre());
        m1.setNombre("Elimes");
        
        System.out.println(m1);

        


    }

}
