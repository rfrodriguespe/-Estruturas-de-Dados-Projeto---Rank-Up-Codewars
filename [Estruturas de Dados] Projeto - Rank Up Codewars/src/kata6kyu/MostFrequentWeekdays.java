/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata6kyu;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author rfrodrigues Kata:
 * https://www.codewars.com/kata/most-frequent-weekdays/java
 */
public class MostFrequentWeekdays {

    public static String[] mostFrequentDays(int year) {
        String[] dias = new String[7];
        
        GregorianCalendar ano = new GregorianCalendar();
        
        if (ano.isLeapYear(year)){
            for (int i=0;i<=364;i++){
                
            }
        } else {
            for (int i=0;i<=365;i++){
                
            }
            
        }
        
        return dias;
    }

    public static void main(String[] args) {
        GregorianCalendar meuano = new GregorianCalendar();
        int dia = meuano.get(GregorianCalendar.DAY_OF_MONTH);
        int mes = meuano.get(GregorianCalendar.MONTH);

        int diaAno = meuano.get(GregorianCalendar.DAY_OF_YEAR);

        GregorianCalendar gc = new GregorianCalendar();
        Date d1 = gc.getTime(); //"Pega" a data do GregorianCalendar para uma variável Date
        gc.setTime(d1); //Armazena a data de d1 para o GregorianCalendar gc.
        
        
        
    }
}
