package kr.ac.hufs;

public class VariableTest {
	int age = 20; 
	int $age = 20; 
	int 20age = 100; // �տ� ���ڰ� ���� �� ���� ����.
	int age20 = 100; 
	int a20 = 100;
	int korea_age = 33; 
	int int = 300; // ��Ī�� ���� �� ����.
	int class = 300;
	
	String myName = "ȫ�浿";
	String myName = "ȫ�浿2";
	final String myName3 = "ȫ�浿";
	final String NAVER_URL = "http://www.naver.com";
	
	
	public static void main(String[] args) {
		VariableTest vt = new VariableTest();
		vt.myName = "����";
		vt.myName3 = ""; // myName3�� �ٲ� ���� ����. 
		
	}

}
