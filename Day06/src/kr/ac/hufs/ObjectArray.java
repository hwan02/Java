package kr.ac.hufs;

public class ObjectArray {

	public static void main(String[] args) {
//		Member mb = new Member();
//		mb.setAll("ȫ�浿", 20);
		
		Member mb = new Member("ȫ�浿", 20);
		System.out.println("�̸�: " + mb.name);
		System.out.println("����: " + mb.age);
		
		// ��ü�迭 
		Member[] mbArr = new Member[3];
		mbArr[0] = new Member("����", 24);
		mbArr[1] = new Member("����", 23);
		mbArr[2] = new Member("����", 27);
		
		for(int i = 0; i < mbArr.length; i++) {
			System.out.println("�迭["+i+"]: " + mbArr[i].name + "[" + mbArr[i].age+"]" );
		}
	}
}

class Member {
	String name = "";
	int age = 0;

	Member() {

	}

	Member(String _name, int _age) {
		this.name = _name;
		this.age = _age;

	}

	void setAll(String _name, int _age) {
		this.name = _name;
		this.age = _age;
	}
}
