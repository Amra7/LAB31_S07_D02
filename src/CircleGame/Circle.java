package CircleGame;

import java.awt.Color;
import java.awt.Graphics;

public class Circle {

	private int x;        // coordinate x
	private int y;        // coordinate z
	private int r;        // radius of circle
	private Color color;  // color of circle 
	
	/**
	 * Constructor for circle
	 */
	public Circle (int x, int y, int r){
		this.x=x;
		this.y=y;
		this.r=50;
		this.color = new Color ((int)(Math.random()*255),(int)(Math.random()*255), (int)(Math.random()*255) );	
		this.speedx
		this.speedY
	}
	
	public void draw(Graphics g, int frame){
		g.setColor(getColor());
		g.fillOval(x, y, this.r, this.r);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	
}
