package geometry;

public class Test {

	public static void main(String[] args) {
		Point p1 = new Point();
		p1.setX(10);
		p1.setY(30);
		Point p2 = new Point();
		p2.setX(20);
		p2.setY(30);
		System.out.println(p1 == p2);
		int x =  20;
		int y = 20;
		System.out.println(x == y);
		System.out.println(p1.distance(p2));
		p1.getX();
		Point p3 = new Point();
		System.out.println(p3.getX());
		Line l1 = new Line();
		l1.length();
	}

}
