/* 
Author: Rhys Copperthwaite

This program of which i have created is for week 4 of my accessed programming excersise 4 which is for loops,
here i have created a program which in a for loop asks the user a question 4 times each time with a different runner number.
everytime the user inputs a number it is stored into the variable Disabillity and is added to whatever already exsists there.
one the 4 questions have been asked it will combine all the numbers together and give a totally disablility score which is stored in variable
TotDis. from this comes an if statement of which outputs a message depending on the result.
if the result is equal to(=) or less than(-) 32 then the program will output a message which says it is legal.
if the result is anything else then it will output a message which says it is NOT legal.

*/
import javax.swing.*; //this tells the program to get the the libaray swing for I/O

class Paralympic //this is where the class file name is determined.
{
	public static void main(String args[])
	{
		DisabilityClass();
		System.exit(0);
	}

	public static void DisabilityClass()
	{
	int TotDis = 0;
	String Disabillity;         //here is where the variables are determined and values are set if neccesary
	int DisabillityNum;
		for(int i=1;i<=4;i++) //here is where the for loop is initilised
		{
	Disabillity = JOptionPane.showInputDialog("Runner " + i + " give me their disability class?");
	DisabillityNum = Integer.parseInt(Disabillity);// here is what is to be run in the for loop.
	TotDis = TotDis + DisabillityNum;
		}
		if(TotDis <= 32) //this is the part that tells the user if TotDis <= 32 then do the following line.
			{
			JOptionPane.showMessageDialog(null, "The team has " + TotDis + " points so is legal");
			}
		else // this is the part which tells the program if the answer is anything else than <=32 then do the following line. 
			{
			JOptionPane.showMessageDialog(null, "The team has " + TotDis + " points so is NOT legal");	
			}
	}
}
