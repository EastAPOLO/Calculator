package calculator.basic.gui;

import javax.swing.JOptionPane;

public class CalculatorBasicGuiFunctions {
	int sum;
	String operator;
	
	public void math(int number1, int number2){
		int answer = 0;
		if(operator.equals("+")){
			answer = number1 + number2;
		}
		if(operator.equals("-")){
			answer = number1 - number2;
		}
		if(operator.equals("*")){
			answer = number1 * number2;
		}
		if(operator.equals("/")){
			answer = number1 / number2;
		}
		CalculatorRepeat(answer);
	}
	
	public void operators(int track){
		
		String mode = JOptionPane.showInputDialog("Current answer is " + track + "\nEnter the symbol of an operator or type exit to end the program");
		operator = mode;
		
		if(operator.equals("exit") || operator.equals("Exit")){
			JOptionPane.showMessageDialog(null, "The program has ended" );
			System.exit(0);
		}
	}
	
	public void CalculatorRepeat(int total){
		while(total > 0){
			sum = total;
			operators(total);
			String tn = JOptionPane.showInputDialog("Please enter the second number");
			int num3 = Integer.parseInt(tn);
			
			if(operator.equals("+")){
				total = sum + num3;
			}
			if(operator.equals("-")){
				total = sum - num3;
			}
			if(operator.equals("*")){
				total = sum * num3;
			}
			if(operator.equals("/")){
				total = sum / num3;
			}
			
		}
	}
}
