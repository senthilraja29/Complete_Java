package Excercise_002_;

import java.util.Scanner;

public class Task_0008_Unit_Conversion 
{
	public static void main(String[] args) 
	{
		System.out.println("1 inches is equal to 2.54cms");
		System.out.println("Enter your Unit to convert");
		Scanner inputs = new Scanner(System.in);
		double inches = inputs.nextDouble();
		final double unit = 2.54;
		double convert = inches * unit;
		int approx = (int) convert;
		System.out.println("Approximate inches are - " + approx + " cms");
		System.out.println("Exact inches are - " + convert + " cms");
				
	}
}
