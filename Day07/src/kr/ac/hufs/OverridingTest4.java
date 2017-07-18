package kr.ac.hufs;

public class OverridingTest4 {
	public static void main(String[] args) {
		new D();
	}
}

class C3 {
	
	void m() {
		System.out.println("c3¿« m()");
	}
}

class D extends C3 {
	D() {
		super();
		super.m();
	}

	void m() {
		System.out.println("d¿« m()");
	}
}
