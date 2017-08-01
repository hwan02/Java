package shop.ui2;

import java.awt.*;
import java.awt.event.*;

public class MainUI {
	Frame f;
	TextArea ta;
	TextField tf;
	Button b;
	Panel p;

	public MainUI() {
		f = new Frame("MySHOP2");
		ta = new TextArea();
		tf = new TextField(30);
		b = new Button("Àü¼Û");
		p = new Panel();

		addListner();
		addComponent();
		f.setBounds(750, 70, 400, 500);
		f.setVisible(true);
	}

	private void addListner() {
		tf.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ta.append(tf.getText() + "\n");
				tf.setText("");
			}
		});
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ta.append(tf.getText() + "\n");
				tf.setText("");
			}
		});
	f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	private void addComponent() {
		f.add(ta, BorderLayout.CENTER);
		f.add(p, BorderLayout.SOUTH);
		p.add(tf);
		p.add(b);
	}

	public static void main(String[] args) {
		new MainUI();
	}

}
