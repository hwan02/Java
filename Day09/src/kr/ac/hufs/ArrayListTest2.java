package kr.ac.hufs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListTest2 {
	public static void main(String[] args) {
		new SearchWords();
	}
}

class SearchWords {
	ArrayList<String> wordsArr = new ArrayList<String>();
	Scanner scan = new Scanner(System.in);

	SearchWords() {
		System.out.println("�ܾ��忡 ������ �ܾ �Է��ϼ���.>>");
		String inputStr = scan.nextLine().trim();
		String[] arrStr = inputStr.split(",");

		for (int i = 0; i < arrStr.length; i++) {
			wordsArr.add(arrStr[i]);
		}
		//showArr(wordsArr);
		getArrIndexValue(wordsArr);
		showArr2(wordsArr);
	}

	void showArr(ArrayList<String> _arr) {
		for (int i = 0; i < _arr.size(); i++) {
			System.out.print(_arr.get(i) + "");
		}
	}
	void showArr2(ArrayList<String> _arr) {
		Iterator<String> it = _arr.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+ "");
		}
		}
	void getArrIndexValue(ArrayList<String> _arr) {
		for(;;) {
			System.out.println("ã���� �ε��� >> ");
			int index = Integer.parseInt(scan.nextLine().trim());
			if(index == -1) {
				System.out.println("�����մϴ�.");
				break;
			}
			System.out.println(" �� >>" + _arr.get(index));
		}
	}
}