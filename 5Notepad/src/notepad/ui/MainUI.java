package notepad.ui;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class MainUI extends JFrame {
	TextArea ta;
	JMenuBar mb;
	JMenu file_menu, edit_menu;
	JMenuItem new_item, open_item, save_item;
	FileDialog open_dialog, save_dialog;
	JDialog dialog;
	JLabel label;
	JButton b1, b2, b3;
	JPanel p;

	public MainUI() {
		initComponent();
		addListener();
	}

	private void addListener() {
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				saveFile();
				dialog.setVisible(false);
			}
		});
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				ta.setText(" ");
				dialog.setVisible(false);
			}
		});
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				dialog.setVisible(false);
			}
		});

		new_item.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(true);
			}
		});
		save_item.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 파일 저장
				saveFile();
				

			}
		});
		open_item.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 파일 열기
				// 더 이상 로컬변수가 아니다
				open_dialog.setVisible(true);

				String fileName = open_dialog.getDirectory() + open_dialog.getFile();
				try {
					FileReader fin = new FileReader(fileName);
					BufferedReader bin = new BufferedReader(fin); // decoration
																	// pattern
					String oneLine = "";
					ta.setText("");
					while ((oneLine = bin.readLine()) != null) {
						ta.append(oneLine + "\n");
					}
					bin.close();
					fin.close();
				} catch (Exception e1) {
					e1.printStackTrace(); // 에러사항을 추적해서 출력해줘라 debuging할때는 좋다 실행할
											// 때는 지워야함
				}
			}
		});
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	private void initComponent() {
		ta = new TextArea();
		mb = new JMenuBar();
		file_menu = new JMenu("파일");
		edit_menu = new JMenu("편집");
		new_item = new JMenuItem("새로만들기");
		open_item = new JMenuItem("열기");
		save_item = new JMenuItem("저장");
		open_dialog = new FileDialog(MainUI.this, "열기", FileDialog.LOAD);
		save_dialog = new FileDialog(MainUI.this, "저장", FileDialog.SAVE);
		dialog = new JDialog(MainUI.this, "정보");
		label = new JLabel("저장하시겠습니까?");
		b1 = new JButton("취소");
		b2 = new JButton("네");
		b3 = new JButton("아니요");
		p = new JPanel();
		dialog.add(label); // 센터로 간다 보더레이아웃 안 정하고
		dialog.add(p, "South"); // 대문자S로 시작하는 /
		// BorderLayout.SOUTH="South"
		p.add(b1);
		p.add(b2);
		p.add(b3);
		dialog.setBounds(800, 300, 300, 150);

		add(ta, BorderLayout.CENTER);
		setJMenuBar(mb);
		mb.add(file_menu);
		mb.add(edit_menu);

		file_menu.add(new_item);
		file_menu.add(open_item);
		file_menu.add(save_item);

		setBounds(750, 50, 400, 500);
		setVisible(true);
	}
	
private void saveFile(){
	
	save_dialog.setVisible(true);

	try {
		FileWriter fw = new FileWriter(save_dialog.getDirectory() + save_dialog.getFile());
		fw.write(ta.getText());
		fw.close();
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
}
}
