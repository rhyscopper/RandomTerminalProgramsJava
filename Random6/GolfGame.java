import javax.swing.*; // import the swing library for I/O
import java.util.Random;

class Golf
{
    public static void main (String[] param)
    {
        
        GolfGame();
        System.exit(0);
        
    }
    
    public static void GolfGame()
    {

	int MFromHole = 100;
	int DiceResult = 0;
	String Input = "";    //this is where all of the variables are intialised.
	int Result = 0;
	int Count = 0;
	Random bigdice = new Random();

	while(MFromHole > 0) //this tells us to repeat the while look while MFromHOle is greater than 0
	{
		Input = JOptionPane.showInputDialog(" Distance to hole " + MFromHole + "m. which club (1-Putting, 2-Pitching or 3-iron)");
		Result = Integer.parseInt(Input);
		if (Result == 1)  // this tells us if Result is 1 do the following
		{
			DiceResult = GetRandomNumber(bigdice,6);
			JOptionPane.showMessageDialog(null, "You hit it..." + DiceResult + "m.");
			if (MFromHole > DiceResult)
			{
				MFromHole = (MFromHole - DiceResult);
			}	
			else 
			{
				MFromHole = (DiceResult - MFromHole);
			}
				Count = Count +1;
		} 
		else if (Result == 2)  // this tells us if Result is 2 do the following
		{
			DiceResult = GetRandomNumber(bigdice,31);
			JOptionPane.showMessageDialog(null, "You hit it..." + DiceResult + "m.");
			if (MFromHole > DiceResult)
			{
				MFromHole = (MFromHole - DiceResult);
			}	
			else 
			{
				MFromHole = (DiceResult - MFromHole);
			}
				Count = Count +1;
		}
		else if (Result == 3) // this tells us if Result is 3 do the following
		{
			DiceResult = GetRandomNumber(bigdice,151);
			JOptionPane.showMessageDialog(null, "You hit it..." + DiceResult + "m.");
			if (MFromHole > DiceResult)
			{
				MFromHole = (MFromHole - DiceResult);
			}	
			else  
			{
				MFromHole = (DiceResult - MFromHole);
			}
				Count = Count +1;
		}
		else
		{
			JOptionPane.showInputDialog("You entered a uknown number, please begin again.");
			GolfGame();
		}
	}
		if (Count == 1)
		{
			JOptionPane.showMessageDialog(null, "Congratulations, You took "  + Count + " shot.");
		}   //this area prints out a congratulation message depending if the user the got the result in 1 or more shoots.
		else
		{
			JOptionPane.showMessageDialog(null, "Congratulations, You took "  + Count + " shots.");
		}
}    
	public static int GetRandomNumber(Random bigdice,int n)	
    	{
	   
		int diceroll = bigdice.nextInt(n);
		return diceroll; 

    	}





} // END class while2

