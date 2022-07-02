/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task3;


public class Task3 {

//    Swap Two Numbers Using Temporary Variable
    public static void main(String[] args) {
        int a=25,b=50;
        System.out.println("Before Swapping");
        System.out.println("A value is " + a);
        System.out.println("B value is " + b);
        
        int c=a;
        
        a=b;
        b=c;
        System.out.println("After Swapping");
        System.out.println("A value is " + a);
        System.out.println("B value is " + b);
    }
    
}
