package hw12;

import javax.swing.*;

public class BallRunnable implements Runnable {
	private Ball ball;
	private JPanel ballPanel;
	public static final int STEPS = 10000;
	public static final int DELAY = 3;
	public BallRunnable(Ball aBall, JPanel ballPanel) {
		ball = aBall;
		this.ballPanel = ballPanel;
	}
	public void run() {

		try {
			for (int i = 1; i <= STEPS; i++) {
				ball.move(ballPanel.getBounds());
				ballPanel.paint(ballPanel.getGraphics());
				Thread.sleep(DELAY);
				}
			} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}


}