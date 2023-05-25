/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidades.Tiempo;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class ServicioTiempo {
    Tiempo t;
    Scanner leer = new Scanner(System.in);
    
    public ServicioTiempo(){
        boolean centH=true;
        boolean centM=true;
        boolean centS=true;
        int h,m,s;
        
        //Leyendo la hora
        do {
        System.out.println("Ingrese la hora (0-23)");    
        h=leer.nextInt();
            if (h<0 || h>23) {
                System.out.println("Ingrese una hora correcta (0-23)");
            }else{
                centH=false;
            }
        } while (centH);
        
        //Leyendo minutos
        do {
        System.out.println("Ingrese los minutos (0-59)");    
        m=leer.nextInt();
            if (m<0 || m>59) {
                System.out.println("Ingrese un minuto correcto (0-59)");
            }else{
                centM=false;
            }
        } while (centM);
        
        //Leyendo seundos
        do {
        System.out.println("Ingrese los seundos (0-59)");    
        s=leer.nextInt();
            if (s<0 || s>59) {
                System.out.println("Ingrese un minuto correcto (0-59)");
            }else{
                centS=false;
            }
        } while (centS);
        t = new Tiempo(h,m,s);
    }
    
    public void imprimirHoraCompleta(){
        System.out.println(t.getHora()+":"+t.getMinuto()+":"+t.getSegundo());
        
        //Simulando seundos moverse
    }
    
    public void MoverHoras(){
        t.setSegundo(t.getSegundo()+1);
        if (t.getSegundo()==60){
            t.setSegundo(0);
            t.setMinuto(t.getMinuto()+1);
            if (t.getMinuto()==60){
                t.setMinuto(0);
                t.setHora(t.getHora()+1);
                if (t.getHora()==24){
                    t.setHora(0);
                }
                
            }
        }
        
    }
}
