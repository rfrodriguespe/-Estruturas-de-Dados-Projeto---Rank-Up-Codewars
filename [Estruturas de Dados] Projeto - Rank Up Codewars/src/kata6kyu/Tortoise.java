/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata6kyu;

/**
 *
 * @author Rodrigo
 * kata: https://www.codewars.com/kata/tortoise-racing/train/java
 */
public class Tortoise {
    
    public static int[] race(int v1, int v2, int g) {
        double t;
        if (v1 >= v2){
            return null;
        } else {
            t = (double) g / (double )(v2-v1);
            int horas = (int) Math.floor(t);
            int minutos = (int) Math.floor(((int)(t*60)) - (horas*60));
            int segundos = (int) Math.floor((t*60-minutos)*60)- (horas*3600);
            
            
            return new int[]{horas,minutos,segundos};
           
        }
    }
    
    public static void main(String[] args) {
        
        
        int[] resultado = race(80, 91, 37);
        
        for (int numeros: resultado){
            System.out.println(numeros);
        }
        
    }
    
}
