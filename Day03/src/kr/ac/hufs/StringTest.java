package kr.ac.hufs;

public class StringTest {
	public static void main(String[] args) {
		String str = "Hello, JAVA Bible, I'm a student of HUFS.";
		int strLength = str.length();
		System.out.println("strLength" + strLength);
		
		// 대소문자 구별함
		String nStr = str.replace('b', 'y');
		System.out.println("nStr: " + nStr);
		
		String nStr2 = str.replace("student", "teacher");
		System.out.println("nStr2: " + nStr2);
		
		String nStr3 = "dog, cat, bear";
		String[] nSt = nStr3.split(",");
		System.out.println(nSt[1]);
		
		String s = "java.lang.Object";
		String result = s.substring(10);
		System.out.println("result: " + result);
		String result2 = s.substring(10, 13);
		System.out.println("result2: " + result2);
		
		int aa = 100;
		String strA = aa + "";
		String strB = String.valueOf(aa);
		// var i = "100"; i = i*1;
		// var j = 100; j = j+"";
		
		String strT = "                          하이 ";
		strT = strT.trim();
		System.out.println(strT);
		
		
	}
}
