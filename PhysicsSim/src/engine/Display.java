package engine;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class Display extends JPanel implements MouseListener{
Timer timer;
boolean started = false;
	public Display() {
		super();
		 timer = new Timer((int) (1000/PhysicsSim.ticksPerSecond),(e)->{
			this.repaint();
			for(PhysicsObject o: PhysicsSim.objects) {
				o.tick();
			}
		});
		 addMouseListener(this);
		new Circle();
	}
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for(PhysicsObject o: PhysicsSim.objects) {
			o.draw(g);
		}

	}
	public void start() {
		timer.start();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		start();
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
