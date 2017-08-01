package my.ui;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;

public class Myframe extends Frame{
	@Override
	public void setBackground(Color bgColor){
		super.setBackground(bgColor);
		setTitle("MyShop");
	}
public Myframe(){
	setBackground(Color.GREEN);
	setLocation(300, 200);
	setSize(400, 500);
}
}
