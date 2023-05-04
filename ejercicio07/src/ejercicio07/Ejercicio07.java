/*
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas;
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores
 */
package ejercicio07;

import ejercicio07.Entidades.Persona;
import ejercicio07.Servicio.ServicioPersona;

/**
 *
 * @author usuario
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ServicioPersona sp = new ServicioPersona();
        //creando las 4 personas
        Persona p1 = sp.CrearPersona();
        System.out.println(p1);
        Persona p2 = sp.CrearPersona();
        System.out.println(p2);
        Persona p3 = sp.CrearPersona();
        System.out.println(p3);
        Persona p4 = sp.CrearPersona();
        System.out.println(p4);
        
        int[] imc = new int[4];
        int contSub=0,cont=0,contSobre=0;
        //Llamando al método IMC
        imc[0]=sp.CalcularIMC(p1);
        imc[1]=sp.CalcularIMC(p2);
        imc[2]=sp.CalcularIMC(p3);
        imc[3]=sp.CalcularIMC(p4);
        for (int i = 0; i < 4; i++) {
            switch (imc[i]) {
                case -1:
                    contSub++;
                    System.out.println("La persona #"+(i+1)+" está por debajo del peso ideal");
                    break;
                case 0:
                    cont++;
                    System.out.println("La persona #"+(i+1)+" está en el peso ideal");
                    break;
                case 1:
                    contSobre++;
                    System.out.println("La persona #"+(i+1)+" está en sobrepeso");
                    break;
                default:
                    break;
            }
        }
        
        boolean[] mayor = new boolean[4];
        int contMayor=0,contMenor=0;
        //Llamando emtodo es mayor
        mayor[0]=sp.EsMayorDeEdad(p1);
        mayor[1]=sp.EsMayorDeEdad(p2);
        mayor[2]=sp.EsMayorDeEdad(p3);
        mayor[3]=sp.EsMayorDeEdad(p4);
        
        for (int i = 0; i < 4; i++) {
            if (mayor[i]){
                contMayor++;
                System.out.println("La persona #"+(i+1)+" es mayor de edad");
            }else{
                contMenor++;
                System.out.println("La persona #"+(i+1)+" NO es mayor de edad");
            }
        }
        
        //Cuantas de cada peso??
        System.out.println("Porcentaje de sub peso "+(float)(contSub/4)*100+"%");
        System.out.println("Porcentaje de peso ideal "+(float)(cont/4)*100+"%");
        System.out.println("Porcentaje de sobre peso "+(float)(contSobre/4)*100+"%");
        System.out.println("---------------------------");
        System.out.println("Porcentaje mayores de edad "+(float)(contMayor/4)*100+"%");
        System.out.println("Porcentaje mayores de edad "+(float)(contMenor/4)*100+"%");

        
    }
    
}
