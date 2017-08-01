package shop.ui;

import java.awt.*;
import java.awt.event.*;

public class MainUI {
	TextArea ta;
	TextField tf;
	private void onCreate() {
		Frame f = new Frame("DukeShop");
		ta = new TextArea();
		tf = new TextField(30);
		Button b = new Button("����");
		Panel p = new Panel();
		tf.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ta.append(tf.getText() + "\n");
				tf.setText("");
			}
		});
		ta.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseEntered(MouseEvent e) {
				ta.append("���콺 ����\n");
			}
			@Override
			public void mouseExited(MouseEvent e) {
				ta.append("���콺 ����\n");
			}
			});
		f.addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		// handler.setTextArea(ta);
		// handler.setTextField(tf);
		b.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e) {
					// ��ư�� ������ �� �ڵ� ȣ���
					ta.append(tf.getText() + "\n");
					tf.setText("");
				}
			});
		f.add(ta, BorderLayout.CENTER);
		f.add(p, BorderLayout.SOUTH);
		p.add(tf);
		p.add(b);
		f.setBounds(900, 100, 400, 500);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		MainUI ui= new MainUI();
		ui.onCreate();
	}
}	
