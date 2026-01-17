package engine;

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends PhysicsObject{

	private int radius=50;
	public Circle() {
		super();
		setPosition(400,300);
		setVelocity(5, 0);
	}
	@Override
	void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.white);
		g.fillOval(getX(), getY(), radius, radius);
		g.setColor(Color.black);
		g.drawOval(getX(), getY(), radius, radius);
	}
	
	void tick() {
		super.tick();
		//bounce check
		if(getY()+radius>PhysicsSim.HEIGHT&&getVelocityY()>0) {
			//28 is the height of the window header
			this.setVelocityY(0-getVelocityY());
		} else if(getY()<0&&getVelocityY()<0) {
			this.setVelocityY(0-getVelocityY());
		} else if(getX()+radius>PhysicsSim.WIDTH&&getVelocityX()>0) {
			this.setVelocityX(0-getVelocityX());
		} else if(getX()<0&&getVelocityX()<0) {
			this.setVelocityX(0-getVelocityX());
		}
	}

}
