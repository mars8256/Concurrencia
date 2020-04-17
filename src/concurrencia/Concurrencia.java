/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrencia;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author marcos
 */
public class Concurrencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        
        
        Runnable tarea = () ->{
            while(true){
                String nombreHilo = Thread.currentThread().getName();
                System.out.println("Hola soy el hilo " + nombreHilo);
                list.add(new Random().nextInt(100));
                System.out.println(list);
               
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        };
        
        Runnable tarea2 = () -> {
            while(true){
                String nombreHilo = Thread.currentThread().getName();
                System.out.println("Hola soy el hilo " + nombreHilo);
                list.add(new Random().nextInt(100));
                System.out.println(list);
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }   
        };
        
         Runnable tarea3 = () -> {
            while(true){
                String nombreHilo = Thread.currentThread().getName();
                System.out.println("Hola soy el hilo " + nombreHilo);
                list.add(new Random().nextInt(100));
                System.out.println(list);
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }   
        };
         
         Thread hilo = new Thread(tarea);
         Thread hilo2 = new Thread(tarea2);
         Thread hilo3 = new Thread(tarea3);
         Thread hilo4 = new Thread(tarea);
         Thread hilo5 = new Thread(tarea3);
         Thread hilo6 = new Thread(tarea);
         
         hilo.start();
         hilo2.start();
         hilo3.start();
         hilo4.start();
         hilo5.start();
         hilo6.start();
    }
    
}
