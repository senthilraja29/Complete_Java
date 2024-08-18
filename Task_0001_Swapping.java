package Excercise_;

public class Task_0001_Swapping 
{	//Swapping the value without new variable
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 20;
		System.out.println("--Before Swapping the input--");
		System.out.println("Value of a is " + a);
		System.out.println("Value of b is " + b);
		a = a + b;
		b = a - b;
		a = a - b; 
		System.out.println("--After Swapping the input--");
		System.out.println("Value of a is " + a);
		System.out.println("Value of b is " + b);
	}
}
