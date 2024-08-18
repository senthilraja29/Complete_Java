package Excercise_;

import java.util.Scanner;

public class Task_0002_Currency_Convert 
{
	public static void main(String[] args) 
	{
		final double dollar = 83.85 ; 
		System.out.println("Welcome to Currency convertion Platform");
		System.out.println("Kindly enter your Input");
		Scanner inputs = new Scanner(System.in);
		double in_dol = inputs.nextDouble();
		System.out.println("1 dolalr is equal to " + dollar +" Rupees");
		System.out.println("Thanks for using Currency Platform");
		int in_rup	= (int) Math.round(in_dol*dollar);
		System.out.println("Please take your converted Rupees " + in_rup);
	}
}
