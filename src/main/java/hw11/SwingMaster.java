package hw11;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingMaster {

	public static void main (String[] args) {
		JFrame test = new MyFrame();
		test.setSize(1000,100);
		test.setVisible(true);
	}
}

class MyFrame extends JFrame implements ActionListener {
	private final JPanel jPanel;

	public MyFrame(){
		jPanel = new MyjPanel();
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

	}

	private JButton setBtn(final String text){

		JButton btn = new JButton(text);
		if(!text.equals("Quit")){
			btn.addActionListener((ActionEvent e)->JOptionPane.showMessageDialog(this,text));
		} else {
			btn.addActionListener((ActionEvent e)->System.exit(0));
		}

		btn.setToolTipText(text+"입니당");

		return btn;
	}
}




