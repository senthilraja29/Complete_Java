package Excercise_;

public class Task_0001_Swapping_variables  
// In this code shuffle two variables without new variable
{
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 20;
		System.out.println("Before Shuffle ");
		System.out.println("Value of a is " + a );
		System.out.println("Value of b is " + b );
		System.out.println("After Shuffle ");
		a = a + b;
		System.out.println("After Shuffle ");
		b = a - b;
		a = a - b;
		System.out.println("value of a is " +a);
		System.out.println("value of b is " +b);
	}
}
