package engine;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JFrame;

public class PhysicsSim {
	public static int WIDTH=800,HEIGHT=600;
	public static ArrayList<PhysicsObject> objects;
	public static ArrayList<Wall> walls;
	public static double 
	gravity=4000, //acceleration in a second
	ticksPerSecond=120, //increasing this should make everything faster
	drawsPerSecond=120
	;
	
	Display display;
	JFrame frame;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PhysicsSim().run();
	}
	void run() {
		objects = new ArrayList<PhysicsObject>();
		walls = new ArrayList<Wall>();
		display = new Display();
		display.setBackground(new Color(200,120,150));
		
		frame = new JFrame("Physics");
		frame.setSize(WIDTH,HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(display);
		frame.setVisible(true);
		HEIGHT-=(frame.getInsets().top+frame.getInsets().bottom);
		//System.out.println(frame.getInsets().top);
		
		
	}

}
