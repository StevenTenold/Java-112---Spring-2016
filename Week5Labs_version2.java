
package Week5Labs;
import java.util.Scanner;
public class Week5Labs 
{
    public static void main(String[] args) 
   {
       // Step #1
       System.out.println("Hungry");
       // Step #2
       System.out.println("Get in Line");
       // Step #3
       System.out.println("Buy Lunch");
       
       // Step #4
       Scanner thirst = new Scanner(System.in);
       
       System.out.println("Are you thirsty?\n1 - Yes\n2 - No");
       int drink = thirst.nextInt(); 
       
/*
        // Input Validation
        if(drink != 1 && drink != 2)
            System.out.println("Invalid Input. Please enter 1 or 2 only");
*/
               
        // COKE OR NO COKE?
        if(drink == 1)
        {
            
            Scanner forSoda = new Scanner(System.in);
            System.out.println("Do you want a soda?\n1 - Yes\n2 - No");
            int soda = forSoda.nextInt(); 
            
/*    
            // Input Validation
            if(soda != 1 && soda != 2)
                System.out.println("Invalid Input. Please enter 1 or 2 only");
*/
            
            if (soda == 1)
            {
                Scanner breakfast = new Scanner(System.in);
                System.out.println("Did you eat breakfast?\n1 - Yes\n2 - No");
                int iAte = breakfast.nextInt();  
 
/* 
                // Input Validation
                if(iAte != 1 && iAte != 2)
                    System.out.println("Invalid Input. Please enter 1 or 2 only");           
*/  
                           
                if (iAte == 1)               
                    System.out.println("Buy a Diet Coke");
                else
                    System.out.println("Buy a Coke");
            }
            else
                System.out.println("Buy a Water");
        }
        else
            System.out.println("Skip the drink");
       
       // Step #5
       System.out.println("Eat Lunch");
       // Step #6
       System.out.println("Return Tray");
       // Step #7
       System.out.println("Leave");
   }    
}
