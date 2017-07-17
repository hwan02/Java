package kr.ac.hufs;

public class OperatorTesrt4 {
public static void main(String[] args) {
	String a = "한국";
	String b = "한국";
	if(a == b) {
		System.out.println("같아요");
		
	} else {
		System.out.println("달라요");
	}
	
	String c = new String("한국");
	String d = new String("한국");
	// 주소(reference) 비교
	if(c == d) {
		System.out.println("같아요");
		
	} else {
		System.out.println("달라요");
	}
	// 내용비교
	if(c.equals(d)) {
		System.out.println("같아요");
		
	} else {
		System.out.println("달라요");
	}
}
}
