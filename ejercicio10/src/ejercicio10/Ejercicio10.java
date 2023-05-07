/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
 */
package ejercicio10;


import java.util.Arrays;

/**
 *
 * @author usuario
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float[] a = new float[50];
        float[] b = new float[20];
        
        for (int i = 0; i < 50; i++) {
            a[i]=(float) Math.random()*10;
            System.out.print("["+a[i]+"]");
        }
        System.out.println();
        Arrays.sort(a);
        
        for (int i = 0; i < 50; i++) {
            System.out.print("["+a[i]+"]");
        }
        System.out.println();
        System.arraycopy(a, 0, b, 0, 10);
        Arrays.fill(b,10,19,(float) 0.5);
        for (int i = 0; i < 20; i++) {
            System.out.print("["+b[i]+"]");
        }
        System.out.println("");
    }
    
}
