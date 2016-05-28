import javax.swing.JOptionPane;

public class SumGUI {
	public static void main(String[] args) {
		int number1 = Integer.parseInt(
			JOptionPane.showInputDialog(
				null, 
				"Number 1? ", 
				"0"
			)
		);

		int number2 = Integer.parseInt(
			JOptionPane.showInputDialog(
				null, 
				"Number 2? ", 
				"0"
			)
		);

		JOptionPane.showMessageDialog(
			null,
			"Sum of " + number1 + " and " + number2 + " is " + (number1+number2)
		);
	}
}