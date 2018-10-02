/* 
Name: Rhys Copperthwaite
This program of which I have created is part of my coursework for procedural programming.
The program which I have created is called FitnessTest.

In this program the user is asked to input there score for fitness test 1&2, once done the program will work out the average score and work out the Fitness Age.
Once there PC fitness age  has been worked out it will display it to the user and ask them for there real age, it will then deduct the PC Fitness Age from there real age,
this will give them the amount of years they are from there PC Fitness Age
*/
import javax.swing.*;  //import the swing library for I/O.

class FitnessTest
{ //this is where the class file FitnessTest Begins.
	public static void main(String [] param)
	{ 
	  addFitnessScore();
	  System.exit(0);
	}
	public static void addFitnessScore()
	{ //this is where the public static void addFitnessScore() begins.
	int Fitness1;  //here is were we declare our variable types.
	int Fitness2;
	int Average;
	int FitAge;
	int RealAge1;
	int YearsAway;
	String RealAgea;
    String Fitnessa; 
	String Fitnessb;
	
	Fitnessa = JOptionPane.showInputDialog("Score for fitness test1?"); //this so of command is what asks the user a question and stores it in the variable stated at the start.
	Fitnessb = JOptionPane.showInputDialog("Score for fitness test2?");
	Fitness1 = Integer.parseInt(Fitnessa); //this command part of the program is what changed string(text) numbers into integer numbers to be able to use in calculations.
	Fitness2 = Integer.parseInt(Fitnessb);
	
	Average = (Fitness1 + Fitness2)/2; 
	JOptionPane.showMessageDialog(null,"Your Average Score is " + Average + " years old.");
	
	FitAge = (Average * 8 / 5 + 10);
	
	JOptionPane.showMessageDialog(null,"Your PC Fit age is " + FitAge + " years old.");
	
	RealAgea = JOptionPane.showInputDialog("What Is Your Actual Age");
	RealAge1 = Integer.parseInt(RealAgea);
	
	YearsAway = (RealAge1 - FitAge);
	
	JOptionPane.showMessageDialog(null,"You are " + YearsAway + " years away from your PC fit age.");
		} //end public static void addFitnessScore
} //end class FitnessTest