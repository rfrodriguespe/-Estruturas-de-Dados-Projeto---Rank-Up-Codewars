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

    public static String resultado = "(";
    public static int potencia = 2;
    public static boolean repetiu = false;

    public static String factors(int n) {
        List<Integer> fatores = new ArrayList<Integer>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                fatores.add(i);
                n /= i;
            }
        }
        resultado += fatores.get(0);

         for (int i = 1; i <= fatores.size() - 1; i++) {
            if (fatores.get(i) == fatores.get(i - 1)) {

                if (!resultado.substring(resultado.length() - 2, resultado.length() - 1).equals("*")) {
                    resultado += "**";
                    resultado += potencia;
                    potencia++;
                } else {
                    resultado = resultado.substring(0, resultado.length() - 1);
                    resultado += potencia;
                    potencia++;
                }

            }
            if (fatores.get(i) != fatores.get(i - 1)) {
                resultado += ")(" + fatores.get(i);
                potencia = 2;
                repetiu = false;
            }
        }

        resultado += ")";

        return resultado;
    }

    public static void main(String[] args) {

        
        int n = 7775460;
        //int n = 1024;

        System.out.println(factors(n));

    }
}
