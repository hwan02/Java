package kr.ac.hufs;

public class StackTest {

	public static void main(String[] args) {
		st s = new st();
		s.firstStack();

	}

}

class st{
	
	void firstStack() {
		System.out.println("첫번째 스택 시작");
		secondStack();
		System.out.println("첫번째 스택 끝");
	}
	void secondStack() {
		System.out.println("두번째 스택 시작");
		thirdStack();
		System.out.println("두번째 스택 끝");
	}
	void thirdStack() {
		System.out.println("세번째 스택 시작");
		
		System.out.println("세번째 스택 끝");	
	}
}