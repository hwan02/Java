package kr.ac.hufs;

public class InheritanceTest {

	public static void main(String[] args) {
		사람 s = new 사람();
		s.사랑한다();
	}
}

// 동물: 부모클래스, 기초클래스, 상위클래스, 수퍼클래스
// 사람: 자식클래스, 유도클래스, 하위클래스, 서브클래스
class 동물 {

	동물() {

	}

	void 먹는다() {

	}

	void 잔다() {

	}

	void 사랑한다() {

	}
}

class 사람 extends 동물 {
	사람() {

	}

	void 판단한다() {

	}

	class 슈퍼맨 extends 동물 {
		슈퍼맨() {

		}

		void 날아다닌다() {

		}
	}
	class 슈퍼맨2 extends 사람{
		슈퍼맨2(){
			
		}
		void 빔을쏜다() {
			
		}
}
/*
 상속은 왜 하는가? 
 1. 코드 중복 사용 방지, 코드 재활용성 
 2. 클래스 관리 용이하다는 장점
 
 1. extends라고 적고, 뒤에 부모클래스명을 적는다
 2. 모든 클래스는 기본적으로 Object를 상속함.
 
  
 */