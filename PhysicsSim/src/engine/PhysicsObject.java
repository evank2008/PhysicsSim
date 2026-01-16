package engine;

import java.awt.Point;

public abstract class PhysicsObject {

	private Point position;
	private Vector velocity;
	private Vector acceleration;
	private Vector force;
	private int mass;
	
	void tick() {
		//first apply force
		//then accelerate
		//then move
	}
}
class Vector {
	private double magnitudeX,magnitudeY;
	public Vector(double x, double y) {
		magnitudeX=x;
		magnitudeY=y;
	}
	public Vector getXVector() {
		return null;
	}
	public Vector getYVector() {
		return null;
	}
	public Vector getUnitVector() {
		return null;
	}
	public double getDirection() {
		//degrees
		return 0;
	}
}
