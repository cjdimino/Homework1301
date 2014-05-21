package labs;

//Carl Dimino
//CSCI 1301 A
//5-21-2014
//Lab2 converts feet to meters

import java.util.Scanner;

public class Lab2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double meter;
		double foot;
		
		Scanner input = new Scanner(System.in);
		
		foot = input.nextDouble();
		meter = (int)((.305 * foot) * 100) / 100.00;
		
		System.out.println("" + meter + " Meters");
		
	}

}
