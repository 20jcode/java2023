package hw11;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingMaster {

	public static void main (String[] args) {
		JFrame test = new MyFrame();
		test.setSize(700,700);

		test.setVisible(true);

	}
}

class MyFrame extends JFrame implements ActionListener {
	private JPanel jPanel = new MyjPanel();

	public MyFrame(){
		setSize(600,600);
		add(jPanel);
		pack();
	}

	@Override
	public void actionPerformed (ActionEvent e) {
		String cmd = e.getActionCommand();

	}
}
class MyjPanel extends JPanel{
	private JButton btnAdd;
	private JButton btnRemoveFirst;
	private JButton btnRemoveLast;
	private JButton btnRemoveAll;
	private JButton btnQuit;

	public MyjPanel(){
		btnAdd = setBtn("Add");
		btnRemoveAll = setBtn("RemoveAll");
		btnRemoveFirst = setBtn("RemoveFirst");
		btnRemoveLast = setBtn("RemoveLast");
		btnQuit = setBtn("Quit");
		add(btnAdd);
		add(btnRemoveFirst);
		add(btnRemoveLast);
		add(btnRemoveAll);
		add(btnQuit);

		btnAdd.addActionListener((ActionEvent e)->JOptionPane.showMessageDialog(this,"Add"));
		btnRemoveAll.addActionListener((ActionEvent e)->JOptionPane.showMessageDialog(this,"RemoveAll"));
		btnRemoveFirst.addActionListener((ActionEvent e)->JOptionPane.showMessageDialog(this,"RemoveFirst"));
		btnRemoveLast.addActionListener((ActionEvent e)->JOptionPane.showMessageDialog(this,"RemoveLast"));
		btnQuit.addActionListener((ActionEvent e)->System.exit(0));
	}

	private JButton setBtn(String text){

		JButton btn = new JButton(text);
		btn.setToolTipText(text);

		return btn;
	}
}




