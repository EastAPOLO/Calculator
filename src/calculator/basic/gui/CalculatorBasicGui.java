package calculator.basic.gui;
import javax.swing.JOptionPane;
public class CalculatorBasicGui extends CalculatorBasicGuiFunctions{
	public static void main(String[] args){
		CalculatorBasicGuiFunctions bot = new CalculatorBasicGuiFunctions();
		JOptionPane.showMessageDialog(null, "Welcome to the Basic Gui Calculator Program v2.0", "Basic Calculator Program v2.0", JOptionPane.PLAIN_MESSAGE);
		
		String fn = JOptionPane.showInputDialog("Please enter the first number");
		int num1 = Integer.parseInt(fn);
		
		String operator = JOptionPane.showInputDialog("Current answer is " + fn + "\nEnter the symbol of an operator or type exit to end the program");
		
		String sn = JOptionPane.showInputDialog("Enter the second number");
		int num2 = Integer.parseInt(sn);
		
		bot.calculator(num1, num2, operator);
		
		
		
	}
}
