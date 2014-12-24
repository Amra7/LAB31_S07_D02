package CircleGame;
/**
 *Zadatak za samostalni rad
 * * Napraviti prozor u kome ce se generisati 4 kruga.
 * Krugovi se trebaju kretati i udarati o granice prostora. Kada udare u ivicu  prostora (prozora) promijene smjer.
 * Ukoliko korisnik klikne na krug, krug nestaje, a negdje na ekranu se ispisuje koliko krugova (bodova) imamo.
 * Kaka korisnik krlikne na prazan prostor bez krugova, pojavljuje se novi krug.
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class BubbleGame {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Bubble Game");
		frame.setSize(600, 500);
		
		BubbleDrawning bd = new BubbleDrawning();
		frame.setContentPane(bd);
		
		Timer frameTimer = new Timer(25, bd);
		frameTimer.start();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public static class BubbleDrawning extends JPanel implements ActionListener{
        int frame =0;
		
        protected void paintComponent(Graphics g){
        	super.paintComponent(g);
        	drawBubble(g, frame++);
        }
		private void drawBubble(Graphics g, int i) {
			Bubble b1 = new Bubble(10,10,Color.RED,40);
			b1.draw(g, 40);
			b1.move(40);
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			
			repaint();
			
		}
		
	}
}
