package constructor;

public class ConstructorEx2 {

	public ConstructorEx2() {
		this("가나다", 10); //2
		System.out.println("default constructor"); // 6
		}

	public ConstructorEx2(String str) {
		System.out.println(str + "constructor"); // 4
	}

	public ConstructorEx2(String str, int n) {
		this(str); // 3
		System.out.println(str + "" + n + "constructor"); // 5 
	}

	public static void main(String[] args) {
		new ConstructorEx2(); // 1 
	}
}

/*
 * 생성자가 여러개일 때 다른 생성자 호출 가능 이 때 this사용: 객체가 자기 자신을 참조할 때 사용하는 this는 생성자를 호출하기 위한
 * this()의 형태로 사용 this()를 통한 생성자 호출은 생성자의 맨 첫 줄에서 가능, 생성자에서만 가능 무조건 제일 첫 줄에서
 * 실행해야 한다.
 */
/*
 * public class ConstructorEx2 {
 * 
 * public ConstructorEx2() { System.out.println("default constructor"); // 4 }
 * 
 * public ConstructorEx2(String str) { this(); // 3 System.out.println(str +
 * "constructor"); // 5 }
 * 
 * public ConstructorEx2(String str, int n) { this(str); // 2
 * System.out.println(str + "" + n + "constructor"); // 6 }
 * 
 * public static void main(String[] args) { new ConstructorEx2("가나다", 10); // 1
 * } }
 */