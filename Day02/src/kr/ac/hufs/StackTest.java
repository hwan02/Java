package kr.ac.hufs;

public class StackTest {

	public static void main(String[] args) {
		st s = new st();
		s.firstStack();

	}

}

class st{
	
	void firstStack() {
		System.out.println("ù��° ���� ����");
		secondStack();
		System.out.println("ù��° ���� ��");
	}
	void secondStack() {
		System.out.println("�ι�° ���� ����");
		thirdStack();
		System.out.println("�ι�° ���� ��");
	}
	void thirdStack() {
		System.out.println("����° ���� ����");
		
		System.out.println("����° ���� ��");	
	}
}