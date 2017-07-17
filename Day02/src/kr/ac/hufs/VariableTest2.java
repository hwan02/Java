package kr.ac.hufs;

public class VariableTest2 {

	public static void main(String[] args) {
		VariableT vt = new VariableT();
		vt.m1();
	}

}

class VariableT {

	int age = 20; // 전역변수

	void m1() {
		int a = 50;
		System.out.println("지역변수");
		
	}

	void m2() {
		// 전역변수 age 출력
		System.out.println("age=" + age);

		// m1의 지역변수 a 출력
		// System.out.println("a=" + a); // 접근 안 됨
		System.out.println("a=" + m3());

	}
	int m3() {
		int a = 50;
		System.out.println("지역변수");
		return a;
		
	}
}