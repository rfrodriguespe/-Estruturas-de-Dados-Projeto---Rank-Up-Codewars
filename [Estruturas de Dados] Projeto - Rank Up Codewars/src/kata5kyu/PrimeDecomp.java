/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata5kyu;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rfrodrigues
 */
public class PrimeDecomp {

    public static String factors(int n) {
        // your code

        return null;
    }

    public static void main(String[] args) {

        List<Integer> fatores = new ArrayList<Integer>();
        int n = 86240;

        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                fatores.add(i);
                n /= i;
            }
        }
        
        // Conseguindo o primeiro e último número repetido, para saber quantos eu tenho no array
//        System.out.println(fatores.indexOf(2));
//        System.out.println(fatores.lastIndexOf(2));
        //
        

        for (int numero : fatores) {
            System.out.println(numero);
        }
    }
}
