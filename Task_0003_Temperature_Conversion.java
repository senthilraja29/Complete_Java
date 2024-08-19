package Excercise_002_;

import java.util.Scanner;

public class Task_0003_Temperature_Conversion 
{	//Temperature Conversion
	public static void main(String[] args) 
	{
		System.out.println("Welcome to Temperature Conversion Portal");
		Scanner inputs = new Scanner(System.in);
		System.out.println("Type 1 for Celsius Conversion && Type 2 for Farenhit Conversion");
		final double formu = (double) 5/9 ;
		int  value =  inputs.nextInt();
		if ( value == 1) 
		{
			System.out.println("Enter Your Farenhit data - ");
			double  Feren1 =  inputs.nextDouble();
			int cel1 = (int)((Feren1 - 32) * formu);
			System.out.println(Feren1 + " Farenhit is " + ((int)Math.ceil(cel1)) + " Degree Celsious ");
		}
		else if ( value == 2) 
		{
			System.out.println("Enter Your Celsious data - ");
			int cel2 = inputs.nextInt();
			double Feren2 = (((double) cel2 / formu) + 32 );
			System.out.println(cel2 + " Degree Celsious  is " + Feren2 + " Farenhit");
		} 
		else
		{
			System.out.println("--Invalid Input--");
		}
		
		
	}
}
