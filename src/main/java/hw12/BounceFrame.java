package hw12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BounceFrame extends JFrame {

	private BallPanel ballPanel;
	public static final int DEFAULT_WIDTH = 500;
	public static final int DEFAULT_HEIGHT = 500;

	private double ballSpeed = 1;
	public BounceFrame() {
		setTitle("BounceThread");
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		ballPanel = new BallPanel();
		add(ballPanel, BorderLayout.CENTER);
		JPanel buttonPanel = new JPanel();
		add(buttonPanel, BorderLayout.SOUTH);

		addButton(buttonPanel, "Add1", new ActionListener() {
			public void actionPerformed (ActionEvent event) {
				addBall();
			}
		});

		addButton(buttonPanel, "Add2", new ActionListener() {
			@Override
			public void actionPerformed (ActionEvent e) {
				try {
					addBall();
					Thread.sleep(100);
					addBall();
				} catch (Exception ex){}
			}
		});

		addButton(buttonPanel, "Close", new ActionListener() {
			public void actionPerformed(ActionEvent event) { System.exit(0); } });

		//Menu set
		JMenuBar bar = new JMenuBar();
		JMenu speedMenu = new JMenu("Speed");
		JMenuItem speedUpBtn = new JMenuItem("SpeedUp");
		JMenuItem speedDownBtn = new JMenuItem("SpeedDown");

		speedUpBtn.addActionListener((ActionEvent e)->{
			speedUp();
		});

		speedDownBtn.addActionListener((ActionEvent e)->{
			speedDown();
		});
		bar.add(speedMenu);
		speedMenu.add(speedUpBtn);
		speedMenu.add(speedDownBtn);
		setJMenuBar(bar);
	}

	private void addButton(Container container, String title, ActionListener listener){
		JButton button = new JButton(title);
		container.add(button);
		button.addActionListener(listener);
	}

	public void addBall() {
		Ball b = new Ball();
		b.setSpeed(ballSpeed);
		ballPanel.add(b);
		Runnable r = new BallRunnable(b, ballPanel);
		Thread t = new Thread(r);
		t.start();
	}

	private void speedUp(){
		ballSpeed = ballSpeed*2;
	}

	private void speedDown(){
		ballSpeed = ballSpeed/2;
	}

}