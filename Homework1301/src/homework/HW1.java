package homework;

import java.util.Scanner;

public class HW1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final double pi = 3.14159;
		Scanner input = new Scanner(System.in);
		
		double radius;
		double area;
		double length;
		double volume;
		
		
		System.out.println("Enter a radius: ");
		radius = input.nextDouble();
		System.out.println("Enter a length: ");
		length = input.nextDouble();
		
		area = radius * radius * pi;
		volume = area * length;
		
		System.out.println("A cylinder with a radius of " + radius + " and a length of " + length + " has a volume of " + volume);
		
		
		

	}

}
