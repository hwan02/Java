package staticex;
//인스턴스 변수와 관련된 작업을 하는 메서드는 인스턴스 메서드(static이 붙지 않은 메서드)
//static변수와 관련된 작업을 하는 메서드는 클래스메서드(static이 붙은 메서드)
class Test{
	int x;
	int y;
	static int z;
	
	static {
		System.out.println("static 초기화 영역");
	}
	// int z 는 _z 또는 z1으로 준다
	// 생성자의 매개변수를 다르게 사용하지 않도록 한다. x, y로 쓴다 이름을 똑같이 맞춰준다.
	public Test(int x, int y, int _z) {
		this.x=x;
		this.y=y;
		z=_z;
		System.out.println("객체 초기화 영역");
	}
	// static은 글씨가 눕는다
	public void view() {
		System.out.println(x +" "+ y +" "+ z);
	}
}

public class StaticEx1 {
// 3이 들어가있던 자리를 6이 덮어써서 6이 나온다. static 변수의 의미 생각
	public static void main(String[] args) {
		Test ob1 = new Test(1, 2, 3);
		Test ob2 = new Test(4, 5, 6);
		ob1.view();
		ob2.view();
		
	}

}
