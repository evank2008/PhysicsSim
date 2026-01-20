package engine;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class Display extends JPanel implements MouseListener{
Timer tickTimer, drawTimer;
boolean started = false;
	public Display() {
		super();
		tickTimer = new Timer((int) (1000/PhysicsSim.ticksPerSecond),(e)->{
			for(PhysicsObject o: PhysicsSim.objects) {
				o.tick();
			}
		});
		drawTimer = new Timer((int) (1000/PhysicsSim.drawsPerSecond),(e)->{
			this.repaint();
		});
		 addMouseListener(this);
		new Circle(25);
	}
	@Override
	public void paintComponent(Graphics gg) {
		super.paintComponent(gg);
		Graphics2D g = (Graphics2D) gg;
		for(Wall w: PhysicsSim.walls) {
			w.draw(g);
		}
		for(PhysicsObject o: PhysicsSim.objects) {
			o.draw(g);
		}

	}
	public void start() {
		tickTimer.start();
		drawTimer.start();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(!started) {
		start();
		started=true;
		
		} else PhysicsSim.objects.get(0).setPosition(0, 0);
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
