import javax.swing.JOptionPane;

public class GUIIO {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog(
			null, 
			"What's your name?", 
			"John Hopkings"
		);		

		JOptionPane.showMessageDialog(
			null, 
			"Hello, " + name + "!", 
			"Welcome Message", 
			JOptionPane.QUESTION_MESSAGE
		);
	}	
}