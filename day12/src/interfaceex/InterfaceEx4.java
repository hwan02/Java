package interfaceex;

/* 클래스와 인터페이스를 이용한 성적 처리
 * 클래스명: User
 * -name:String
 * +User()
 * +User(name:String)
 * +toString():String
 * 
 * 인터페이스명:Score
 * +sol:int(초기값:20)
 * +getScore():int
 * 
 * 인터페이스:Print
 * +toString():String
 * [출력화면]
 * 이름: 홍길동
 * 점수: 60점
 */
class User {
	private String name;

	public User() {
	}

	public User(String name) {
		this.name = name;
	}

	// 해당클래스 안에 있는 멤버변수의 값을 가지고 오는 것?
	public String toString() {
		return "이름: " + name + "\n";
	}
}

// ----------------------------------------
interface Score {
	public int sol = 20; // 배점

	public int getScore(); // '맞은수*sol'을 리턴
}

// ----------------------------------------
interface Print {
	public String toString();
}

public class InterfaceEx4 extends User implements Score, Print {
	int s;
	public InterfaceEx4(String name, int s) {
		super(name);
		this.s = s;
	}
	@Override
	public int getScore() {
		return 0;
	}

	@Override
	public String toString() {
		return super.toString() + "점수: " + getScore() + "점\n";
	}

	/*
	 * public InterfaceEx4(String string, int i) {
	 * 
	 * @Override public int i { return 0; }
	 * 
	 * @Override public String toString() { return null; }
	 */

	public static void main(String[] args) {
		InterfaceEx4 ob = new InterfaceEx4("홍길동", 3);
		System.out.println(ob.toString());
	}
}
