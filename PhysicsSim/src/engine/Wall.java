package engine;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;
import java.awt.geom.Area;

public class Wall extends Polygon{
//not movable
	
	public Wall(int[] xpoints, int[] ypoints, int npoints) {
		super(xpoints, ypoints, npoints);
		PhysicsSim.walls.add(this);
	}
	
	void draw(Graphics2D g) {
		// TODO Auto-generated method stub
		g.setColor(Color.white);
		g.fill(this);
		g.setColor(Color.black);
		g.draw(this);
	}
}
