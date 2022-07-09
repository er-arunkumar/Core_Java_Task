/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task6;

public class Task6 {

//    Find the largest among three numbers using if statement
    public static void main(String[] args) {
         int a=45, b=34, c=56;
         
//         If, Else Statement
           if(a >= b && a>=c)
               System.out.println(a + " is the largest number.");
           else if(b >= a && b>=c)
               System.out.println(b + " is the largest number.");
           else
               System.out.println(c + " is the largest number.");
    }
    
}
