/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Goingtothecinema;

/**
 *
 * @author Rodrigo
 * kata: https://www.codewars.com/kata/562f91ff6a8b77dfe900006e
 */
public class Movie {
    
    public static int movie(int card, int ticket, double perc) {
        int time=1;
        int sysA = 0;
        int sysB = card;
        
        do {
            sysA = ticket*time;
            sysB += (Math.pow(perc, time))*ticket;
            time++;
        } while (sysA < sysB);
        return time+1;
    }
    
    public static void main(String[] args) {
        
        int card = 800;
        int ticket =15;
        double perc = 0.90;
        System.out.println(movie(card, ticket, perc));
        
        
        int time=1;
        int sysA = 0;
        double sysB = 0;
        
        for (int i=0;i<3;i++){
            sysA = ticket*time;
            sysB += (Math.pow(perc, time))*ticket;
            //System.out.println("Systam A "+sysA);
            //System.out.println("Systam B "+sysB);
            time++;
        }
        sysA=(movie(card, ticket, perc)-1)*ticket;
        sysB+=card;
        
        
        System.out.println("Systam A "+sysA);
        System.out.println("Systam B "+sysB);
        
    }
}
