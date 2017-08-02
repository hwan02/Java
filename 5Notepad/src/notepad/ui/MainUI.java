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
				// ���� ����
				saveFile();
				

			}
		});
		open_item.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// ���� ����
				// �� �̻� ���ú����� �ƴϴ�
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
					e1.printStackTrace(); // ���������� �����ؼ� �������� debuging�Ҷ��� ���� ������
											// ���� ��������
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
		file_menu = new JMenu("����");
		edit_menu = new JMenu("����");
		new_item = new JMenuItem("���θ����");
		open_item = new JMenuItem("����");
		save_item = new JMenuItem("����");
		open_dialog = new FileDialog(MainUI.this, "����", FileDialog.LOAD);
		save_dialog = new FileDialog(MainUI.this, "����", FileDialog.SAVE);
		dialog = new JDialog(MainUI.this, "����");
		label = new JLabel("�����Ͻðڽ��ϱ�?");
		b1 = new JButton("���");
		b2 = new JButton("��");
		b3 = new JButton("�ƴϿ�");
		p = new JPanel();
		dialog.add(label); // ���ͷ� ���� �������̾ƿ� �� ���ϰ�
		dialog.add(p, "South"); // �빮��S�� �����ϴ� /
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
