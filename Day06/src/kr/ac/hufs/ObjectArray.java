package kr.ac.hufs;

public class ObjectArray {

	public static void main(String[] args) {
//		Member mb = new Member();
//		mb.setAll("홍길동", 20);
		
		Member mb = new Member("홍길동", 20);
		System.out.println("이름: " + mb.name);
		System.out.println("나이: " + mb.age);
		
		// 객체배열 
		Member[] mbArr = new Member[3];
		mbArr[0] = new Member("설현", 24);
		mbArr[1] = new Member("쯔위", 23);
		mbArr[2] = new Member("나라", 27);
		
		for(int i = 0; i < mbArr.length; i++) {
			System.out.println("배열["+i+"]: " + mbArr[i].name + "[" + mbArr[i].age+"]" );
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
