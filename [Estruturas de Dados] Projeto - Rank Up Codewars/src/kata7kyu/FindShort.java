/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata7kyu;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Rodrigo
 * 
 * Desafio retirado de: https://www.codewars.com/kata/shortest-word/java
 * 
 */
public class FindShort {
    
    public static int menorPalavra(String s) {
        int menor = 99999;
        List<String> lista = Arrays.asList(s.split(" "));
        for (String palavra : lista) {
            if (palavra.length() < menor) {
                menor = palavra.length();
            }
        }
        return menor;
    }
    
    public static void main(String[] args) {
        String teste = "teste rodrigo oi sabrina professora";
        System.out.println(kata7kyu.FindShort.menorPalavra(teste));
    }
    
}
