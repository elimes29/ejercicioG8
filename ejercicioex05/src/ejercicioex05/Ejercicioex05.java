/*
Crea una clase en Java donde declares una variable de tipo array de Strings que
contenga los doce meses del año, en minúsculas. A continuación, declara una variable
mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo,
mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto. Si el
usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar
el mes secreto. Un ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!
 */
package ejercicioex05;

import java.util.Scanner;
import service.Mes;

/**
 *
 * @author usuario
 */
public class Ejercicioex05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Mes m = new Mes();
        String mesSecreto = m.getMeses()[7];
        boolean para = true;
        System.out.println("Adivine el mes secreto, intriduzca un mes:");
        String mes = leer.nextLine();

        while (para) {
            if (mes.equals(mesSecreto)) {
                System.out.println("¡Ha acertado!");
                para = false;
            }else{
                System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes:");
                mes=leer.nextLine();
            }
        }

    }

}
