import java.util.Scanner;

public class Main extends Functions {
	public static void main(String[] args){
		Functions bot = new Functions();
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
