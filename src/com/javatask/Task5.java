/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task5;

public class Task5 {

    /**
     * @param args the command line arguments
     */
    // check given character vowel or consonant using if condiation
    public static void main(String[] args) {
        // TODO code application logic here
        char ch = 'b';
        
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            System.out.println(ch + " is vowel.");
        else
            System.out.println(ch + " is consonant.");
        
    }
    
}
