/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata7kyu;

/**
 *
 * @author Rodrigo
 * kata: https://www.codewars.com/kata/562f91ff6a8b77dfe900006e
 */
public class Movie {
    
    public static int movie(int card, int ticket, double perc) {
        int time=0;
        int sysA = 0;
        double sysB = card;
        double newTicket= ticket;
        
        while (sysA <= Math.ceil(sysB)) {
            sysA += ticket;
            sysB += newTicket;
            newTicket *= perc;
            if (sysA <= Math.ceil(sysB)) time++;
        }
        
        return time;
    }
    
    public static void main(String[] args) {
        
        int card = 500;
        int ticket =15;
        double perc = 0.90;
        System.out.println(movie(card, ticket, perc));
         
    }
    
    
}
