package CircleGame;
/**
 * Napraviti prozor u kome ce se generisati 4 kruga.
 * Krugovi se trebaju kretati i udarati o granice prostora. Kada udare u ivicu  prostora (prozora) promijene smjer.
 * Ukoliko korisnik klikne na krug, krug nestaje, a negdje na ekranu se ispisuje koliko krugova (bodova) imamo.
 * Kaka korisnik krlikne na prazan prostor bez krugova, pojavljuje se novi krug.
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class CircleGame {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Circle Game");
		frame.setSize(600, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Component c = new Circle(10,10,10);
		
		SimpleDrawning circles= new SimpleDrawning();
		frame.setContentPane(circles);
		circles.setBackground(Color.BLACK);
		
		frame.setVisible(true);
	}
	
	public static class SimpleDrawning extends JPanel implements ActionListener{
        int frame =0;
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
}
