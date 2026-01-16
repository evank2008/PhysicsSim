package engine;

import java.awt.Color;

import javax.swing.JFrame;

public class PhysicsSim {

	Display display;
	JFrame frame;
	public static final int WIDTH=800,HEIGHT=600;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PhysicsSim().run();
	}
	void run() {
		display = new Display();
		display.setBackground(new Color(200,120,150));
		
		frame = new JFrame("Physics");
		frame.setSize(WIDTH,HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(display);
		frame.setVisible(true);
	}

}
