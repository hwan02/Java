package kr.ac.hufs;

public class ModifierTest {

	public static void main(String[] args) {

	}
}

class A {
	String aStr = "";
	int x = 0;
}

class B {
	int z = 0;

	void m1() {

	}
}

class C {
	private int x = 100;
	
	// 멤버변수 x를 우회적 접근
	int getX() {
		return this.x;
	}
	void setX(int _x) {
		this.x = _x;
	}
	void m2() {
		A a = new A();
		a.aStr = "난 C";
		
		new A().aStr = "난 바로 C";
	}
}

// public, default, protected, private 접근 제한자
// public: 패키지와 클래스 상관없이 누구나 접근
// default: 같은 패키지 내에서 누구나 접근
// protected: 같으 패키지이거나 상속관계까지 접근 허용
// private: 같은 클래스 내에서만 접근 허용