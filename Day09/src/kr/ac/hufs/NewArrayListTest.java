package kr.ac.hufs;

import java.util.ArrayList;

public class NewArrayListTest {
	public static void main(String[] args) {
		new ArrTest();
	}
}

class ArrTest {

	ArrTest() {
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("�ѱ�");
		arr.add("�ܱ���");
		arr.add("���б�");

		for (int i = 0; i < arr.size(); i++) {
			System.out.print(arr.get(i) + ",");

		}
		System.out.println("");
		arr.remove(0);
		for (int i = 0; i < arr.size(); i++) {
			System.out.print(arr.get(i) + ",");
		}
		System.out.println("");
		arr.add(1, "����");
		for (int i = 0; i < arr.size(); i++) {
			System.out.print(arr.get(i) + ",");
		}
		System.out.println("");
		// ����� 0�� �Ǿ������.
		arr.clear();
		for (int i = 0; i < arr.size(); i++) {
			System.out.print(arr.get(i) + ",");
		}
	}
}
