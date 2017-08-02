package notepad;

import javax.swing.JFrame;

import notepad.ui.MainUI;

public class Main {

	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		new MainUI().setVisible(true);
	}

}
