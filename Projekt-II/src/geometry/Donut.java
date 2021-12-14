package geometry;

import java.awt.Graphics;

public class Donut extends Circle {

	private int innerRadius;
	
	
	@Override
	public double area() {
		return super.area() - innerRadius*innerRadius*Math.PI;
	}
	
	@Override
	public String toString() {
		return super.toString() + " inner radius = " + this.innerRadius;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Donut) {
			Donut temp = (Donut) obj;
			if(this.center.equals(temp.center) && this.radius == temp.radius && this.innerRadius == temp.innerRadius){
				return true;
			}
		}
		return false;
	}
	
	@Override
	public boolean contains(int x, int y) {
		if(super.contains(x, y) && this.center.distance(new Point(x,y)) >= innerRadius){
			return true;
		}
		return false;
	}
	
	@Override
	public boolean contains(Point p) {
		return contains(p.getX(),p.getY());
	}
	
	@Override
	public void draw(Graphics g) {
		super.draw(g);
		g.drawOval(center.getX()-innerRadius, center.getY()-innerRadius,innerRadius*2, innerRadius*2);
	}
	
	@Override
	public int compareTo(Object o) {
		if(o instanceof Donut) {
			return (int)(area() - ((Donut)o).area());
		}
		return 0;
	}
	
	//Konstruktori
	public Donut() {
		
	}
	
	public Donut(Point center, int radius, int innerRadius) {
		super(center, radius);
		this.innerRadius = innerRadius;
	}
	
	public Donut(Point center, int radius, int innerRadius, boolean selected) {
		this(center,radius,innerRadius);
		this.selected = selected;
	}
	
	
	//Metode pristupa
	public int getInnerRadius() {
		return innerRadius;
	}
	
	public void setInnerRadius(int innerRadius) {
		this.innerRadius = innerRadius;
	}

}
