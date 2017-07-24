package object;

class Person {
	public String name; // 멤버변수(filed)
	public int age;
	public float score;

	public void setPerson(String name, int age, float score) { // 메서드
		this.name = name;
		this.age = age;
		this.score = score;
	}

	public void viewPerson() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("점수: " + score);

	}
}

public class ObjectEx1 {
	// 시작할 때 메인으로 시작한다. 엔트리 포인트니까 외부에서 접근하기 때문에 public을 사용해야 한다.
	public static void main(String[] args) {
		Person ps = new Person(); // new Person: 실제로 힙영역에 메모리를 할당하는 역할
		ps.setPerson("소지섭", 40, 73.5f); // 객체: 필드와 메서드의 조합
		ps.viewPerson();
		// hashCode() reference 주소 리턴, 객체를 구분하기 위한 고유의 정수값을 출력하는 메서드
		System.out.println(ps.hashCode());
		
		ps = new Person();
		ps.setPerson("조인성", 40, 90.5f);
		ps.viewPerson();
		System.out.println(ps.hashCode());
	}
}
