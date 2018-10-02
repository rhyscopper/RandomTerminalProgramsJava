/*
Author: Rhys Copperthwaite
Program: The following program code is week5 of my procedual programming short assesed programming excersises.
this one is arrays. here the program asks for 4 different films playing in 4 differnt screens.
from this it asks the time each film is on. 
at the end it outputs the different screen numbers, films played and the time the films will be on.
*/
import javax.swing.*;// imports the library for I/O

class CineworldFilms
{
public static void main (String [] param)
{

	AskCinemaQuestion();
	System.exit(0);
}

public static void AskCinemaQuestion()
{
String [] films = new String [4];
String [] filmTimes = new String [4];

for(int i = 0; i< 4;i++) //this is were the amount of times the for loop will run is initilised. here it tells us it will run 4 times. 
{// the below is where the program asks the film times and stored the inputted in TextInput.
String TextInput = JOptionPane.showInputDialog("What is the film of screen " + (i+1) + " today?");
films[i] = TextInput; //this tells us what is stored in TextInput will be stored in film number i which depends on the loop number were on. 

String TextInput2 = JOptionPane.showInputDialog("What time does it start?");
filmTimes[i] = TextInput2;
}
for(int i = 0; i< 4; i++)
{
	System.out.println("Screen " + (i+1) + ": " + films[i]+ "         " + filmTimes[i]);
} // the above is where all the data is put together and is outputted onto the screen. 
}
}
