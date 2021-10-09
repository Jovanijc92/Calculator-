import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) 
	{
		// Declare two float variables for the user to decide the values 
		float a;
		float b; 
		
		// Declare a new Scanner object called keyboard and set it to listen to the console input 
		Scanner keyboard = new Scanner(System.in);
		
		//Prompt the user for the first number 
		System.out.println("Enter the first number: ");
		//Set a to the next float value the user enters 
		a = keyboard.nextFloat();
		
		//Prompt the user for the second number 
		System.out.println("Enter the second number: "); 
		// Set the next float value the user enters
		b = keyboard.nextFloat();
		
		//Output the two values the user entered back to them 
		System.out.println("A is: " + a + " B is: " + b);
		
		//Close the keyboard to prevent memory leakage 
		keyboard.close();
	}

}
