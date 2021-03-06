package geometry;

import java.awt.Graphics;

public class Line extends Shape {
	
	private Point startPoint;
	private Point endPoint;
	
	public double length() {
		return startPoint.distance(endPoint);
	}
	
	@Override
	public boolean contains(int x, int y) {
		return this.startPoint.distance(new Point(x,y)) + this.endPoint.distance(new Point(x,y)) 
			- length() <= 2;
	}
	
	@Override
	public String toString() {
		return "(" + this.startPoint.getX() + ", " + this.startPoint.getY() +  
				") -- > (" + this.endPoint.getX() + ", " + this.endPoint.getY() + ")";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Line) {
			Line temp = (Line) obj;
			if(this.startPoint.equals(temp.startPoint) && this.endPoint.equals(temp.endPoint)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public void draw(Graphics g) {
		g.drawLine(startPoint.getX(), startPoint.getY(), endPoint.getX(), endPoint.getY());
	}
	
	@Override
	public void moveTo(int x, int y) {
		// TODO Auto-generated method stub
	}

	@Override
	public void moveBy(int byX, int byY) {
		startPoint.moveBy(byX, byY);
		endPoint.moveBy(byX, byY);
	}
	
	@Override
	public int compareTo(Object o) {
		if(o instanceof Line) {
			return (int)(length() - ((Line)o).length());
		}
		return 0;
	}

	
	//Konstruktori
	
	public Line() {
		
	}
	
	public Line(Point sp, Point ep) {
		startPoint = sp;
		endPoint = ep;
	}
	
	public Line(Point startPoint, Point endPoint, boolean selected) {
		this(startPoint, endPoint);
		this.selected = selected;
	}
	
	public Point getStartPoint() {
		return startPoint;
	}
	public void setStartPoint(Point startPoint) {
		this.startPoint = startPoint;
	}
	public Point getEndPoint() {
		return endPoint;
	}
	public void setEndPoint(Point endPoint) {
		this.endPoint = endPoint;
	}

	

	

	
}
