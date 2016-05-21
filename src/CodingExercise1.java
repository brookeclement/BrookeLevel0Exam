
/* Level 0 Exam: Coding  Exercise #1 */
import java.awt.Robot;

import javax.swing.JOptionPane;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;
import javax.swing.JOptionPane;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class CodingExercise1
{
	public static void main(String[] args)
	{
		new Tortoise();
		// 3. ask the user what color they would like the tortoise to draw
		String color = JOptionPane.showInputDialog("Which primary color do you want the tortoise to draw in?");
		// 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)
		if(color.equalsIgnoreCase("blue"))
		{
		 Tortoise.setPenColor(PenColors.Blues.Blue);
		}
		if(color.equalsIgnoreCase("red"))
		{
		 Tortoise.setPenColor(PenColors.Reds.Red);
		}
		if(color.equalsIgnoreCase("yellow"))
		{
		 Tortoise.setPenColor(PenColors.Yellows.Yellow);
		}
		// 2. set the pen width to 10
		Tortoise.setPenWidth(10);
		// 1. make the tortoise draw a shape
		
		Tortoise.setSpeed(10);
		for(int i=0; i<4; i++)
		{
			Tortoise.move(100);
			Tortoise.turn(90);
			
		}
	}
}




