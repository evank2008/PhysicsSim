package engine;

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends PhysicsObject{

	private int radius=10;
	public Circle() {
		setPosition(400,300);
		setVelocity(10, 5);
	}
	@Override
	void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.white);
		g.fillOval(getX(), getY(), radius, radius);
		g.setColor(Color.black);
		g.drawOval(getX(), getY(), radius, radius);
	}

}
