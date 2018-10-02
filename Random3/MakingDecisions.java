/*
Author: Rhys Copperthwaite
This Program of which I have created is for my Short Assessed Programming Exercise 3: Making Decisions.
The way which this program works is it will display 2 messages out to the user, and they can input the answers
yes or no, for the first question if you answer yes a message will be displayed if no then it will move onto the next question
on the second question a message will be outputted both for yes and no of the question.
*/
import javax.swing.*; //this imports the swing library for I/O.

class MakingDecisions //this is where the .class file name is stated
{
	public static void main(String args[])
	{
		String Question1;
		
		Question1 = JOptionPane.showInputDialog(null,"Would you like to see a comedy(yes/no)? "); //this is the first question where the value is stored in variable Question1
	
		if (Question1.equals ("yes")) //this explains if Question1 = yes then do the following otherwise go to else.
	    {
			JOptionPane.showMessageDialog(null,"You might like either Yes Minister or SPAMalot.");  //this is outputted if the user says yes.
		}
		else
		{ 
		System.out.println(" "); //this prints out a plank line if the user says no to the screen and goes onto the next question.
		}
	String Question2;
	
	Question2 = JOptionPane.showInputDialog(null,"Would you like to see a musical(yes/no)?"); //this is the second question where the value is stored in variable Question2
	//this is the second question
	if (Question2.equals ("yes"))
	{
		JOptionPane.showMessageDialog(null,"You might like either Les Miserables or Mamma Mia"); //this is outputted if the users says yes
	}
	else
	{
	JOptionPane.showMessageDialog(null,"you might like either The Woman in Black or Macbeth"); //this is outputted if the users says no
	}
	}
}