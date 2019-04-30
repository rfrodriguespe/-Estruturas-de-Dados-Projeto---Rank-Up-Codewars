/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata6kyu;

import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.temporal.WeekFields;
import java.util.Calendar;
import static java.util.Calendar.DAY_OF_MONTH;
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

        return dias;
    }
    
    public static String diaDaSemana(Calendar cal) {
        return new DateFormatSymbols().getWeekdays()[cal.get(Calendar.DAY_OF_WEEK)];
    }

    public static void main(String[] args) throws ParseException {

        int qtdeDias = 0;
        int qtdeDom = 0, qtdeSeg = 0,qtdeTer = 0, qtdeQua = 0;
        int qtdeQui = 0, qtdeSex = 0, qtdeSab = 0;
        
        int ano = 1984;
        
        System.out.println(qtdeDom);
        
        GregorianCalendar calendario = new GregorianCalendar();

        System.out.println("-------------------");

        for (int i = 0; i <= 11; i++) {
            for (int k = 1; k <= calendario.getActualMaximum(Calendar.DAY_OF_MONTH); k++) {
                qtdeDias++;
                calendario.set(ano, i, k);
                switch (diaDaSemana(calendario)) {
                    case "Domingo":
                        qtdeDom++;
                        break;
                    case "Segunda-feira":
                        qtdeSeg++;
                        break;
                    case "Terça-feira":
                        qtdeTer++;
                        break;
                    case "Quarta-feira":
                        qtdeQua++;
                        break;
                    case "Quinta-feira":
                        qtdeQui++;
                        break;
                    case "Sexta-feira":
                        qtdeSex++;
                        break;
                    case "Sábado":
                        qtdeSab++;
                        break;
                    default:
                        //
                        break;
                }

            }
        }

        System.out.println("O ano de "+ ano+" teve " + qtdeDias + " dias.");
        System.out.println("O número de vezes que cada dia ocorreu foram:");
        System.out.println("Domingo: "+qtdeDom);
        System.out.println("Segunda: "+qtdeSeg);
        System.out.println("Terca: "+qtdeTer);
        System.out.println("Quarta: "+qtdeQua);
        System.out.println("Quinta: "+qtdeQui);
        System.out.println("Sexta: "+qtdeSex);
        System.out.println("Sabado: "+qtdeSab);
    }
}
