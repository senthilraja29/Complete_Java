package Excercise_002_;

import java.util.Scanner;

public class Task_0005_ASCII_chart 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the Letter below to find the AscII Value ");
		Scanner inputs = new Scanner(System.in);
		char letter = inputs.next().charAt(0);
		int asc = letter;
		System.out.println(asc);	
	}
}
