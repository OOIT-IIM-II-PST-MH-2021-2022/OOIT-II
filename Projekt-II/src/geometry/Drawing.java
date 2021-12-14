package geometry;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Drawing extends JPanel {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		Drawing panel = new Drawing();
		frame.add(panel);
		frame.setSize(1600,1200);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);

	}
	
	@Override
	public void paint(Graphics g) {
		Point p1 = new Point(800,500);
		p1.draw(g);
		Line l1 = new Line(p1, new Point(900,600));
		l1.draw(g);
		Circle c1 = new Circle(p1,70);
		c1.draw(g);
		Rectangle r1 = new Rectangle(new Point(700, 300) , 50,50);
		r1.draw(g);
		int innerRadius = (int)(r1.getHeight()*Math.sqrt(2))/2;
		/*Donut d1 = new Donut(new Point(r1.getUpperLeft().getX()+innerRadius,r1.getUpperLeft().getY()+innerRadius), 80, innerRadius);
		d1.draw(g);*/
		
	}

}
