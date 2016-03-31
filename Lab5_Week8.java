package Week8;
import javax.swing.JOptionPane;
import java.time.Period;
import java.util.Calendar;
import java.time.LocalDate;

public class Lab4_Week8 
{

	public static void main(String[] args)
	{

		int month;
		int day;
		int year;
		int daysInMonth;
		boolean loop = true;

		while (loop)
		{
			Calendar rightNow = Calendar.getInstance();

			String name = JOptionPane.showInputDialog("Enter your first name: ");
			String dateOfBirth = JOptionPane.showInputDialog("Enter your Date of Birth (MM/DD/YYYY): ");
			month = Integer.parseInt(dateOfBirth.substring(0,2));
			day = Integer.parseInt(dateOfBirth.substring(3,5));
			year = Integer.parseInt(dateOfBirth.substring(6,10));

			Calendar birthDate = Calendar.getInstance();
			birthDate.set(Calendar.YEAR, year);
			birthDate.set(Calendar.MONTH, month);
			birthDate.set(Calendar.DATE, day);

			if ((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10) || (month == 12))
				daysInMonth = 31;
			else if ((month == 4) || (month == 6) || (month == 9) || (month == 11))
				daysInMonth = 30;
			else
				daysInMonth = 28;


			int age = rightNow.get(Calendar.YEAR) - birthDate.get(Calendar.YEAR);
			int yearsUntil = 21 - age;
			int monthsUntil = rightNow.get(Calendar.MONTH) - birthDate.get(Calendar.MONTH);

			if (birthDate.get(Calendar.MONTH) > rightNow.get(Calendar.MONTH))
			{
				monthsUntil = 12 + birthDate.get(Calendar.MONTH);
				yearsUntil--;
			}

			int daysUntil = rightNow.get(Calendar.DATE) - birthDate.get(Calendar.DATE);
			if (birthDate.get(Calendar.DATE) > rightNow.get(Calendar.DATE))
			{
				daysUntil = daysInMonth + birthDate.get(Calendar.DATE);
				monthsUntil--;
			}


			if (age >= 21)
				JOptionPane.showMessageDialog(null, String.format("%s, you are %d years old. You can legally drink alcohol.", name, age));
			else
			{
				JOptionPane.showMessageDialog(null, String.format("%s, you are %d years old. You can NOT legally drink alcohol.", name, age));
				JOptionPane.showMessageDialog(null, String.format("%s, you have %d years, %d months, and %d days until you can legally drink alcohol.", name, yearsUntil, monthsUntil, daysUntil));
			}
			
			String loopInput = JOptionPane.showInputDialog("Enter Y to loop, enter N to end program: ");
			if (loopInput == "N")
				loop = false;
		}
	}
}
