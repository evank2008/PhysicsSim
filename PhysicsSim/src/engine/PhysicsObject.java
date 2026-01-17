package engine;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Area;

public abstract class PhysicsObject extends Area{


	private double velocityX, velocityY;
	
	public PhysicsObject(Shape s) {
		super(s);
		
		PhysicsSim.objects.add(this);
	}
	void tick() {
		velocityY+=PhysicsSim.gravity;
		
		transform(AffineTransform.getTranslateInstance(velocityX, velocityY));
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

