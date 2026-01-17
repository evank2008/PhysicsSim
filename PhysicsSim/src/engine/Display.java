package engine;

import java.awt.*;

import javax.swing.*;

public class Display extends JPanel{
Timer timer;
	public Display() {
		super();
		 timer = new Timer(1000/PhysicsSim.ticksPerSecond,(e)->{
			this.repaint();
		});

		
	}
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for(PhysicsObject o: PhysicsSim.objects) {
			o.tick();
			o.draw(g);
		}
	}
	public void start() {
		timer.start();
	}
}
