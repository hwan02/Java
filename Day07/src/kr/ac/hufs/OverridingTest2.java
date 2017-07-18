package kr.ac.hufs;

public class OverridingTest2 {
	public static void main(String[] args) {
		I obj = new IChild(); // 형변환 
		obj.m(10, "");
	}
}

class I {
	public int m(int i, String str) {
		System.out.println("I의 m()");
		return 1;
	}
}

class IChild extends I {
	public int m(int j) {
		System.out.println("IChild의 m()");
		return -1;
	}
}
