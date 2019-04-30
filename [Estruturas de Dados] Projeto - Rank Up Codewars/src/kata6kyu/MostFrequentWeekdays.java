/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata6kyu;

import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author rfrodrigues Kata:
 * https://www.codewars.com/kata/most-frequent-weekdays/java
 */
public class MostFrequentWeekdays {

    public static String[] mostFrequentDays(int year) {

        GregorianCalendar calendario = new GregorianCalendar();
        calendario.setFirstDayOfWeek(2);
        String[] dias = null;

        int qtdeDias = 0;
        int qtdeDom = 0, qtdeSeg = 0, qtdeTer = 0, qtdeQua = 0;
        int qtdeQui = 0, qtdeSex = 0, qtdeSab = 0;

        for (int i = 0; i <= 11; i++) {
            for (int k = 1; k <= calendario.getActualMaximum(Calendar.DAY_OF_MONTH); k++) {
                qtdeDias++;
                calendario.set(year, i, k);
                switch (diaDaSemana(calendario)) {
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
                    case "Domingo":
                        qtdeDom++;
                        break;
                    default:
                        //
                        break;
                }

            }
        }

        if (calendario.isLeapYear(year)) {
            dias = new String[2];
            
            if (qtdeSeg==53 && dias[0] != null) dias[0] = "Monday";
            if (qtdeTer==53 && dias[0] != null) dias[0] = "Tuesday";
            if (qtdeQua==53 && dias[0] != null) dias[0] = "Wednesday";
            if (qtdeQui==53 && dias[0] != null) dias[0] = "Thursday";
            if (qtdeSex==53 && dias[0] != null) dias[0] = "Friday";
            if (qtdeSab==53 && dias[0] != null) dias[0] = "Saturday";
            if (qtdeDom==53 && dias[0] != null) dias[0] = "Sunday";
            
            
            if (qtdeSeg==53 && dias[0] != null) dias[1] = "Monday";
            if (qtdeTer==53 && dias[0] != null) dias[1] = "Tuesday";
            if (qtdeQua==53 && dias[0] != null) dias[1] = "Wednesday";
            if (qtdeQui==53 && dias[0] != null) dias[1] = "Thursday";
            if (qtdeSex==53 && dias[0] != null) dias[1] = "Friday";
            if (qtdeSab==53 && dias[0] != null) dias[1] = "Saturday";
            if (qtdeDom==53 && dias[0] != null) dias[1] = "Sunday";
        } else {
            dias = new String[1];
            if (qtdeSeg==53) dias[0] = "Monday";
            if (qtdeTer==53) dias[0] = "Tuesday";
            if (qtdeQua==53) dias[0] = "Wednesday";
            if (qtdeQui==53) dias[0] = "Thursday";
            if (qtdeSex==53) dias[0] = "Friday";
            if (qtdeSab==53) dias[0] = "Saturday";
            if (qtdeDom==53) dias[0] = "Sunday";
        }

        return dias;
    }

    public static String diaDaSemana(Calendar cal) {
        return new DateFormatSymbols().getWeekdays()[cal.get(Calendar.DAY_OF_WEEK)];
    }

    public static void main(String[] args) throws ParseException {

        int ano = 1985;
        
        for (int i=0; i < mostFrequentDays(ano).length;i++){
            System.out.println(mostFrequentDays(ano)[i]);
        }
        
    }
}
