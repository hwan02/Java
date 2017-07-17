package kr.ac.hufs;

public class VariableTest {
	int age = 20; 
	int $age = 20; 
	int 20age = 100; // 앞에 숫자가 먼저 올 수가 없다.
	int age20 = 100; 
	int a20 = 100;
	int korea_age = 33; 
	int int = 300; // 명칭을 적을 수 없다.
	int class = 300;
	
	String myName = "홍길동";
	String myName = "홍길동2";
	final String myName3 = "홍길동";
	final String NAVER_URL = "http://www.naver.com";
	
	
	public static void main(String[] args) {
		VariableTest vt = new VariableTest();
		vt.myName = "설현";
		vt.myName3 = ""; // myName3는 바꿀 수가 없다. 
		
	}

}
