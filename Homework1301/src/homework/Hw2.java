package homework;

import java.util.Scanner;

public class Hw2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int days;
		int assignments;
		double temperature;
		boolean isRaining;
		Scanner input = new Scanner(System.in);
		boolean doHomework = false;
		
		System.out.println("How many days until the assignment is due?");
		days = input.nextInt();
		System.out.println("How many assignments are due in all classes?");
		assignments = input.nextInt();
		System.out.println("What is the current temperature?");
		temperature = input.nextDouble();
		System.out.println("Is it raining?");
		isRaining = input.nextBoolean();
		
		if( days < 5)
			doHomework = true;
		if(assignments > 4)
			doHomework = true;
		if(isRaining && temperature < 50.0)
			doHomework = true;
		
		if(doHomework)
			System.out.println("You should speed up");
		else
			System.out.println("Take your time");
		
		

	}

}
