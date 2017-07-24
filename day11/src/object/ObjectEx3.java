package object;

// geeter & setter: 멤버변수 하나당 하나씩 값의 대입하는 setter
//			그 값을 리턴하는 getter
class Member {
	private String name;
	private int age;
	private double tall;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getTall() {
		return tall;
	}

	public void setTall(double tall) {
		this.tall = tall;
	}
}
	public class ObjectEx3 {

		public static void main(String[] args) {
			Member ob = new Member();
			ob.setName("문돌이");
			ob.setAge(25);
			ob.setTall(175.3);

			System.out.println("이름: " + ob.getName());
			System.out.println("나이: " + ob.getAge());
			System.out.println("신장: " + ob.getTall());

		}
	}

