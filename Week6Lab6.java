
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
        for (int counter = 1; counter < 4; counter++)      
        {
            Scanner UserInput = new Scanner(System.in);
            System.out.println("\nEnter your guess: ");
            int lUserGuess = UserInput.nextInt();
            
            if (lUserGuess == pRandomNumber)
            {
                System.out.println("\nThat's Right! You Win!");
                GoodGuess = true;
            }
            
            else  
            {
                if (lUserGuess > pRandomNumber)
                System.out.println("Too High. Guess Again.");
            
                else
                System.out.println("Too Low. Guess Again.");
            }
               
        } 
    }
    
}