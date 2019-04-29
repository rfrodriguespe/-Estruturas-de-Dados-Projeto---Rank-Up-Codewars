/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UnluckyDays;

import java.util.GregorianCalendar;

/**
 *
 * @author Rodrigo
 * kata: https://www.codewars.com/kata/unlucky-days/train/java
 */
public class UnluckyDays {

    public static int unluckyDays(int year) {
        int ud = 0;
        for (int i = 0; i < 12; i++) {
            GregorianCalendar gc = new GregorianCalendar(year, i, 13);
            int dds = gc.get(GregorianCalendar.DAY_OF_WEEK);
            if (dds==6) ud++;
        }
        return ud;
    }
    
    public static void main(String[] args) {

        System.out.println(unluckyDays(1986));

    }

}
