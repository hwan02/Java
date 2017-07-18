package kr.ac.hufs;

public class AccessTest {
	
public static void main(String[] args) {
	void mm2() {
		B b = new B();
		b.z = 100;
		
		C c = new C ();
		c.x; // private가 붙어 있기에, 접근 불가
		// 우회적 접근은 메소드를 통해서 가능
		// getX(), setX();
		c.setX(80);
		C.getX();
	}
}
}
