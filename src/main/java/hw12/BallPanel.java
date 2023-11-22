package hw12;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class BallPanel extends JPanel {

	private List<Ball> balls = new ArrayList<>();
	public void add(Ball b) {
		balls.add(b);
	}
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;

		for (Ball b : balls) {
			g2.fill(b.getShape());
		}

	}
}
