/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComplementaryDNA;

/**
 *
 * @author Rodrigo
 * kata = https://www.codewars.com/kata/complementary-dna/train/java
 */
public class Main {
    
    public static void main(String[] args) {
        String dna = "GTAT";
        
        System.out.println(DnaStrand.makeComplement(dna));
        
    }
    
}
