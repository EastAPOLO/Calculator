import java.util.Scanner;
public class CalculatorFunctions {
	Scanner t = new Scanner(System.in);
	
	String mode;
	int sum;
	
	public void math(int number1, int number2){
		int answer = 0;
		this.sum = answer;
		
		if(mode.equals("+")){
			answer = number1 + number2;
		}
		
		if(mode.equals("-")){
			answer = number1 - number2;
		}
		
		if(mode.equals("*")){
			answer = number1 * number2;
		}
		
		if(mode.equals("/")){
			answer = number1 / number2;
		}
		System.out.println("The answer is " + answer);
		
			calculatorRepeat(answer);
		
	}
	
	public void operators(){
		System.out.println("Please choose an operator or type exit to kill the program.");
		this.mode = t.nextLine();
		
		if(this.mode.equals("Exit") || this.mode.equals("exit")){
			System.out.println("----------------------");
			System.out.println("The program has ended");
			System.out.println("----------------------");
			System.exit(0);
		}
	}
	
	public void calculatorRepeat(int total){
		
		while(sum > -1){
			operators();
			System.out.println("Please enter the second number aka");
			int num3 = t.nextInt();
			this.sum = total;
			if(mode.equals("+")){
				total = sum + num3;
				System.out.println("The answer is " + total);
			}
			
			if(mode.equals("-")){
				total = sum - num3;
				System.out.println("The answer is " + total);
			}
			
			if(mode.equals("*")){
				total = sum * num3;
				System.out.println("The answer is " + total);
			}
			
			if(mode.equals("/")){
				total = sum / num3;
				System.out.println("The answer is " + total);
			}
			
		}
		
		
	}
}
