package engine;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

public class Circle extends PhysicsObject{

	private int radius=25;
	double restitution=0.05;
	public Circle(int r) {
		super(new Ellipse2D.Double(0,0,r*2,r*2));
		setPosition(0,0);
		setVelocity(5, 0);
		radius=r;
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
		Rectangle predictedPos = getBounds();
		predictedPos.translate((int)(getVelocityX()/PhysicsSim.ticksPerSecond), (int)((getVelocityY()+PhysicsSim.gravity/PhysicsSim.ticksPerSecond)/PhysicsSim.ticksPerSecond));
		if(predictedPos.getY()>PhysicsSim.HEIGHT-2*radius&&getVelocityY()>0) {
			this.setVelocityY(0-getVelocityY()*(1-restitution));
		}  if(predictedPos.getY()<0&&getVelocityY()<0) {
			this.setVelocityY(0-getVelocityY()*(1-restitution));
		}  if(predictedPos.getX()+2*radius>PhysicsSim.WIDTH&&getVelocityX()>0) {
			this.setVelocityX(0-getVelocityX()*(1-restitution));
		}  if(predictedPos.getX()<0&&getVelocityX()<0) {
			this.setVelocityX(0-getVelocityX()*(1-restitution));
		}
	}

}
