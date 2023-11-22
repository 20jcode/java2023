package hw12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BounceFrame extends JFrame {

	private BallPanel ballPanel;
	public static final int DEFAULT_WIDTH = 500;
	public static final int DEFAULT_HEIGHT = 500;
	public BounceFrame() {
		setTitle("BounceThread");
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		ballPanel = new BallPanel();
		add(ballPanel, BorderLayout.CENTER);
		JPanel buttonPanel = new JPanel();
		add(buttonPanel, BorderLayout.SOUTH);
		addButton(buttonPanel, "Start", new ActionListener() {
			public void actionPerformed (ActionEvent event) {
				addBall();
			}
		});

		addButton(buttonPanel, "Close", new ActionListener() {
			public void actionPerformed(ActionEvent event) { System.exit(0); } });
	}

	private void addButton(Container container, String title, ActionListener listener){
		JButton button = new JButton(title);
		container.add(button);
		button.addActionListener(listener);
	}

	public void addBall() {
		Ball b = new Ball();
		ballPanel.add(b);
		Runnable r = new BallRunnable(b, ballPanel);
		Thread t = new Thread(r);
		t.start();
	}

}