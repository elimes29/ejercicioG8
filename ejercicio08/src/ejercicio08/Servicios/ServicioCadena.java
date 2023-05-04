/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio08.Servicios;

import ejercicio08.Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class ServicioCadena {

    Scanner leer = new Scanner(System.in);

    public Cadena crearCadena() {

        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();

        return new Cadena(frase);

    }


    /*
    Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
     */
    public int mostrarVocales(Cadena c) {
        String letra;
        int cont = 0;

        for (int i = 0; i < c.getFrase().length(); i++) {
            letra = c.getFrase().substring(i, i + 1);
            if (("A".equals(letra.toUpperCase())) || ("E".equals(letra.toUpperCase())) || ("I".equals(letra.toUpperCase())) || ("O".equals(letra.toUpperCase())) || ("U".equals(letra.toUpperCase()))) {
                cont++;
            }
        }
        return cont;

    }

    /*
Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
     */
    public void invertirFrase(Cadena c) {
        String fraseInv = "";
        for (int i = 0; i < c.getFrase().length(); i++) {
            fraseInv = fraseInv + c.getFrase().substring(c.getFrase().length() - i - 1, c.getFrase().length() - i);

        }
        System.out.println("La frase invertida es: " + fraseInv);

    }

    /**
     * Método vecesRepetido(String letra), recibirá un carácter ingresado por el
     * usuario y contabilizar cuántas veces se repite el carácter en la frase,
     * por ejemplo:
     *
     * @param c Cadena
     * @param l letra a buscar en c adena
     * @return veces que aparece
     */
    public int vecesRepetido(Cadena c, String l) {
        String letra;
        int cont = 0;
        for (int i = 0; i < c.getFrase().length(); i++) {
            letra = c.getFrase().substring(i, i + 1).toUpperCase();
            if (l.equals(letra)) {
                cont++;
            }
        }
        return cont;
    }

    /**
     * Método compararLongitud(String frase), deberá comparar la longitud de la
     * frase que compone la clase con otra nueva frase ingresada por el usuario.
     *
     * @param c cadena
     * @param f frase a comparar lonitud con cadena
     * @return si son del mismo tamaño true
     */
    public boolean compararLongitud(Cadena c, String f) {
        return c.getLongitud() == f.length();

    }

    /*
    f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
     */
    public void unirFrase(Cadena c, String f) {
        System.out.println(c.getFrase() + " - " + f);

    }

    /*
    Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
la frase resultante.
     */
    public void reemplazar(Cadena c, String l) {
        String letra;
        for (int i = 0; i < c.getFrase().length(); i++) {
            letra = c.getFrase().substring(i, i + 1).toUpperCase();
            if ("A".equals(letra)) {
                System.out.print(l);
            } else {
                System.out.print(c.getFrase().substring(i, i + 1));
            }
        }
        System.out.println("");
    }

    /*
        h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
     */
    public boolean contiene(Cadena c) {
        System.out.println("Inrese una letra");
        String l = leer.nextLine();
        String letra;
        int cont = 0;
        for (int i = 0; i < c.getFrase().length(); i++) {
            letra = c.getFrase().substring(i, i + 1).toUpperCase();
            if (l.toUpperCase().equals(letra)) {
                cont++;
            }
        }
        return cont != 0;
    }
}
