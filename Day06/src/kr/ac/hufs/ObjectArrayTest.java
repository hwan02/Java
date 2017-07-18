package kr.ac.hufs;

import java.util.Scanner;

public class ObjectArrayTest {
	public static void main(String[] args) {

		new Object2();
		}
	}
}

class Object2 {
	final String 20 = "20";

	String[] m1 = {"모모", 20, "트와이스"};
	String[] m2 = {"아이린", 26, "레드벨벳"};
	String[] m3 = {"손나은", 23, "에이핑크"};
	String[] m4 = {"나라", 26, "헬로비너스"};
	String[] m5 = {"소진", 31, "걸스데이"};
	for (int i = 0; i < mOArr.length; i++) {
		System.out.println(
				"배열[" + i + "]: " + mOArr[i].name + "[" + mOArr[i].age + "]" + "소속사: " + mOArr[i].ecompany);
	String name = "";
	int age = 0;
	String ecompany = "";
	String total = "";

	Object2() {
		Scanner scan = new Scanner(System.in);
		System.out.println("자신이 좋아하는 아이돌 이름을 검색해보세요.");
		String total = scan.nextLine();
		for(int i = 0; i < Object2.this.total; i++) {
			
		}
	

	}

	Object2(String _name, int _age, String _ecompany) {
		this.name = _name;
		this.age = _age;
		this.ecompany = _ecompany;

	}

	void setAll(String _name, int _age, String _ecompany) {
		this.name = _name;
		this.age = _age;
		this.ecompany = _ecompany;
	}
}
