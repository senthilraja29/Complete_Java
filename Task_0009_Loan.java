package Excercise_002_;

import java.util.Scanner;

public class Task_0009_Loan 
{
	public static void main(String[] args) 
	{
		System.out.println("--Welcome to Loan Calculator--");
		Scanner inputs = new Scanner(System.in);
		System.out.println("Enter your Principal Amount ");
		String Principal	= inputs.next();
		int convert_p 		= Integer.parseInt(Principal);
		System.out.println("Enter your Interest in percentage");
		String percentage		= inputs.next();
		int convert_i		= Integer.parseInt(percentage);
		System.out.println("Enter your tenure in months");
		String time 		= inputs.next();
		int convert_t		= Integer.parseInt(time);
		int interest = (convert_p * convert_i * convert_t ) /100 ;
		System.out.println("Total Amount With Interest is "+ interest);
	}
}
