package geometry;

public class Test {

	public static void main(String[] args) {
		
		Point p1 = new Point();
		System.out.println(p1.getX()+ ", " + p1.getY() + ", "+ p1.isSelected());
		Point p2 = new Point();
		
		System.out.println("Vrednost promenljive x objekta na koji p1 referencira je: " + p1.getX());
		System.out.println("Vrednost reference na objekat p1 je : " + p1);
		
		p1.setX(10);
		p1.setY(30);
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
		System.out.println(l1.getStartPoint() + ", " + l1.getEndPoint() + ", " + l1.isSelected());
		
		l1.setStartPoint(p1);
		l1.setEndPoint(p2);
		System.out.println(l1.getStartPoint() + ", " + l1.getEndPoint() + ", " + l1.isSelected());
		Rectangle r1 = new Rectangle();
		System.out.println(p1);
		System.out.println(l1);
	}

}
