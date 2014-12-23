package Predavanje;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorfulRectangle {
	public static void main(String[] args) {
		
		RepaintListener listener = new RepaintListener();

		Canvas canvasPanel = new Canvas ();
		
		canvasPanel.addMouseListener(listener);
		
		JFrame mainWindow = new JFrame("Pravougaonik");
		mainWindow.setSize(800, 600);
		mainWindow.setContentPane(canvasPanel);
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWindow.setVisible(true);
		
	
		
		

	}
	
	public static class RepaintListener implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			Component source = (Component)e.getSource();
			source.repaint();
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}

	public static class Canvas extends JPanel {
		@Override
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			
			// varijante kako se sve moye napisati boja 
			// boja se moze napisati preko RGI i HSB
			
		//	g.setColor(Color.MAGENTA);			
			g.setColor( new Color(0.2f,0.7f, 0.8f));
		//	g.setColor( new Color((float)(Math.random()),(float)(Math.random()), (float)(Math.random())));  
			g.setColor( new Color((int)(Math.random()*255),(int)(Math.random()*255), (int)(Math.random()*255)));
		//	g.drawRect(50, 50, 150, 150);
			
			g.setColor( Color.getHSBColor(0.2f, (float)Math.random(), (float)Math.random()));
			g.fillRect(10, 10,  getWidth() -20, getHeight() -20);
			g.drawString("STA DA NAPISEM", 400, 200);
		}
		
	}
}
