package object;

// geeter & setter: ������� �ϳ��� �ϳ��� ���� �����ϴ� setter
//			�� ���� �����ϴ� getter
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
			ob.setName("������");
			ob.setAge(25);
			ob.setTall(175.3);

			System.out.println("�̸�: " + ob.getName());
			System.out.println("����: " + ob.getAge());
			System.out.println("����: " + ob.getTall());

		}
	}

