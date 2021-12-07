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
	}

}
