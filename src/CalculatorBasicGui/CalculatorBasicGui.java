package calculator.basic.gui;
import javax.swing.JOptionPane;
public class CalculatorBasicGui extends CalculatorBasicGuiFunctions{
	public static void main(String[] args){
		CalculatorBasicGuiFunctions bot = new CalculatorBasicGuiFunctions();
		JOptionPane.showMessageDialog(null, "Welcome to the Basic Gui Calculator Program v2.0", "Basic Calculator Program v2.0", JOptionPane.PLAIN_MESSAGE);
		
		String fn = JOptionPane.showInputDialog("Please enter the first number");
		int num1 = Integer.parseInt(fn);
		
		bot.operators(num1);
		
		String sn = JOptionPane.showInputDialog("Please enter the second number");
		
		int num2 = Integer.parseInt(sn);
		
		bot.math(num1, num2);
		
		
		
	}
}
