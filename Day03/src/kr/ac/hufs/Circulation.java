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
	
	// 결합연산자
	String str1 = "한국";
	String str2 = "외국어";
	String str3 = "대학교";
	String str = str1 + str2 + str3;
	str = str + "\n" + "외국어 특성화 대학교";
	System.out.println("str= " + str);
	
	
	}
}
