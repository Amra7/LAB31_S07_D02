package Vjezbe;
/*
 * Zadatak
 * Naparvit prozor u kojem ce pisati "Koliko imate godina" a zatim cete unijeti godine u box.
 * Nakon toga kliknete Ok dugme a broh unesenih godina ce se ispisati na konzoli.
 */
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Godina18DaNe {
	static JTextField ageInput;                 // Varijabla koja se deklarise za citavu klasu
	public static void main(String[] args) {
		
		Panel panelQuestion = new Panel();
		
		JButton okButton = new JButton("Ok");   // dugme Ok
		okButton.setLocation(200, 280);
		ageInput = new JTextField("Upisi godine");
		
	
		ButtonHandler listener = new ButtonHandler();
		okButton.addActionListener(listener);
		
		panelQuestion.setLayout(new BorderLayout());
		panelQuestion.add(okButton, BorderLayout.PAGE_END);
		panelQuestion.add(ageInput, BorderLayout.AFTER_LINE_ENDS);
		ageInput.getAccessibleContext();
		
		JFrame mainWindow = new JFrame();
		mainWindow.setSize(400, 300);
		mainWindow.setContentPane(panelQuestion);
		panelQuestion.setLocation(100, 100);
		
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWindow.setTitle("Smijes li ostati vani poslije 11h?");
		mainWindow.setVisible(true);
	}
	
	public static class Panel extends JPanel {
		public void paintComponent (Graphics g){
			super.paintComponent(g);
			g.drawString("Koliko imas godina?", 50, 100);
		}
	}
	
	public static class ButtonHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			int age= Integer.parseInt(ageInput.getText());
			System.out.println(age);
			
		}

		
	}
}
