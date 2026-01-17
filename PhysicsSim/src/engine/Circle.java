package engine;

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends PhysicsObject{

	private int radius=25;
	public Circle() {
		super();
		setPosition(400,100);
		setVelocity(5, 0);
	}
	@Override
	void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.white);
		g.fillOval(getX(), getY(), 2*radius, 2*radius);
		g.setColor(Color.black);
		g.drawOval(getX(), getY(), 2*radius, 2*radius);
	}
	
	void tick() {
		super.tick();
		//bounce check
		if(getY()+2*radius>PhysicsSim.HEIGHT&&getVelocityY()>0) {
			//28 is the height of the window header
			this.setVelocityY(0-getVelocityY());
		}  if(getY()<0&&getVelocityY()<0) {
			this.setVelocityY(0-getVelocityY());
		}  if(getX()+2*radius>PhysicsSim.WIDTH&&getVelocityX()>0) {
			this.setVelocityX(0-getVelocityX());
		}  if(getX()<0&&getVelocityX()<0) {
			this.setVelocityX(0-getVelocityX());
		}
	}

}
