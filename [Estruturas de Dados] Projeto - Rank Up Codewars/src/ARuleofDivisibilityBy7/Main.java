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
public class Main {
    
    public static void main(String[] args) {
        
        long[] teste = DivSeven.seven(3554571);
        System.out.print("[");
        for (int i = 0; i < 2;i++){
            if (i==0) {
                System.out.print(teste[i]+" , ");
            } else {
                System.out.print(teste[i]);
            }
        }
        System.out.print("]\n");
    }
    
}
