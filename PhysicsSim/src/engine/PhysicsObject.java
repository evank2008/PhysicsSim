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
		//assume 120 tps
		velocityY+=PhysicsSim.gravity/120;
		translate(velocityX/120,velocityY/120);
	}

	public void translate(double dx, double dy) {
		transform(AffineTransform.getTranslateInstance(dx, dy));
	}
	public void setPosition(double x, double y) {
		double dx = x - getBounds().getX();
		double dy = y - getBounds().getY();

		transform(AffineTransform.getTranslateInstance(dx, dy));
	}
	public void setX(double x) {
		double dx = x - getBounds().getX();
		double dy = 0;

		transform(AffineTransform.getTranslateInstance(dx, dy));
	}
	public void setY(double y) {
		double dx = 0;
		double dy = y - getBounds().getX();

		transform(AffineTransform.getTranslateInstance(dx, dy));
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

