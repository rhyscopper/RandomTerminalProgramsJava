/*
Author: Rhys Copperthwaite
this program is the final part of my short exercise programs which is method + arrays which is part 8.
in this program it uses arrays to store information of which are called thorough the different methods and information is stored in them.
once all the necessary information is put together the user will be asked if they are interested in the cities,
they get a list of names and the ones of which they say yes to will be displayed after with the name, city info and price.
once all this is printed to the screen it quits.
*/
import javax.swing.*;

class Week8 // this is the name of the file
{
	public static void main (String[] param)
	{
		String[] CityNames = new String[5];
		String[] CityInfo = new String[5];
		String[] CityCosts = new String[5];      // here is where the arrays are initialised
		String[] CityChosen = new String[5];

		System.out.println("Please type yes if you are interested in any of the following cities."); //here is where the intro message is displayed
		System.out.println(""); // this gives a one line gap between the into message and what happens next.

		CityNames = NameOfCities();
		CityInfo = CityInfos();               //this is where all the methods are called and which variable the returned results are stored into.
		CityCosts = CostOfCity();

		for (int i =0;i<5;i++) //this is what tells us how many times the for loop is going to run
		{
			CityChosen[i] = JOptionPane.showInputDialog(CityNames[i] + " - " + CityInfo[i]);
			if (CityChosen[i].equals("yes"))
			{              // this tells us if CityChosen[i] equals "yes" then replace it with everything after the = sign.
				CityChosen[i] = CityNames[i] + " - " + CityInfo[i] + " " + CityCosts[i];
			}
			else
			{
							// this tells us else do nothing.
			}
		}// end of for loop
		System.out.println("Your choices:"); //this prints out a message onto the screen.
		for (int a =0;a<5;a++) //another for loop to print out all the values ticked yes.
		{
			if (CityChosen[a].equals(CityNames[a] + " - " + CityInfo[a] + " " + CityCosts[a]))
			{                       //this tells us if the CityChosen[a] equals everything from the (CityNames...) then print out CityChosen[a].
			System.out.println(CityChosen[a]);
			}
			else
			{
			                 // this tells us else do nothing.
			}
		}// end of for loop
	System.exit(0);      //this is were we exit the program.
	}// end of main
	
	public static String[] NameOfCities() //this is the first method which is NameOfCities.
	{
		String[] CityNamess =  {"Madrid","Berlin","Reykjavik","Warsaw","Amsterdam"}; //this tells us what it to be stored in string array CityNamess.
		return CityNamess; //returns the results of CityNamess
	}// end of NameOfCities

	public static String[] CityInfos() //this is the next method of which is CityInfos.
	{
		String[] CityInfo = {"currently very hot weather:","celebration of the anniversary of the falling of the Berlin Wall:","a nearby volcano erupted last week:","a festival of food starts this week:","there is a Rembrandt portrait exhibition:"};
		return CityInfo;      //the above tells us information on each city and on this line returns CityInfo.
	}// end of CityInfos

	public static String[] CostOfCity() //this is the final method of which is CostOfCity()
	{
		String[] CityCosts = {"150 UK pounds","75 UK pounds","10 UK pounds","162 UK pounds","220 UK pounds"}; //this tells us the values of string array CityCosts
		return CityCosts; //this returns CityCosts
	}// end of CostOfCity
	
}// end of class

//use for loops with arrays with i ;)
