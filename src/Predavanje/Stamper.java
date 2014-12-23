package Predavanje;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Stamper {
	public static void main(String[] args) {

		SimpleListener listener = new SimpleListener();

		// JPanel canvasPanel = new JPanel();
		// canvasPanel.setBackground(Color.WHITE);
		// canvasPanel.addMouseMotionListener(listener);

		Canvas1 canvasPanel1 = new Canvas1();
		canvasPanel1.setBackground(Color.WHITE);
		canvasPanel1.addMouseListener(listener);
		canvasPanel1.addMouseMotionListener(listener);

		JFrame mainWindow = new JFrame("Test misa");
		mainWindow.setSize(500, 500);
		// mainWindow.setContentPane(canvasPanel);
		mainWindow.setContentPane(canvasPanel1);

		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWindow.setVisible(true);

	}

	public static class SimpleListener implements MouseListener, MouseMotionListener {

		private Color selectedColor = Color.RED;
		
		@Override
		public void mouseClicked(MouseEvent e) {
			 Component source = (Component)e.getSource();
			 Graphics g =source.getGraphics();
			 g.setColor(selectedColor);
//			 g.fillOval(e.getX()-5 , e.getY()-5, 10, 10);

		}

		@Override
		public void mouseEntered(MouseEvent e) {

		}

		@Override
		public void mouseExited(MouseEvent e) {

		}

		@Override
	public void mousePressed(MouseEvent e) {
		Component source = (Component)e.getSource();
		Graphics g =source.getGraphics();
		
//		g.setColor( new Color((int)(Math.random()*255),(int)(Math.random()*255), (int)(Math.random()*255)));
//		g.fillOval(e.getX()-5	, e.getY()-5, 10, 10);
		
		int colorPickerSize = 50;
		
		
		if ( e.getY() >= source.getHeight() - colorPickerSize){
			if ( e.getX()>=0 && e.getX() < colorPickerSize){
				selectedColor = Color.RED;
			}
			else if ( e.getX()>=0 && e.getX() < colorPickerSize*2){
				selectedColor = Color.ORANGE;
			}
			else if ( e.getX()>=0 && e.getX() < colorPickerSize*3){
				selectedColor = Color.GREEN;
			}
			else if ( e.getX()>=0 && e.getX() < colorPickerSize*4){
				selectedColor = Color.BLUE;
			} 
			else if ( e.getX()>=0 && e.getX() < colorPickerSize*5){
				selectedColor = Color.BLACK;
			}
		}
		
		}

		@Override
		public void mouseDragged(MouseEvent e) {
			Component source = (Component) e.getSource();
			Graphics g = source.getGraphics();
			
			g.setColor(selectedColor);
			
//			g.setColor(new Color((int) (Math.random() * 255), (int) (Math
//					.random() * 255), (int) (Math.random() * 255)));
			
			int ovalDiameter = 10;
			g.fillOval(e.getX() - ovalDiameter / 2,
					e.getY() - ovalDiameter / 2, ovalDiameter, ovalDiameter);
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// Component source = (Component)e.getSource();
						// Graphics g =source.getGraphics();
						// g.setColor( new
						// Color((int)(Math.random()*255),(int)(Math.random()*255),
						// (int)(Math.random()*255)));
						// int ovalDiameter=10;
						// g.fillOval(e.getX()-ovalDiameter/2 , e.getY()-ovalDiameter/2,
						// ovalDiameter, ovalDiameter);

			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}

		

		

		

	

//	public static class Canvas extends JPanel {
//		@Override
//		public void paintComponent(Graphics g) {
//			super.paintComponent(g);
//
//			// varijante kako se sve moye napisati boja
//			// boja se moze napisati preko RGI i HSB
//
//			// g.setColor(Color.MAGENTA);
//			g.setColor(new Color(0.2f, 0.7f, 0.8f));
//			// g.setColor( new
//			// Color((float)(Math.random()),(float)(Math.random()),
//			// (float)(Math.random())));
//			g.setColor(new Color((int) (Math.random() * 255), (int) (Math
//					.random() * 255), (int) (Math.random() * 255)));
//			// g.drawRect(50, 50, 150, 150);
//
//			g.setColor(Color.getHSBColor(0.2f, (float) Math.random(),
//					(float) Math.random()));
//			g.fillRect(10, 10, getWidth() - 20, getHeight() - 20);
//			g.drawString("STA DA NAPISEM", 400, 200);
//		}
//
//	}

	public static class Canvas1 extends JPanel {

		@Override
		public void paintComponent(Graphics g) {
			int colorPickerSize = 50;

			g.setColor(Color.RED);
			g.fillRect(0, getHeight() - colorPickerSize, colorPickerSize,
					colorPickerSize);

			g.setColor(Color.ORANGE);
			g.fillRect(colorPickerSize, getHeight() - colorPickerSize,
					colorPickerSize, colorPickerSize);

			g.setColor(Color.GREEN);
			g.fillRect(colorPickerSize * 2, getHeight() - colorPickerSize,
					colorPickerSize, colorPickerSize);

			g.setColor(Color.BLUE);
			g.fillRect(colorPickerSize * 3, getHeight() - colorPickerSize,
					colorPickerSize, colorPickerSize);

			g.setColor(Color.BLACK);
			g.fillRect(colorPickerSize * 4, getHeight() - colorPickerSize,
					colorPickerSize, colorPickerSize);

		}

	}
}


