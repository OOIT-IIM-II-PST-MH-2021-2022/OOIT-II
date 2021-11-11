package geometry;

public class Rectangle {

	private int width;
	private int height;
	private Point upperLeft;
	private boolean selected;
	
	public int area() {
		return width*height;
	}
	
	public int circumference() {
		return 2*width + 2*height;
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
	
	public boolean isSelected() {
		return selected;
	}
	
	public void setSelected(boolean selected) {
		this.selected =  selected;
	}
}
