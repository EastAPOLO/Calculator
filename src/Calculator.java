import java.util.Scanner;

public class Calculator extends CalculatorFunctions {
	public static void main(String[] args){
		CalculatorFunctions bot = new CalculatorFunctions();
		Scanner s = new Scanner(System.in);
		
		System.out.println("Welcome to the Calculator Program v2.0");
		
		System.out.println("Please enter the first number");
		int num1 = s.nextInt();
		
		bot.operators();
	
		
		System.out.println("Please enter the second number");
		int num2 = s.nextInt();
		
		bot.math(num1, num2);
		
		s.close();
		
	}
}
