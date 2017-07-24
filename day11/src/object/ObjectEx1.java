package object;

class Person {
	public String name; // �������(filed)
	public int age;
	public float score;

	public void setPerson(String name, int age, float score) { // �޼���
		this.name = name;
		this.age = age;
		this.score = score;
	}

	public void viewPerson() {
		System.out.println("�̸�: " + name);
		System.out.println("����: " + age);
		System.out.println("����: " + score);

	}
}

public class ObjectEx1 {
	// ������ �� �������� �����Ѵ�. ��Ʈ�� ����Ʈ�ϱ� �ܺο��� �����ϱ� ������ public�� ����ؾ� �Ѵ�.
	public static void main(String[] args) {
		Person ps = new Person(); // new Person: ������ �������� �޸𸮸� �Ҵ��ϴ� ����
		ps.setPerson("������", 40, 73.5f); // ��ü: �ʵ�� �޼����� ����
		ps.viewPerson();
		// hashCode() reference �ּ� ����, ��ü�� �����ϱ� ���� ������ �������� ����ϴ� �޼���
		System.out.println(ps.hashCode());
		
		ps = new Person();
		ps.setPerson("���μ�", 40, 90.5f);
		ps.viewPerson();
		System.out.println(ps.hashCode());
	}
}
