package homework;

//Carl Dimino
//CSCI 1301 A
//5-21-2014
//Hw2 Takes a variety of inputs and decides whether the user should speed up his or her work on school assignments

import java.util.Scanner;

public class Hw2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Initializing variables
		int days;
		int assignments;
		double temperature;
		boolean isRaining;
		boolean doHomework = false;
		
		//initializing Scanner
		Scanner input = new Scanner(System.in);
		
		//Getting input from console
		System.out.println("How many days until the assignment is due?");
		days = input.nextInt();
		
		System.out.println("How many assignments are due in all classes?");
		assignments = input.nextInt();
		
		System.out.println("What is the current temperature?");
		temperature = input.nextDouble();
		
		System.out.println("Is it raining?");
		isRaining = input.nextBoolean();
		
		//computing doHomework
		if( days < 5)
			doHomework = true;
		
		if(assignments > 4)
			doHomework = true;
		
		if(isRaining && temperature < 50.0)
			doHomework = true;
		
		
		//Outputting results
		if(doHomework)
			System.out.println("You should speed up");
		else
			System.out.println("Take your time");
		
	}

}
