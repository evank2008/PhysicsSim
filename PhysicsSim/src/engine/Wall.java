package engine;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Area;

public class Wall extends Area{
//not movable
	
	public Wall(Shape s) {
		super(s);
	}
	
	void draw(Graphics gg) {
		Graphics2D g = (Graphics2D)gg;
		// TODO Auto-generated method stub
		g.setColor(Color.white);
		g.fill(this);
		g.setColor(Color.black);
		g.draw(this);
	}
}
