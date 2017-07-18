package kr.ac.hufs;

public class OverridingTest {

	static void Paint(Shape s) {
		s.draw();
	}
	public static void main(String[] args) {
		Shape s = new Shape();
		s.draw();
		
		Line l = new Line();
		l.draw();
		
		
		new Rect().draw(); // 정적 바인딩 한 번 힙에 올라가자마자 스택영역에 가서 실행하고 내려가는 것 
		Rect r = new Rect(); // 동적 바인딩 
		r.draw();
		
		System.out.println("**************");
		Paint(new Shape());
		Paint(new Line());
		Paint(new Rect());
		Paint(new Circle2());
		
	}
}

class Shape{
	void draw() {
		System.out.println("shape");
	}
}

class Line extends Shape{
	/*void draw() {
		System.out.println("shape");
	}*/
	void draw() {
		System.out.println("Line");
	}
}
// 오버라이딩
// 부모 클래스에서 정의된 메소드를 자식 클래스에서 재정의하는 것
// 이 경우 부모 클래스에서 정의된 메소드는 무력화 됨.
class Rect extends Shape{
	void draw() {
		System.out.println("Rect");
	}
}
class Circle2 extends Shape{
	void draw() {
		System.out.println("Circle2");
	}
}
/* 오버로딩
 1. 부모클래스 or 자식클래스에서 동일한 이름의 메소드를 중복 작성
 2. 동일한 클래스에서나 상속관계
 3. 여러개의 메소드를 중복작성하여 사용시에 편리성
 4. 메소드(생성자) 명이 동일 && 매개변수의 개수나 타입이 달라야함
 5. 정적바인딩: 컴파일 시점에 중복된 메소드 중에서 호출 여부가 갈림 
 
 오버 라이딩
 1. 덮어씀 자식 클래스에서 부모 클래스의 메소드를 동일한 이름으로 재작성하여 덮어씀.
 2. 상속 관계
 3. 부모클래스의 메소드를 자식클래스의 메소드로 재정의하여 사용
 4. 부모클래스의 메소드와 매개변수 및 리턴타입이 동일.
 5. 동적 바인딩: 런타임(실행) 시점에 호출
*/