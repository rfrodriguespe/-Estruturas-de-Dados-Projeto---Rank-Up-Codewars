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
 * @author rfrodrigues kata:
 * https://www.codewars.com/kata/primes-in-numbers/java
 *
 * Sabrina, pegando os casos de teste do kata e jogando aqui no netbeans, a
 * saída dá certo, mas o site insiste em dizer que meu código gera uma outra
 * saída.
 *
 * ex: para N = 17515577, o site insiste que meu código sai
 * "(2**2)(3**3)(5)(7)(11**2)(17)3)(17**2)(31)(677)43**2)(9473)" mas se voce
 * rodar sai "(43**2)(9473)", favor corrigir bem esse kata que é bem dificil e
 * acredito ter acertado e que o site tem alguma maluquice
 *
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

        if (fatores.size() == 1) {
            return new String("(" + fatores.get(0) + ")");
        } else {
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

        }

        return resultado;
    }

    public static void main(String[] args) {

        int n = 18195729;

        System.out.println(factors(n));
        

    }
}
