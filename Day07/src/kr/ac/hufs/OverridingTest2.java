package kr.ac.hufs;

public class OverridingTest2 {
	public static void main(String[] args) {
		I obj = new IChild(); // ����ȯ 
		obj.m(10, "");
	}
}

class I {
	public int m(int i, String str) {
		System.out.println("I�� m()");
		return 1;
	}
}

class IChild extends I {
	public int m(int j) {
		System.out.println("IChild�� m()");
		return -1;
	}
}
