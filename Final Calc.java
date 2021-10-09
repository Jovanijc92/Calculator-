import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) 
	{
		// Declare two float variables for the user to decide the values 
		float a;
		float b; 
		
		
		
		// Define a new variable that holds the character that represents the operation 
		char operation; 
		
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
		
		//Prompt the user for the operation to be completed
		System.out.println("Enter the operation: ");
		//Set the operation to the character the user enters 
		operation = keyboard.next().charAt(0);
		
		//Output the two values and the operation to the user 
		System.out.println(a + " " + operation + " " + b + " = ???");
		
		//Close the keyboard to prevent memory leakage 
		keyboard.close();
		
		//Take different actions depending on the operation passed to the function 
		switch(operation) 
		{
			//If the operation is a + 
			case '+':
				add(a, b);
				break;
				
			//If the operation is a - 
			case '-':
				subtract(a, b);
			break;
			
			//If the operation is a * 
			case '*': 
				multiply(a, b);
			break;
			
			//If the operation is a / 
			case '/':
				divide(a, b);
			break;
			
			default: 
				break; 	
		}
		
	}

	private static void divide(float a, float b) 
	{
		//Add the two values passed 
		float c = a/b;
		
		//Print out the result 
		System.out.println(a + "/" + b + "=" + c);	
	}

	private static void multiply(float a, float b) 
	{
		//Add the two values passed 
		float c = a * b; 
		
		//Print out the result 
		System.out.println(a + "*" + b + "=" + c);
	}

	private static void subtract(float a, float b) 
	{
		//Add the two values passed 
		float c = a - b;
		
		//Print out the result 
		System.out.println(a + "-" + b + "=" + c);
	}

	private static void add(float a, float b) 
	{
		//Add the two values passed 
		float c = a + b; 
		
		//Print out the result 
		System.out.println(a + "+" + b + "=" + c); 
	}

}
