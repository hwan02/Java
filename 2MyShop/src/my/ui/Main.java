package my.ui;

import java.awt.*;

public class Main {
	public static void main(String [] args) {
	 
	 // new ���̵� ���  ���´�
	 Myframe f=new Myframe();
	 Button b1 = new Button("����");
	 TextArea ta = new TextArea();
	 TextField tf= new TextField(40);
	 
	 Panel p = new Panel();
	 
	 f.add(ta, BorderLayout.CENTER);
	 
	 f.add(p, BorderLayout.SOUTH);
	 p.add(tf);
	 p.add(b1);
	 
	 f.setVisible(true);
	 
}
}
