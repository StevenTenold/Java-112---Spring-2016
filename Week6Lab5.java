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
        
        while (GoodGuess == false)       
        {
            Scanner UserInput = new Scanner(System.in);
            System.out.println("\nEnter your guess: ");
            int lUserGuess = UserInput.nextInt();
            
            
            if ((lUserGuess == pRandomNumber)? (GoodGuess = true):(GoodGuess = false))
                
                
            if (lUserGuess > pRandomNumber)
                System.out.println("\nToo High. Guess Again.");
            
            else if (lUserGuess < pRandomNumber)
                System.out.println("\nToo Low. Guess Again.");
            
            else
                System.out.println("\nThat's Right! You Win!");

        } 
    }
    
}
