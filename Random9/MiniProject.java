import javax.swing.*;

class MiniProject
{
    public static void main (String[] param)
    { 
		askMusicQuestion();
		String Players = JOptionPane.showInputDialog("How Many Players Is There?"); 
		int NumPlayers = Integer.parseInt(Players); 
		int[] PlayerScores = new int[NumPlayers];
	    PlayerScores =askMusicQuestion;   
		String output = "";
		int DiceResult = 0;
		System.exit(0);
    }
	public static int[] askMusicQuestion() 
    {
		Random  bigdice = new Random();
		String music = "";
		for(int i=1;i<=NumPlayers;i++)
		{
			music = JOptionPane.showInputDialog("Player:" + i + " What is the better known stage name of Robyn Fenty?");
			JOptionPane.showMessageDialog(null, music + ", That's An Intriguing Answer!");
			if (music.equals("rihanna") | music.equals("Rihanna"))
				{
					PlayerScores[i-1] = 10;
					JOptionPane.showMessageDialog(null, "Correct Answer! You get 10 points."); 
					DiceResult = GetRandomNumber(bigdice);
					JOptionPane.showMessageDialog(null, "Bonus Points: " + DiceResult + " for getting answer correct!" ); 
					PlayerScores[i-1] = PlayerScores[i-1] + DiceResult;
				}
			else 
				{
					PlayerScores[i-1] = 0;
					JOptionPane.showMessageDialog(null, "Incorrect Answer!"); 
				}
				
		}
		return;
	}
	
	 public static int GetRandomNumber(Random bigdice)	
    {
		int diceroll = bigdice.nextInt(6) + 1; 
		if (diceroll <=5 && diceroll >=1)
			{ 
				diceroll = diceroll + 3;
			}
		else if (diceroll == 6)
			{
				diceroll = diceroll + 6;
			}
		JOptionPane.showMessageDialog(null, "Player: Your score is " + diceroll);
		return diceroll;   
   } 
 }