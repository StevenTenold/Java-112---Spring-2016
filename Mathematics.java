/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

public class Mathematics 
{
    public static void main(String[] args)
    {
        Scanner UserInput = new Scanner(System.in);
        int Number1;
        int Number2;
        int Sum;
        
        System.out.print("Enter the first integer: ");
        Number1 = UserInput.nextInt();
        
        System.out.print("Enter the second integer: ");
        Number2 = UserInput.nextInt();
        
        Sum = Number1 + Number2;
        
        System.out.printf("Sum is %d%n", Sum);
    }
}
/*



public class HelloWorld 
{
    
    public static void main(String[] args)
    {
        System.out.println("Welcome to Java Programming!");
    }
    
}
*/