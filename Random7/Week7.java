/*
Author: Rhys Copperthwaite
The following program of which I have created is a program of which is for my Short Assessed Programming Exercise 7: Methods.
in this program I have created 4 methods of which the first two get a input of specific numbers as a integer and turn them into an input.
also it multiplies the 1st by 3 and second by 4.
the 3rd adds the two numbers together to get a score out of 70 and divides the answers by 10 to get a Performance score out of 10.
which is then outputted onto the screen.
then the 4 method which is made which is the bonus by using the performance score out of 10 and multiplies it by 8000 which gives the bonus due.
after this the bonus message is printed onto the screen
and after this the program exits and it is complete
*/
import javax.swing.*; 

class Week7 // this is the name of the file
{
	public static void main (String[] param)
	{
	int TeamScores = 0; 
	int WorkScores = 0;               //here is were the variables are initialised.
	int PerformanceScore = 0;
	int Bonus = 0;
	
	TeamScores = TeamScore(); //here tells us to run the method TeamScore and store the integer value in TeamScores.
	WorkScores = WorkScore(); //here tells us to run the method WorkScore and store the integer value in WorkScores
	PerformanceScore = OverallScore(TeamScores,WorkScores); //This Tells Us to run the method OverallScore and run it using integer values from TeamScores and WorkScore,
																		// run it in the order they are mentioned and to store the result in PerformanceScore
	JOptionPane.showMessageDialog(null,"Your Performance Score this year is " + PerformanceScore + " out of 10."); //this prints out the performance score
	
	Bonus = BonusToBePaid(PerformanceScore); // here tells us to run the method  BonusToBePaid using values from variable PerformanceScore and store the result in bonus.
	
	JOptionPane.showMessageDialog(null,"Your bonus is " + Bonus + " pounds."); // this prints out the bonus 
	
	System.exit(0); // this exits the program.
	}
	
	public static int TeamScore() // this is a integer method called TeamScore
	{
		String TextInput = JOptionPane.showInputDialog("Team Working Score?"); // this asks the user their team working score and stores it in String Variable TextInput.
		int Result = Integer.parseInt(TextInput); // this converts the String variable TextInput into a integer and stores it in integer result.
		final int Result_Multiplier = 3; // this sets the integer value of 3 in Result_Multiplier as it states final int which means the value cannot be changed.
		Result = Result * Result_Multiplier; // this gets the value stored in result multiples it by three because Result_Mutiplier = 3 and stored it back on Result.
		return Result; //this returns variable Result 
	}
	
	public static int WorkScore() // this is a integer method called WorkScore
	{
		String TextInput = JOptionPane.showInputDialog("Hard Work Score?"); //this asks the user their hard work score and stores it in String TextInput
		int result = Integer.parseInt(TextInput); //this converts the String variable TextInput into a integer and stores it in integer result.
		final int result_multiplier = 4; // this sets the integer value of 4 in result_multiplier as it states final int which means the value cannot be changed.
		result = result * 4; // this gets the value stored in result multiples it by four because Result_Mutiplier = 4 and stored it back on Result.
		return result; // this returns variable result.
	}
	
	public static int OverallScore(int TeamSr,int HardWorkSr) // this is a integer method called Overall Score which uses 2 integers TeamSr & HardWorkSr which depend on what is 
	{																										//sent inside the brackets when this method is called.
		int Overall = (TeamSr + HardWorkSr) / 7; // this gets the values stored in integer variables TeamSr and HardWorkSr, adds them together then multiplies by 7 & stores in Overall
		return Overall; // this returns variable Overall
	}
	
	public static int BonusToBePaid(int Performance) // this is a integer method called BonusToBePaid which uses information from what is declared in the brackets when the method
	{																													//is called and stores it in the new variable Performance
		final int Bonus_Multiple = 8000; // this sets the integer value of 8000 in Bonus_Multiple as it states final int which means the value cannot be changed.
		int BonusDue = Performance * Bonus_Multiple; // here it the integer value stored in variable Performance is multiplied by 8000 as Bonus_Multiple equals integer 8000 and
		return BonusDue; // this returns the variable BonusDue																			//stores result in integer Variable BonusDue
	}
}
	