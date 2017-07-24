package inheritance;

//디폴트 생성자, 인자 2개 받는 생성자, toString() 추가
public class SuperTest {
	private String name;
	private String addr;


	public SuperTest() {
		super();
	}

	public SuperTest(String name, String addr) {
		super();
		this.name = name;
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "이름은 " + name + "사는 곳은 " + addr + "입니다.\n";
	}
}
