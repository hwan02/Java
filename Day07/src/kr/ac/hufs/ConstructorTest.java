package kr.ac.hufs;

public class ConstructorTest {

	public static void main(String[] args) {
		Circle c = new Circle(5);
		
		System.out.println("둘레: " + c.getCircleRound());
		System.out.println("넓이:" + c.getCircleArea());
		
		Circle cc = new Circle();
		System.out.println("둘레: " + c.getCircleRound());
		System.out.println("넓이:" + c.getCircleArea());
	}
}

class Circle{
	final float PI = 3.1415f;
	int r = 0;
	Circle(int _r){
		this.r = _r;
	}
	/* this()
	   1. this() 생성자에서만 사용 가능
	   2. this() 같은 클래스에서 다른 생성자를 호출할 때 사용
	   3. this() 생성자의 첫 문장에서 적을 것.
	 */
	 
	/* 생성자 
	1. 생성자명은 클래스명과 동일
	2. 리턴타입(void, int, String)이 붙지 않음.
	3. 생성자의 호출은 클래스에서 인스턴스 생성시에 자동호출
	4. 생성자가 하나도 없다면, JVM이 빈 생성자를 만들어줌 
	5. static, final 붙일 수 없음
	생성자는 반드시 있어야하는가? 아님
	
	생성자 만드는 목적은?
	초기화와 연관, 클래소브로부터 인스턴스 생성시 초기값을 설정하는 목적 
	
	생성자는 여러개 만들 수 있나? 그렇다.
	값은 이름의 생성자를 중복해서 정의한다는 의미. 단, 매개변수의 개수나 타입이 서로 달라야한다.
	= > 생성자 오버로딩 or 생성자 중복
	JVM이 자동으로 빈 생성자를 만들어 주는 경우는 생성자가 하나도 없을 때에만 해당. 
	
	 this: 현재 객체 자기 자신 , 현재 주소값을 가지고 있음
 	 this(), this(값): 현재 객체의 생성자
	void setR(int _r) {
		this.r = _r;
	}
	Circle(){
	this.r = 1;
	*/
	float getCircleRound() {
		
		return 2*PI*r;
	}
	float getCircleArea() {
		return PI*r*r;
	}
}