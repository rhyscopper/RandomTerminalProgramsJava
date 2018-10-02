import javax.swing.*;
import java.util.Random;

class MiniProject
{
    public static void main (String[] param)
    { 
		String Players = JOptionPane.showInputDialog("How Many Players Is There?"); 
		int NumPlayers = Integer.parseInt(Players); 
		int[] PlayerScores = new int[NumPlayers];
	    PlayerScores = askMusicQuestion(NumPlayers);   
		for(int i=0;i<NumPlayers;i++)
			{
			System.out.println("Player " + (i+1) + " score: " + PlayerScores[i]);
			}
		System.exit(0);
    }
	public static int[] askMusicQuestion(int NumPlayer) 
    {
		Random  bigdice = new Random();
		int[] PlayerScore = new int[NumPlayer];
		int DiceResult = 0;
		String music = "";
		for(int i=1;i<=NumPlayer;i++)
		{
			music = JOptionPane.showInputDialog("Player:" + i + " What is the better known stage name of Robyn Fenty?");
			JOptionPane.showMessageDialog(null, music + ", That's An Intriguing Answer!");
			if (music.equals("rihanna") | music.equals("Rihanna"))
				{
					PlayerScore[i-1] = 10;
					JOptionPane.showMessageDialog(null, "Correct Answer! You get 10 points."); 
					DiceResult = GetRandomNumber(bigdice);
					JOptionPane.showMessageDialog(null, "Bonus Points: " + DiceResult + " for getting the correct answer!" ); 
					PlayerScore[i-1] = PlayerScore[i-1] + DiceResult;
				}
			else 
				{
					PlayerScore[i-1] = 0;
					JOptionPane.showMessageDialog(null, "Incorrect Answer!"); 
				}
		}
		return PlayerScore;
	}
	
	 public static int GetRandomNumber(Random bigdice)	
    {
		int diceroll = bigdice.nextInt(6) + 1; 
		if (diceroll <=5 && diceroll >=1)
			{ 
				diceroll = 3;
			}
		else if (diceroll == 6)
			{
				diceroll = 6;
			}
		return diceroll;   
   } 
 }