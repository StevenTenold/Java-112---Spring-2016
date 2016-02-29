import java.util.Scanner;

public class SimpleCalculator 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int digit1;
        int digit2;
        int Addition;
        int Subtraction;
        int Division;
        int Multiplication;
        
        System.out.print("Enter the first integer: ");
        digit1 = input.nextInt();
        
        System.out.print("Enter the second integer: ");
        digit2 = input.nextInt();
        
        Addition = digit1 + digit2;
        Subtraction = digit1 - digit2;
        Division = digit1 / digit2;
        Multiplication = digit1 * digit2;
        
        System.out.printf("%d + %d = %d%n", digit1, digit2, Addition);
        System.out.printf("%d - %d = %d%n", digit1, digit2, Subtraction);
        System.out.printf("%d / %d = %d%n", digit1, digit2, Division);
        System.out.printf("%d * %d = %d%n", digit1, digit2, Multiplication);
    }
}
