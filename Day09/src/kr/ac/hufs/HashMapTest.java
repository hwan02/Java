package kr.ac.hufs;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapTest {

	public static void main(String[] args) {
		new HashMapSample();
	}
}

class HashMapSample {
	HashMap<String, String> hm = new HashMap<>();

	HashMapSample() {
		hm.put("s", "�Ｚ");
		hm.put("l", "LG");
		hm.put("a", "����");
		hm.put("g", "����");
		// Hashmap������ �Է½� key:value ������ ���ϰ�,
		// �޼ҵ� ���� put(k,v) ���·� �Է���
		// clear(): Hashmap ��ü ��� ����
		// size(): ũ��
		// isEmpty(): ����ִ��� ���� true, false�� ����

		Scanner scan = new Scanner(System.in);

		//hm.clear();
		//System.out.println("ũ��>> " + hm.size());
		
		for (;;) {
			System.out.print("Ű>> ");
			String key = scan.nextLine().trim();
			if(key.equals("����")) {
				System.out.println("�����մϴ�.");
				break;
			}else {
				showHashMap(key);
			}
		}
		scan.close();
	}

	void showHashMap(String _key) {
		String value = hm.get(_key);
		if (value == null) {
			System.out.println("ã���� ���� �����ϴ�.");
		} else {
			System.out.println("��>> " + hm.get(_key));
		}

	}
}