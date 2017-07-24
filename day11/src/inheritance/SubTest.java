package inheritance;

//디폴트 생성자, 인자 4개 받는 생성자, toString() 추가
public class SubTest extends SuperTest{
	private int age;
	private double score;
	
	public SubTest() {
		super();
	}

	public SubTest(String name, String addr, int age, double score) {
		super(name, addr);
		this.age = age;
		this.score = score;
	}
	

	@Override
	public String toString() {
		return super.toString()+"나이는 " + age + "세 이고 점수는 " + score + "점입니다.";
	}
	public static void main(String[] args) {
		SuperTest ob1 = new SuperTest("조현영", "대구");
		System.out.println(ob1.toString());
		
		SubTest ob2 = new SubTest("김종인", "순천", 25, 78.5);
		System.out.println(ob2.toString());
				
	}
}
