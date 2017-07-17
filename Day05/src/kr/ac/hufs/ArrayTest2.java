package kr.ac.hufs;

public class ArrayTest2 {

	public static void main(String[] args) {
		// String 배열
		String[] str = new String[4]; 
		str[0] = "봄";
		str[1] = "여름";
		str[2] = "가을";
		str[3] = "겨울";
		
		for(String i : str) {
			System.out.print(" " + i);
		}
		
		System.out.println();
		
		String[] str2 = {"설현", "헬로비너스 나라", "조승우", "장나라"};
		
		for(String i : str2) {
			System.out.print("[" + i + "] ");
		}
		
		
	}
}
