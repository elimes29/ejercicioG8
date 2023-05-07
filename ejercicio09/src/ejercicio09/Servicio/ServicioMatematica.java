/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio09.Servicio;

import ejercicio09.Entidades.Matematica;

/**
 *
 * @author usuario
 */
public class ServicioMatematica {
    
    /*
    a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
    b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
    elevado al menor número. Previamente se deben redondear ambos valores.
    c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
    Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
    */
    
    /**
     *devolverMayor 
     * @param m objeto
     * @return devulve el valor mayor
     */
    public float devolverMayor(Matematica m){
        return (m.getNum1()>m.getNum2()) ? m.getNum1() : m.getNum2();
    }
    
    public double calclarPotencia(Matematica m){
        int numMay=(int)((m.getNum1()>m.getNum2()) ? m.getNum1() : m.getNum2());
        int numMen=(int)((m.getNum1()<m.getNum2()) ? m.getNum1() : m.getNum2());
        return Math.pow((double) numMay, (double) numMen);
    } 
    
    public float calcularRaiz(Matematica m){
        int num=(int)((m.getNum1()<m.getNum2()) ? m.getNum1() : m.getNum2());
        return (float) Math.sqrt(num);
    } 
}
