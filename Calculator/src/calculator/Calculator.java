/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author payal_2
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Double num1, num2, output;
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number :-");
        num1 = sc.nextDouble();
        
        System.out.println("Enter the secound number :-");
        num2 = sc.nextDouble();
        
        System.out.println("Enter the operation (+, -, *, /) :-");
        char Operator = sc.next().charAt(0);
        
        switch(Operator)
        {
            case '+':
                output = num1 + num2;
                break;
                
            case '-':
                output = num1 - num2;
                break;
                
            case '*':
                output = num1 * num2;
                break;
                
            case '/':
                output = num1 / num2;
                break;
                
            default:
                System.out.println("you have entered an wrong operator");
                return;
        }
        System.out.println(num1+" "+Operator+" "+num2+" = "+output);
    }
    
}
