
package conditionalcalculator;

import java.util.Scanner; //For User Input

public class ConditionalCalculator 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        int operation;
        int solution;
        
        System.out.println("Calculator - Enter the first digit, the operator, & the second digit for the solution");
        
        System.out.println("\nEnter the first integer: ");
        number1 = input.nextInt();
        
        System.out.println("\nSelect the operator: 1 for addition, 2 for subtraction, 3 for multiplication, 4 for division");
        operation = input.nextInt();
        
        System.out.println("\nEnter the second integer: ");
        number2 = input.nextInt();
        
        // Input Validation
        
        if (operation == 1)
        {
            solution = number1 + number2;
            System.out.printf("%d + %d = %d", number1, operation, number2, solution);
        }
        else if (operation == 2)
        {  
            solution = number1 - number2;
            System.out.printf("%d - %d = %d", number1, operation, number2, solution);
        }
        else if (operation == 3)
        {  
            solution = number1 * number2;
            System.out.printf("%d * %d = %d", number1, operation, number2, solution);
        }
        else if (operation == 4)
        {
            solution = number1 / number2;
            System.out.printf("%d / %d = %d", number1, operation, number2, solution);    
        }
        else 
            System.out.println("\nInvalid Input - Operator must be *, /, +, or -");
               
    }
    
}
