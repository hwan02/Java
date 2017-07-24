package methodex;

// 클래스의 오브젝트는 인스턴스다. 오브젝트와 인스턴스를 묶어서 객체라고 한다. 
// 코드로 작성되어 있는 상태가 클래스이다. 
// 클래스의 인스턴스는 오브젝트다. 왠만하면 사용하지 마세요.

public class MethodEx {

	public static void view1() {
		System.out.println("static method");
	}
	
	public static void view2() {
		System.out.println("non - static method");
	}
	
	public static void main(String[] args) {
		// 클래스메서드(static method): 객체없이 호출 가능
		MethodEx.view1();
		// view1();  MehodEx 클래스메서드는 이름을 생략해도 된다. 자기자신의 메서드에 접근할 때는 클래스이름 MethodEx. 생략 가능
		
		// 인서턴스 메서드(instance method): 객체 생성 후 메서드 호출 가능
		// MethodEx ob = null; 이름만 만들어주는 것 
		MethodEx ob = new MethodEx(); // 객체를 실체화 시키는 것 메모리에 올리는 것
		//ob.view1(); //객체이름.~~
		ob.view2();
		
	}
}
