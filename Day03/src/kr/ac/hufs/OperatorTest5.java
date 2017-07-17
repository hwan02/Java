package kr.ac.hufs;

public class OperatorTest5 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		if(a>b && b>c) {
			
		}
		if(true && true) {
			System.out.println("둘다 만족1");
		}
		
		if(true && false) {
			System.out.println("둘다 만족2");
		}
		
		if(false && true) {
			System.out.println("둘다 만족4");
		}
		
		if(false && false) {
			System.out.println("둘다 만족3");
		}
	}
}