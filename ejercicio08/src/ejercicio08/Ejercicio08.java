/*
En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada.
 */
package ejercicio08;

import ejercicio08.Entidades.Cadena;
import ejercicio08.Servicios.ServicioCadena;

/**
 *
 * @author usuario
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServicioCadena sc = new ServicioCadena();
        Cadena c = sc.crearCadena();
        System.out.println(c);
        
        System.out.println("La frase contiene "+sc.mostrarVocales(c)+" vocales");
        
        sc.invertirFrase(c);
        
        System.out.println("La letra A aparece "+sc.vecesRepetido(c, "A")+" veces" );
        
        System.out.println("La vaca tiene la misma lonitud? "+sc.compararLongitud(c, "La vaca"));
        
        sc.unirFrase(c, "tiene cabeza y tiene cola");
        
        sc.reemplazar(c, "X");
        
        System.out.println("Contiene la letra??"+sc.contiene(c));
    }
    
}
