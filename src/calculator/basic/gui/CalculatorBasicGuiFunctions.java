package calculator.basic.gui;

import javax.swing.JOptionPane;

public class CalculatorBasicGuiFunctions {
	int sum;
	String operator;
	
	public void calculator(int number1, int number2, String op){
		operator = op;
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
	
	public void CalculatorRepeat(int total){
		while(total > 0){
			sum = total;
			
			String mode = JOptionPane.showInputDialog("Current answer is " + sum + "\nEnter the symbol of an operator or type exit to end the program");
			
			String addition = "+";
			String subtraction = "-";
			String multiplication = "*";
			String division = "/";
			
			if(mode.equals("exit") || mode.equals("Exit")){
				JOptionPane.showMessageDialog(null, "The program has ended" );
				System.exit(0);
			}
			
			if(mode.equals(addition)){
				String tn = JOptionPane.showInputDialog("Please enter the second number");
				int num3 = Integer.parseInt(tn);
				total = sum + num3;
			}
			
			if(mode.equals(subtraction)){
				String tn = JOptionPane.showInputDialog("Please enter the second number");
				int num3 = Integer.parseInt(tn);
				total = sum - num3;
			}
			
			if(mode.equals(multiplication)){
				String tn = JOptionPane.showInputDialog("Please enter the second number");
				int num3 = Integer.parseInt(tn);
				total = sum * num3;
			}
			
			if(mode.equals(division)){
				String tn = JOptionPane.showInputDialog("Please enter the second number");
				int num3 = Integer.parseInt(tn);
				total = sum / num3;
			}
		}
	}
}