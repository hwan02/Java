package kr.ac.hufs;

public class IndexOfTest {

	public static void main(String[] args) {
		String s = "Hello";
		int idx1= s.indexOf("o");
		System.out.println("o�� ��ġ: " + idx1);
		
		int idx2= s.indexOf("l");
		System.out.println("l�� ��ġ: " + idx2);
		
		int idx3= s.lastIndexOf("l");
		System.out.println("l�� �ڿ��� ��ġ: " + idx3);
		
		int idx4= s.indexOf("o", 3);
		System.out.println("o�� �ڿ��� ��ġ: " + idx4);
		
		String g = "Hello world";
		int idx5= g.indexOf("o", 6);
		System.out.println("o��  ��ġ: " + idx5);
		
		int idx6= g.indexOf("l", g.indexOf("l")+2);
		System.out.println("l�� �ڿ��� ��ġ: " + idx6);
		
		String urlGet = "www.google.com/m?client=ms-android";
				
				if(s.indexOf("android") != -1) {
					System.out.println("�ȵ���̵� �ܸ��⿡ �����ϼ̽��ϴ�.");
				} else {
					System.out.println("�ȵ���̵� �̿� �ܸ��⿡ �����ϼ̽��ϴ�.");
				}
	}
}
