package kr.ac.hufs;

public class OperatorTesrt4 {
public static void main(String[] args) {
	String a = "�ѱ�";
	String b = "�ѱ�";
	if(a == b) {
		System.out.println("���ƿ�");
		
	} else {
		System.out.println("�޶��");
	}
	
	String c = new String("�ѱ�");
	String d = new String("�ѱ�");
	// �ּ�(reference) ��
	if(c == d) {
		System.out.println("���ƿ�");
		
	} else {
		System.out.println("�޶��");
	}
	// �����
	if(c.equals(d)) {
		System.out.println("���ƿ�");
		
	} else {
		System.out.println("�޶��");
	}
}
}
