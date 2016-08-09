import java.util.Scanner;
public class CalculatorFunctions {
	Scanner t = new Scanner(System.in);
	
	int mode;
	int sum;
	
	public void math(int number1, int number2){
		int answer = 0;
		this.sum = answer;
		
		if(mode == 1){
			answer = number1 + number2;
		}
		
		if(mode == 2){
			answer = number1 - number2;
		}
		
		if(mode == 3){
			answer = number1 * number2;
		}
		
		if(mode == 4){
			answer = number1 / number2;
		}
		System.out.println("The answer is " + answer);
		
			calculatorRepeat(answer);
		
	}
	
	public void operators(){
		System.out.println("0 - (Exit Program)");
		System.out.println("1 - (+)");
		System.out.println("2 - (-)");
		System.out.println("3 - (*)");
		System.out.println("4 - (/)");
		System.out.println("Please choose an operator or exit the program.");
		this.mode = t.nextInt();
		
		if(this.mode == 0){
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
			if(mode == 1){
				total = sum + num3;
				System.out.println("The answer is " + total);
			}
			
			if(mode == 2){
				total = sum - num3;
				System.out.println("The answer is " + total);
			}
			
			if(mode == 3){
				total = sum * num3;
				System.out.println("The answer is " + total);
			}
			
			if(mode == 4){
				total = sum / num3;
				System.out.println("The answer is " + total);
			}
			
		}
		
		
	}
}
