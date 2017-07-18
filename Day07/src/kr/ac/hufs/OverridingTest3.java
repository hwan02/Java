package kr.ac.hufs;

public class OverridingTest3 {
	public static void main(String[] args) {
		new A2();
	}
}

class A2 {
	String name;

	A2() {
		this("¥Î«—πŒ±π");
	}

	A2(String name) {
		this.name = name;
		new B(this).p();

	}

	void m() {
		System.out.println("m()");
	}

	class B {
		A2 a;

		B(A2 a) {
			this.a = a;
		}

		void p() {
			System.out.println("a.name:" + a.name);
			a.m();
		}
	}
}
