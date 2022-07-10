/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task7;


public class Task7 {

//    Root of the Quadratic Equation
    public static void main(String[] args) {
        double a=45.3, b=56.9, c=100;
        double result1, result2;
        
//      Calculate the determinant 
        double determinant = b*b-4*a*c;
        
//      Check if determinant is greater than 0
        if(determinant > 0){
//      Using Math.sqrt Funtion
            result1 = (-b + Math.sqrt(determinant)/(2*a));
            result2 = (-b - Math.sqrt(determinant)/(2*a));
            
            System.out.format("result1 = %.3f and result2 =%.3f",result1,result2);
        }
//      Check if determinant is equal to zero
        else if (determinant == 0){
            result1 = result2 = -b/(2*a);
            System.out.format("result1 =result2 =%.3f",result1);
        }
//      If determinant is less than zero
        else{
//            Roots are complex number and distinct
            double real = -b/(2*a);
            double imaginary = Math.sqrt(-determinant)/(2*a);
            System.out.format("result1 =%.3f+%.3fi",real,imaginary);
            System.out.format("\nresult2 =%.3f-%.3fi",real,imaginary);
        }
    }
}
