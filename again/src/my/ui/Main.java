package my.ui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class Main {

	public static void main(String [] args) {
		MyFrame2 f=new MyFrame2();
		Button b1=new Button("Àü¼Û");
		TextArea ta = new TextArea();
		TextField tf = new TextField(30);
		
		Panel p = new Panel();
		
		f.add(ta, BorderLayout.CENTER);
		
		f.add(p, BorderLayout.SOUTH);
		p.add(tf);
		p.add(b1);
		
		f.setVisible(true);
		
	}
}
