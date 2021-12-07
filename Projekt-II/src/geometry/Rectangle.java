package geometry;

import java.awt.Graphics;

public class Rectangle extends Shape {

	private int width;
	private int height;
	private Point upperLeft;
	
	public int area() {
		return width*height;
	}
	
	public int circumference() {
		return 2*width + 2*height;
	}
	
	@Override
	public boolean contains(int x, int y) {
		return this.upperLeft.getX() + width >= x && this.upperLeft.getX() <= x &&
				this.upperLeft.getY() + height >= y && this.upperLeft.getY() <= y;
	}
	
	public boolean contains(Point p) {
		return contains(p.getX(), p.getY());
	}
	
	@Override
	public String toString() {
		return "Upper left point: (" + this.upperLeft.getX() + ", " + this.upperLeft.getY()+ ")"
				+ " width = " + this.width + " height = " + this.height; 
	}
	
	@Override 
	public boolean equals(Object obj) {
		if(obj instanceof Rectangle) {
			Rectangle temp = (Rectangle) obj;
			if(this.upperLeft.equals(temp.upperLeft) && this.width == temp.width && this.height == temp.height) {
				return true;
			}
		}
		return false;
	}
	
	//Konstruktori
	public Rectangle() {
		
	}
	
	public Rectangle(Point upperLeft, int width, int height) {
		this.upperLeft = upperLeft;
		this.height = height;
		this.width = width;
	}
	
	public Rectangle(Point upperLeft, int width, int height, boolean selected) {
		this(upperLeft, width, height);
		this.selected = selected;
	}
	
	//Get i set metode
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public Point getUpperLeft() {
		return upperLeft;
	}
	public void setUpperLeft(Point upperLeft) {
		this.upperLeft = upperLeft;
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		
	}
	
}
