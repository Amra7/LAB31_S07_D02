package PracticeAndExplanation;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Practice1 {
public static void main(String[] args) {
	
	JFrame window = new JFrame("GUI 101");
	JPanel panel = new JPanel();
	
	JButton b1 = new JButton("DA");
	JButton b2 = new JButton("NE");
	
	b1.addActionListener(new ButtonHandler());  // ovo je primjer kada je donja klasa ButtonHandler 'static' (new ButtonHandler())
	b2.addActionListener(new ButtonHandler());
	panel.add(b1);
	panel.add(b2);
	window.add(panel);
	
	window.setSize(300, 300);
	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Dimension dim = new Dimension(600,600);
	dim.setSize(600, 600);
	window.setMaximumSize(dim);
	window.setVisible(true);
}

private static class ButtonHandler implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Klik!");
		
	    JButton c = (JButton)(e.getSource());
	    c.setText("Clicked");
		
		
	}
	
}
}
