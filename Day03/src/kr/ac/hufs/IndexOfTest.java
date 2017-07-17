package kr.ac.hufs;

public class IndexOfTest {

	public static void main(String[] args) {
		String s = "Hello";
		int idx1= s.indexOf("o");
		System.out.println("o의 위치: " + idx1);
		
		int idx2= s.indexOf("l");
		System.out.println("l의 위치: " + idx2);
		
		int idx3= s.lastIndexOf("l");
		System.out.println("l의 뒤에서 위치: " + idx3);
		
		int idx4= s.indexOf("o", 3);
		System.out.println("o의 뒤에서 위치: " + idx4);
		
		String g = "Hello world";
		int idx5= g.indexOf("o", 6);
		System.out.println("o의  위치: " + idx5);
		
		int idx6= g.indexOf("l", g.indexOf("l")+2);
		System.out.println("l의 뒤에서 위치: " + idx6);
		
		String urlGet = "www.google.com/m?client=ms-android";
				
				if(s.indexOf("android") != -1) {
					System.out.println("안드로이드 단말기에 접속하셨습니다.");
				} else {
					System.out.println("안드로이드 이외 단말기에 접속하셨습니다.");
				}
	}
}
