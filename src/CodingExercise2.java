
/* Level 0 Exam: Coding  Exercise #2 */
import javax.swing.JOptionPane;

/**
 * Write a program that asks the user for their age. 
 * Tell them which year they were born. 
 * If they are over 30, tell them they are too old to play this game.
 **/

public class CodingExercise2 {
	public static void main(String[] args) {
		String userAge = JOptionPane.showInputDialog("What is your age?");
		int age = Integer.parseInt(userAge);
		int year = 2016;
		int yearBorn = year-age;
		if(age >= 30)
		{
			JOptionPane.showMessageDialog(null, "You're too old to play this game...");
			System.exit(yearBorn);
		}
		else
		{
		String birthday = JOptionPane.showInputDialog("Have you had your birthday this year yet?");
		if(birthday.equalsIgnoreCase("Yes"))
		{
			JOptionPane.showMessageDialog(null, "You were born in " + yearBorn + ".");
			System.exit(yearBorn);
		}
		else if(birthday.equalsIgnoreCase("no"))
		{
			yearBorn = yearBorn - 1;
			JOptionPane.showMessageDialog(null, "You were born in " + yearBorn + ".");
			System.exit(yearBorn);
		}
		}
		
	}

}