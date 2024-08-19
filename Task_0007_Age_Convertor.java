package Excercise_002_;

import java.util.Scanner;

public class Task_0007_Age_Convertor 
{
	public static void main(String[] args) 
	{
		System.out.println("enter your age in Decimal");
		Scanner inputs = new Scanner(System.in);
		double age = inputs.nextDouble();
		int age_1 = (int) Math.ceil(age); 
		System.out.println("Your Approximate Age is " + age_1);
		System.out.println("Your Actual Age is " + age);
	}
}
