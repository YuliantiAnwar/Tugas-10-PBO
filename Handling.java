import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Handling extends JFrame implements ActionListener {
	private JButton tombol;

	public Handling() {
		super ("Event Handling");	

		Container container = getContentPane();
		container.setLayout(new FlowLayout());		

		tombol = new JButton ("Click Me!");
		tombol.addActionListener(this);
		container.add(tombol);		

		setSize (200,100);
		setVisible (true);
	}
	
	public static void main (String arg[]) {
		Handling test = new Handling();
		test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed (ActionEvent e) {
		if (e.getSource() == tombol) {
			JOptionPane.showMessageDialog(null, "You click me, guys !!!");
		}
	}
}
