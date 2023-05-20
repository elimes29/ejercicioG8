/*
 Luego, las operaciones que se podrán realizar son las siguientes:
 
 
 
 
 
 Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
de no existir solución, se mostrará un mensaje.
 */
package servicio;

import entidad.Raices;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class RaicesServicio {

    Scanner leer = new Scanner(System.in);

    /**
     * Método getDiscriminante(): devuelve el valor del discriminante (double).
     * El discriminante tiene la siguiente formula: (b^2)-4*a*c (float)
     *
     * @param r raiz a,b y c (b^2)-4*a*c (double)
     * @return discriminante
     */
    public double getDiscriminante(Raices r) {
        return ((Math.pow(r.getB(), 2)) - (4 * r.getA() * r.getC()));
    }

    /**
     * Método tieneRaices(): devuelve un booleano indicando si tiene dos
     * soluciones, para que esto ocurra, el discriminante debe ser mayor o igual
     * que 0.
     *
     * @param discriminante (duoble)
     * @return discriminante>=0 (boolean)
     */
    public boolean tieneRaices(double discriminante) {
        return (discriminante > 0);
    }

    /**
     * Método tieneRaiz(): devuelve un booleano indicando si tiene una única
     * solución, para que esto ocurra, el discriminante debe ser igual que 0.
     *
     * @param discriminante (double)
     * @return discriminante=0 (boolean)
     */
    public boolean tieneRaiz(double discriminante) {
        return (discriminante == 0);
    }

    /**
     * Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true,
     * imprime las 2 posibles soluciones.
     *
     * @param r
     */
    public void obtenerRaices(Raices r) {
        double dis = getDiscriminante(r);
        if (tieneRaices(dis)) {
            System.out.println("La solución 1 es: " + (((-r.getB())) + Math.sqrt(dis)) / (2 * r.getA()));
            System.out.println("La solución 2 es: " + (((-r.getB())) - Math.sqrt(dis)) / (2 * r.getA()));
        } else {
            System.out.println("No hay doble solución");
        }
    }

    /**
     * Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una
     * única raíz. Es en el caso en que se tenga una única solución posible.
     *
     * @param r
     */
    public void obtenerRaiz(Raices r) {
        double dis = getDiscriminante(r);
        if (tieneRaiz(dis)) {
            System.out.println("La solución única solución es: " + ((-r.getB()) / (2*r.getA())));
        } else {
            System.out.println("No hay una sola solución");
        }
    }

    public void calcular(Raices r) {
        obtenerRaices(r);
        obtenerRaiz(r);

    }

    public Raices crearRaices() {
        Raices r = new Raices();
        System.out.println("Ingrese el coeficiente a.");
        r.setA(leer.nextFloat());
        System.out.println("Ingrese el coeficiente b.");
        r.setB(leer.nextFloat());
        System.out.println("Ingrese el coeficiente C.");
        r.setC(leer.nextFloat());
        return r;
    }
}
