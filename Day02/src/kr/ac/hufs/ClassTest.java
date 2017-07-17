package kr.ac.hufs; // 패키지명

public class ClassTest // 클래스명: ClassTest 시작과 끝 {} 
{ 

	public static void main(String[] args) // public static void main 시작 함수, 반드시 하나만 있어야 함 
	{
		// String[] args 매개변수, 파라미터, 지역변수의 파라미터
		Hufs hf = new Hufs();
		hf.setAge(24);
		

	}

}

class Hufs
{
	int age = 20; // int 변수에 대한 타입, age 변수명, 20 변수값(리터럴) 
	              // 전역 변수, 클래스 내에서 자원의 공유
	
	static String name = "설현"; 
	//메소드(함수)
	void setAge(int _age) { // void: 메소드 실행결과 리턴 값이 없음, void 의미: 텅 빈
		                    // setAge: 메소드 명
							// int _age: int 매개변수 타입, _age 매개변수 명
							//               이 메소드에 값을 전달하는 것이 목적
		this.age = _age; 
		// this.age: hufs의 전역 변수 age를 가리킴
	}
	
	int getAge() { // int 함수 실행 결과 리턴할 값의 타입
		int age = this.age; // 지역변수: 현재 메소드 내에서만 유효
							// 당연히 지역변수가 전역 변수보다 적용
		return age;
	}
}