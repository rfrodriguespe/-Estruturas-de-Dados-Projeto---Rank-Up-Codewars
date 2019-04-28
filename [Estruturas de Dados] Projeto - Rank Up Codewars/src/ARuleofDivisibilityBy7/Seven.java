/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ARuleofDivisibilityBy7;

/**
 *
 * @author Rodrigo
 */
public class Seven {

    public static long[] seven(long m) {
        int passes = 0;
        while ((m + "").length() > 2) {
            m = (m/10) - (2 * (m%10));
            passes++;

        }
        long[] result = {m,passes};
        return result;
    }

}
