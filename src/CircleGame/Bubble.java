package CircleGame;

import java.awt.Color;
import java.awt.Graphics;

public class Bubble extends Geometry {

	private int radius;        // radius of circle
	
	/**
	 * Constructor for circle
	 */
	public Bubble (int positionX, int positionY, Color color, int radius){
        super(positionX, positionY, color);
		this.radius=radius;		
	}
	
	@Override
	public void draw(Graphics g, int frame){
		g.setColor(super.getColor());
		g.fillOval(super.getPositionX() , super.getPositionY(), this.radius, this.radius);
	}


	
	
}
