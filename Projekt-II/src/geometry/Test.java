package geometry;

public class Test {

	public static void main(String[] args) {
		Point p1 = new Point();
		p1.x = 20;
		p1.y = 30;
		p1.selected = false;
		System.out.println("X je: "+p1.x + " Y je: "+ p1.y + " Selected je: "+ p1.selected);
		Point p2 = new Point();
		p2.x = 20;
		p2.y = 30;
		p2.selected = false;
		System.out.println("X je: "+p2.x + " Y je: "+ p2.y + " Selected je: "+ p2.selected);
		System.out.println(p1 == p2);
		int x =  20;
		int y = 20;
		System.out.println(x == y);
	}

}
