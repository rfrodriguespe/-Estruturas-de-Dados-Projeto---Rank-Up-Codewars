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
public class DnaStrand {
    
    public static String makeComplement(String dna) {
        
        char[] arrayDna = dna.toUpperCase().toCharArray();
        String dnaComp="";
        for (int i=0; i<arrayDna.length;i++){
            switch (arrayDna[i]){
                case 'A':
                    arrayDna[i] = 'T';
                    dnaComp+=arrayDna[i];
                    break;
                case 'C':
                    arrayDna[i] = 'G';
                    dnaComp+=arrayDna[i];
                    break;
                case 'T':
                    arrayDna[i] = 'A';
                    dnaComp+=arrayDna[i];
                    break;
                case 'G':
                    arrayDna[i] = 'C';
                    dnaComp+=arrayDna[i];
                    break;
                default:
                    break;
            }
        } 
        
        return dnaComp;
    }
    
}
