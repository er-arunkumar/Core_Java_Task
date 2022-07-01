/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


package task2;

import java.util.Scanner;
public class Task2 {

//  Task-2 -  Factorial Number
    public static void main(String[] args) {
           
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n=in.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("factorial is " + fact);
    }
    
}
