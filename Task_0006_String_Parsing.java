package Excercise_002_;

import java.util.Scanner;

public class Task_0006_String_Parsing 
{
	public static void main(String[] args) 
	{	//Convert String into Integer
		System.out.println("Welcome to String Parsing Page");	
		Scanner inputs = new Scanner(System.in);
		System.out.println("Give your 1st Input ");
		String value1 = inputs.next();
		System.out.println("Give your 2nd Input ");
		String value2 = inputs.next();
		int a = Integer.parseInt(value1);
		int b = Integer.parseInt(value2);
		
		System.out.println("Addition of two values " + (a+b));
		System.out.println("Subtraction of two values " + (a-b));
		System.out.println("Multiplication of two values " + (a*b));
		System.out.println("Division of two values " + (a/b));
		
		
	}
}
