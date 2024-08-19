package Excercise_002_;

import java.util.Scanner;

public class Task_0004_Shopping_Bills 
{	// Casting Values by using Bills 
	public static void main(String[] args) 
	{
		System.out.println("--Welcome to Bill Conversion--");
		Scanner inputs =  new Scanner(System.in);
		System.out.println("Enter your Home Rent ");
		double Home = inputs.nextDouble();
		System.out.println("Enter your Car EMI ");
		double car = inputs.nextDouble();
		System.out.println("Enter your Grocery Bills");
		double grocery = inputs.nextDouble();
		double total = Home+ car+ grocery;
		System.out.println("Your total Bill is " + total);
		int total_truc = (int) Math.ceil(total);
		System.out.println("After Truncated Bill is "+ total_truc);
	}
}
