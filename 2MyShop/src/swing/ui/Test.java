package swing.ui;

import java.awt.Container;

import javax.swing.*;

public class Test {

	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame f=new JFrame("MyShop2");
		ImageIcon icon = new ImageIcon("c:\\0JAVA\\temp\\tv.jpg");
		JLabel label = new JLabel();
		Container c=f.getContentPane();
		c.add(label);
		f.setSize(500, 400);
		f.setVisible(true);
	}
}
