import javax.swing.JOptionPane;

public class MultTable {
	public static void main(String[] args) {
		int n = Integer.parseInt(
			JOptionPane.showInputDialog(
				null,
				"Enter number",
				"0"
			)
		);

		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= 10; i++)
			//sb.append(n).append(" X ").append(i).append(" = ").append(n*i).append("\n");
			sb.append(n + " X " + i + " = " + (n*i) + "\n");		

		JOptionPane.showMessageDialog(
			null,
			sb
		);
	}
}