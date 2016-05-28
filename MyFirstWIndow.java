import java.awt.Frame;
import java.awt.Label;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyFirstWIndow extends Frame {
	public static void main(String[] args) {
		MyFirstWIndow f = new MyFirstWIndow();

		f.setLayout(new FlowLayout());

		for (int i = 1; i <= 100; i++) { 
			Label label = new Label("Label " + i);
			label.setBackground(Color.red);
			label.setForeground(Color.white);
			f.add(label);
		}	

		f.setTitle("My First Window");
		f.setSize(200, 300);
		f.setVisible(true);
		f.addWindowListener(new WindowListener() {
			public void windowOpened(WindowEvent e) {
 				System.out.println("Window is Opened");
			}

			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
			public void windowClosed(WindowEvent e) {
				System.out.println("Window is closed");
			}
			
			public void windowIconified(WindowEvent e) {
				System.out.println("Window is minimized");
			}

			public void windowDeiconified(WindowEvent e) {
				System.out.println("Window is restored");
			}
			
			public void windowActivated(WindowEvent e) {
				System.out.println("Window is activated");
			}
			
			public void windowDeactivated(WindowEvent e) {
				System.out.println("Window is deactivated");
			} 
		});
	}
}