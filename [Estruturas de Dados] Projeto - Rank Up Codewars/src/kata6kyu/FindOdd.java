/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata6kyu;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Rodrigo
 * 
 * kata: https://www.codewars.com/kata/54da5a58ea159efa38000836
 */
public class FindOdd {

    public static int odd = 0;

    public static int findIt(int[] a) {
        List<Integer> lista = Arrays.stream(a).boxed().collect(Collectors.toList());
        Collections.sort(lista);
        for (Object numero : lista) {
            if (lista.indexOf(numero) == lista.lastIndexOf(numero)) {
                odd = (int) numero;
                System.out.println(numero);
            } else if (((lista.lastIndexOf(numero) - (lista.indexOf(numero))) % 2 == 0)) {
                odd = (int) numero;
            }
        }
        return odd;
    }

    public static void main(String[] args) {
        
        int[] a = new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5};
        
        System.out.println(findIt(a));
    }

}
