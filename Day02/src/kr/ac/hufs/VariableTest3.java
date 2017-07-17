package kr.ac.hufs;

public class VariableTest3 {

	public static void main(String[] args){
		byte b1=2; // -128 ~ 127 표현가능
		byte b2=127;
		byte b3=(byte)(b1+b2);
		System.out.println(b3);
	
//		long i=100L;
//		int j=(int)i;
//		float f=3.141592f;
//		double d=3.1415924168;
//		char c=‘A’
//			String cc=“AA”;
//		int k=99;
//		char ccc=(char)k;
//		boolean boo=true;		
//		boolean bool=false;
		
		int kk =(int)(2.01 * 100);
		System.out.println(kk);
		
		float kk2 = ((float)2.01*100);
		System.out.println(kk2);
		
		float ff = 100.123f;
		double dd = 200.123;
		double result = ff + dd;
		System.out.println("result " + result);
	}
}