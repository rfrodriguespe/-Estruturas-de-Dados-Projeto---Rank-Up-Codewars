/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SumofTriangularNumbers;

/**
 *
 * @author Rodrigo
 * https://www.codewars.com/kata/sum-of-triangular-numbers/java
 */
public class SumOfTriangularNumbers {

    public static int sumTriangularNumbers(int n){
        int resultado = 0;
        while(n>=1){
            resultado+=sumTriangularNumbers2(n);
            n--;
        }
        return resultado;
    }
    
    private static int sumTriangularNumbers2(int n) {
        return (n==0) ? 0 : n + sumTriangularNumbers2(n-1);
    }
    
    public static void main(String[] args) {
        System.out.println(sumTriangularNumbers(4));
    }

}
