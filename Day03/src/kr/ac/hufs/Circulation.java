package kr.ac.hufs;

public class Circulation {
public static void main(String[] args) {
	int a = 1;
	System.out.println("a = " + a);
	a = a + 1;
	a = a + 30;
	System.out.println("a= " + a);
	a = a%7;
	System.out.println("a= " + a);
	
	// ���տ�����
	String str1 = "�ѱ�";
	String str2 = "�ܱ���";
	String str3 = "���б�";
	String str = str1 + str2 + str3;
	str = str + "\n" + "�ܱ��� Ư��ȭ ���б�";
	System.out.println("str= " + str);
	
	
	}
}
