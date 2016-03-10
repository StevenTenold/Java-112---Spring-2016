
package Week5Labs;
import java.util.Scanner;
public class Week5Labs 
{
    public static void main(String[] args)
    {
        Scanner answer = new Scanner(System.in);
        System.out.println("Are you thirsty?\n1 - Yes\n2 - No");
        int soda = answer.nextInt();
        
        if(soda != 1 && soda != 2)
            System.out.println("Invalid Input. Please enter 1 or 2 only");
        
        if(soda == 1)
            System.out.println("Buy a Coke");
        else
            System.out.println("Skip the coke, eat your lunch");
    }
        
        
}
