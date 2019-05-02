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
            while (dias[0] == null) {
                if (qtdeSeg == 53 && qtdeDom != 53) {
                    dias[0] = "Monday";
                    dias[1] = "Tuesday";
                    break;
                }
                if (qtdeTer == 53 && qtdeSeg != 53) {
                    dias[0] = "Tuesday";
                    dias[1] = "Wednesday";
                    break;
                }
                if (qtdeQua == 53 && qtdeTer != 53) {
                    dias[0] = "Wednesday";
                    dias[1] = "Thursday";
                    break;
                }
                if (qtdeQui == 53 && qtdeQua != 53) {
                    dias[0] = "Thursday";
                    dias[1] = "Friday";
                    break;
                }
                if (qtdeSex == 53 && qtdeQui != 53) {
                    dias[0] = "Friday";
                    dias[1] = "Saturday";
                    break;
                }
                if (qtdeSab == 53 && qtdeSex != 53) {
                    dias[0] = "Saturday";
                    dias[1] = "Sunday";
                    break;
                }
                if (qtdeDom == 53 && qtdeSab != 53) {
                    dias[0] = "Sunday";
                    dias[1] = "Monday";
                    break;
                }

            }
            

            

        } else {
            dias = new String[1];
            if (qtdeSeg == 53) {
                dias[0] = "Monday";
            }
            if (qtdeTer == 53) {
                dias[0] = "Tuesday";
            }
            if (qtdeQua == 53) {
                dias[0] = "Wednesday";
            }
            if (qtdeQui == 53) {
                dias[0] = "Thursday";
            }
            if (qtdeSex == 53) {
                dias[0] = "Friday";
            }
            if (qtdeSab == 53) {
                dias[0] = "Saturday";
            }
            if (qtdeDom == 53) {
                dias[0] = "Sunday";
            }
        }

        return dias;
    }

    public static String diaDaSemana(Calendar cal) {
        return new DateFormatSymbols().getWeekdays()[cal.get(Calendar.DAY_OF_WEEK)];
    }

    public static void main(String[] args) throws ParseException {

        int ano = 1004;

        
        for (int i = 0; i < mostFrequentDays(ano).length; i++) {
            System.out.println(mostFrequentDays(ano)[i]);
        }
    }
}
