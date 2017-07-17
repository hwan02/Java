package kr.ac.hufs;

public class ArrayTest3 {

	public static void main(String[] args) {
		String str = "설현/헬로비너스 나라/조승우/장나라";
		String[] arrStr = str.split("/");
		
		System.out.println(arrStr[1]);
	}
}
