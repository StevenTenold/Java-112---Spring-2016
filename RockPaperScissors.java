package rockpaperscissors;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors 
{

    public static void main(String[] args) 
    {

// Loop Variables 
        boolean userError = false; // True if invalid input, activates loop to reprompt user for valid input
        int loop = 1; // Eternal Loop 
        
        
// Beginning of Eternal While Loop
        
     do {
       
    // CPU & User variables for their respective choices
            String opponent = "";
            String user = "";

    // STEP #1 - Determining the CPU's Choice - Rock, Paper, Or Scissors
        // Random Integer Generator - Determine's Rock, Paper, or Scissors for opposing CPU
            Random generator = new Random();
            int cpu = generator.nextInt(98)+1;// Range = 1 to 99 as nextInt excludes highest value & includes '0'
                if(cpu == 0)
                    cpu += 1;
                if (cpu < 0)
                    cpu *= -1;
            int cpu1 = (cpu % 3) + 1;

    // Assigning a string title to the CPU/Opponent's randomly selected choice
            switch(cpu1)
            {
              case 1: opponent = "Rock"; break;
              case 2: opponent = "Paper"; break;
              case 3: opponent = "Scissors"; break;
            }
      
    // Declaring the variable outside of the Do/While Loop to allow use in the following code
            int RoShamBo;

    // Step #2 - Determining the User's Chocie - Rock, Paper, Or Scissors
                // User selects Rock, paper, or Scissors
                // While Loop to reprompt user if input is invalid
                do
                {
                    userError = false; // Reset for each loop, otherwise one error would loop eternally

                    System.out.println("Choose: 1-Rock, 2-Paper, or 3-Scissors?\n");
                    Scanner RoShamBoU = new Scanner(System.in);
                    RoShamBo = RoShamBoU.nextInt();
                
                        // Input Validation
                    if (RoShamBo != 1 && RoShamBo != 2 && RoShamBo != 3)
                    {
                        userError = true;
                        System.out.println("Invalid Input: Please enter 1, 2, or 3 for Rock, Paper, or Scissors, respectively.\n");
                    }
                }while (userError = false);

            // Playing the Game - User's Choice vs Opponent's Choice
            switch(RoShamBo)
            {
                case 1: user = "Rock";
                switch(cpu1)
                {
                    case 1: System.out.printf ("You \t  \t Opponent\n%s \tvs\t %s \nTie, Play Again\n", user, opponent); break;
                    case 2: System.out.printf ("You \t  \t Opponent\n%s \tvs\t %s \nPaper Beats Rock, You Lose... \n"); break;
                    case 3: System.out.printf ("You \t  \t Opponent\n%s \tvs\t %s \nRock Beats Scissors, You Win!!!\n", user, opponent); break;
                }
                break; // End of Case #1 - User is "Rock"

                case 2: user = "Paper";
                switch(cpu1)
                {
                    case 1: System.out.printf ("You: %s vs %s :Opponent\nPaper Beats Rock, You Win!!!\n", user, opponent); break;
                    case 2: System.out.printf ("You: %s vs %s :Opponent\nTie, Play Again... \n"); break;
                    case 3: System.out.printf ("You: %s vs %s :Opponent\nScissors Beats Paper, You Lose...\n", user, opponent); break;                
                }
                break; // End of Case #2 - User is "Paper"

                case 3: user = "Scissors";
                switch(cpu1)
                {
                    case 1: System.out.printf ("You: %s vs %s :Opponent\nRock Beats Scissors, You Lose...\n", user, opponent); break;
                    case 2: System.out.printf ("You: %s vs %s :Opponent\nScissors Beats Paper, You Win!!!\n"); break;
                    case 3: System.out.printf ("You: %s vs %s :Opponent\nTie, Play Again...\n", user, opponent); break;
                }
                break;
            }
            System.out.println("\n\n");
        }while (true);
    }
}
