package engine;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class Circle extends PhysicsObject{

	private int radius=25;
	double restitution=0.05;
	public Circle(int r) {
		super(new Ellipse2D.Double(0,0,r*2,r*2));
		getBounds().setLocation(400,100);
		setVelocity(5, 0);
	}
	@Override
	void draw(Graphics gg) {
		Graphics2D g = (Graphics2D)gg;
		// TODO Auto-generated method stub
		g.setColor(Color.white);
		g.fill(this);
		g.setColor(Color.black);
		g.draw(this);
	}
	
	void tick() {
		super.tick();
		//bounce check
		if(getBounds().getY()+2*radius>PhysicsSim.HEIGHT&&getVelocityY()>0) {
			//28 is the height of the window header
			this.setVelocityY(0-getVelocityY()*(1-restitution));
		}  if(getBounds().getY()<0&&getVelocityY()<0) {
			this.setVelocityY(0-getVelocityY()*(1-restitution));
		}  if(getBounds().getX()+2*radius>PhysicsSim.WIDTH&&getVelocityX()>0) {
			this.setVelocityX(0-getVelocityX()*(1-restitution));
		}  if(getBounds().getX()<0&&getVelocityX()<0) {
			this.setVelocityX(0-getVelocityX()*(1-restitution));
		}
	}

}
