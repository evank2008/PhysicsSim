package engine;

import java.awt.Graphics;
import java.awt.Point;

public abstract class PhysicsObject {

	private Point position;
	private double velocityX, velocityY;
	
	public PhysicsObject() {
		PhysicsSim.objects.add(this);
	}
	void tick() {
		velocityY+=PhysicsSim.gravity;
		
		position.translate((int)velocityX, (int)velocityY);
	}
	public Point getPosition() {
		return position;
	}
	public void setPosition(int x, int y) {
		position=new Point(x,y);
	}
	public int getX() {
		return position.x;
	}
	public int getY() {
		return position.y;
	}
	public double getVelocityX() {
		return velocityX;
	}
	public double getVelocityY() {
		return velocityY;
	}
	public void setVelocity(double x, double y) {
		velocityX=x;
		velocityY=y;
	}
	public void setVelocityX(double v) {
		velocityX=v;
	}
	public void setVelocityY(double v) {
		velocityY=v;
	}
	abstract void draw(Graphics g);
	
}

