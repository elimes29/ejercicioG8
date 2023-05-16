/*
 Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
Con la palabra del usuario, pone la longitud de la palabra, como la longitud del
vector. Después ingresa la palabra en el vector, letra por letra, quedando cada letra
de la palabra en un índice del vector. Y también, guarda en cantidad de jugadas
máximas, el valor que ingresó el usuario y encontradas en 0.
 Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
buscar como se usa el vector.length.
 Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
 Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
busque una letra que no esté, se le restará uno a sus oportunidades.
 Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
 Método juego(): el método juego se encargará de llamar todos los métodos
previamente mencionados e informará cuando el usuario descubra toda la palabra o
se quede sin intentos. Este método se llamará en el main.
 */
package servicio;

import entidad.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class ServicioAhorcado {

    Scanner leer = new Scanner(System.in);
    Scanner leer1 = new Scanner(System.in);

    public Ahorcado crearJuego() {
        System.out.println("Cuál es la palabra a adivinar?");
        String palabra = leer1.nextLine();
        String[] p = new String[palabra.length()];
        String[] pa = new String[palabra.length()];

        for (int i = 0; i < palabra.length(); i++) {
            p[i] = palabra.substring(i, i + 1);
        }
        System.out.println("¿Cuál es la cantidad máximas de jugadas?");
        int intentosMax = leer.nextInt();

        Arrays.fill(pa, "_");

        return new Ahorcado(p, 0, intentosMax, pa);
    }

    public int Longitud(Ahorcado ah) {
        //System.out.println("La lonitud de la palabra es: " + ah.getPalabra().length);
        return ah.getPalabra().length;
    }

    /*
     Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
     */
    public boolean Buscar(String letra, Ahorcado ah) {
        boolean encontrado = false;
        String letraV;
        for (int i = 0; i < ah.getPalabra().length; i++) {
            letraV = ah.getPalabra()[i];
            if (letra.equals(letraV)) {
                encontrado = true;
            }
        }
        /*
        if (encontrado) {
            System.out.println("Mensaje: La letra pertenece a la plabra");
        } else {
            System.out.println("Mensaje: La letra no pertenece a la plabra");
        }
         */

        return encontrado;
    }

    /*
         Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
busque una letra que no esté, se le restará uno a sus oportunidades.
     */
    public boolean Encontradas(String letra, Ahorcado ah) {
        boolean encontrada = false;
        String letraV;
        int cont = 0;
        String[] vAux = new String[Longitud(ah)];
        vAux = ah.getPalabraAdivina();

        for (int i = 0; i < ah.getPalabra().length; i++) {
            letraV = ah.getPalabra()[i];
            if (letra.equals(letraV)) {
                encontrada = true;
                cont++;
                vAux[i] = letraV;
            }
        }
        for (int i = 0; i < ah.getPalabra().length; i++) {
            System.out.print(vAux[i] + " ");
        }
        System.out.println("");

        ah.setPalabraAdivina(vAux);
        ah.setlEncontradas(ah.getlEncontradas() + cont);
        System.out.println("Número de letras (encontradas, faltantes): (" + ah.getlEncontradas() + "," + (Longitud(ah) - ah.getlEncontradas()) + ")");
        return encontrada;

    }

    /*
     Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
     */
    public void Intentos(Ahorcado ah, String letra) {
        if (Buscar(letra, ah)) {
            System.out.println("Quedan " + ah.getCantJuadasMax() + " oportunidades");
        } else {
            ah.setCantJuadasMax(ah.getCantJuadasMax() - 1);
            System.out.println("Quedan " + ah.getCantJuadasMax() + " oportunidades");
        }
    }

    /*
    Método juego(): el método juego se encargará de llamar todos los métodos
previamente mencionados e informará cuando el usuario descubra toda la palabra o
se quede sin intentos. Este método se llamará en el main.
     */
    public void Juego() {
        Ahorcado ah = crearJuego();
        //System.out.println(ah);
        System.out.println("------------------------------");
        System.out.print("\033[H\033[2J");
        System.out.flush();
        boolean cent = true;
        String letra;
        do {
            System.out.println("Ingrese una letra");
            letra = leer1.nextLine();
            System.out.println("Longitud de la palabra: " + Longitud(ah));

            if (Buscar(letra, ah)) {
                System.out.println("Mensaje: La letra pertenece a la palabra");
            } else {
                System.out.println("Mensaje: La letra no pertenece a la palabra");
            }

            Encontradas(letra, ah);

            Intentos(ah, letra);

            System.out.println("------------------------------");

            if ((ah.getCantJuadasMax() == 0)) {
                System.out.println("Mensaje: Lo sentimos, no hay más oportunidades.");
            }
            if (ah.getlEncontradas() == Longitud(ah)) {
                System.out.println("Encontraste la palabra, felicidades.");
            }

            if ((ah.getCantJuadasMax() == 0) || (ah.getlEncontradas() == Longitud(ah))) {
                cent = false;
            }
        } while (cent);
        String[] v=ah.getPalabraAdivina();
        for (int i = 0; i < ah.getPalabra().length; i++) {
            System.out.print(v[i]+" ");
            
        }
        System.out.println("");

    }

}
