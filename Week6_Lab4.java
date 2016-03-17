
package week6labs;
import java.lang.Math;
import java.util.Scanner;
public class Week6Labs 
{

  
    public static void main(String[] args) 
    {
        int pRandomNumber = 1 + (int)(Math.random() * 10);
        boolean GoodGuess = false;
        
        System.out.println("Guess the Random Number!");
        
        do 
        {
            Scanner UserInput = new Scanner(System.in);
            System.out.println("\nEnter guess #1: ");
            int lUserGuess1 = UserInput.nextInt();
            
            System.out.println("\nEnter Guess #2: ");
            int lUserGuess2 = UserInput.nextInt();
            
            if ((lUserGuess1 == pRandomNumber) || (lUserGuess2 == pRandomNumber))         
            {
                System.out.println("\nYou've Guessed Right! You Win!");
                GoodGuess = true;
            }
            
            if ((lUserGuess1 > pRandomNumber) && (lUserGuess2 > pRandomNumber))
                System.out.println("Both Guesses are Too High. Guess Again.");
            
            else if ((lUserGuess < pRandomNumber) && (lUserGuess2 > pRandomNumber))
                System.out.println("Both Guesses are Too Low. Guess Again.");
            
            else
                System.out.println("1 High 1 Low: Guess Again.");
               
        }while (GoodGuess == false); 
    }
    
}

