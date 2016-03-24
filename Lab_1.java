package Week7_Labs;

import java.lang.Math;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Lab_1
{
	
    public static void main(String[] args) 
    {
        int pRandomNumber = 1 + (int)(Math.random() * 10);
        boolean GoodGuess = false;
        
        //System.out.println("Guess the Random Number!");
        JOptionPane.showMessageDialog( null, "Guess the Random Number!");    


        while (GoodGuess == false)       
        {
            Scanner UserInput = new Scanner(System.in);
            //System.out.println("\nEnter your guess: ");
            //int lUserGuess = UserInput.nextInt();
            
            
            
            int lUserGuess = 
            		Integer.parseInt( JOptionPane.showInputDialog( "Enter your guess: "));

            
            if (lUserGuess == pRandomNumber)
            {
                //System.out.println("\nThat's Right! You Win!");
                JOptionPane.showMessageDialog( null, "That's Right! You Win!");            	
            	
                GoodGuess = true;
            }
            
            if (lUserGuess > pRandomNumber)
                //System.out.println("Too High. Guess Again.");
                JOptionPane.showMessageDialog( null, "Too High. Guess Again.");            	
            	
            
            if (lUserGuess < pRandomNumber)
                //System.out.println("Too Low. Guess Again.");
                JOptionPane.showMessageDialog( null, "Too Low. Guess Again.");            	     
        } 
    }
    
}