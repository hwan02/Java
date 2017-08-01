package my.ui;

import java.awt.Color;
import java.awt.Frame;

public class MyFrame2 extends Frame{
	@Override
	public void setBackground(Color bgColor){
		super.setBackground(bgColor);
		setTitle("MyShop");
	}
	
	public MyFrame2(){
		setBackground(Color.green);
		setLocation(300, 200);
		setSize(400, 500);
		
	}
}
