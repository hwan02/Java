package shop.ui3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainUI {
	JFrame f;
	JPanel p, p2, p3, p4;
	JLabel la1, la2, la3, la4;
	JButton b1, b2, b3;

	public MainUI() {
		f = new JFrame("MySHOP3");
		p = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		p4 = new JPanel();
		la1 = new JLabel(new ImageIcon("c:\\0JAVA\\TEMP\\re.jpg"));
		la2 = new JLabel(new ImageIcon("c:\\0JAVA\\TEMP\\me.jpg"));
		la3 = new JLabel(new ImageIcon("c:\\0JAVA\\TEMP\\ka.jpg"));
		la4 = new JLabel();
		b1 = new JButton("상세정보");
		b2 = new JButton("상세정보");
		b3 = new JButton("상세정보");

		addListener();

		la4.setPreferredSize(new Dimension(400, 150));
		p3.setLayout(new BorderLayout());
		p3.add(p, BorderLayout.CENTER);
		p3.add(p4, BorderLayout.SOUTH);
		p.setLayout(new GridLayout(1, 3));
		p4.setLayout(new GridLayout(1, 3));

		p.add(la1);
		p.add(la2);
		p.add(la3);

		p4.add(b1);
		p4.add(b2);
		p4.add(b3);

		p2.add(la4);

		f.add(p3, BorderLayout.CENTER);
		f.add(p2, BorderLayout.SOUTH);

		p.setBackground(Color.green);
		p2.setBackground(Color.cyan);

		f.setBounds(750, 50, 600, 500);
		f.setVisible(true);
	}

	private void addListener() {
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				la4.setText("미즈노");
			}
		});
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				la4.setText("나이키");
			}
		});
		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				la4.setText("아디다스");
			}
		});
	}

	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		new MainUI();
	}
}
