package kr.ac.hufs;

import java.util.ArrayList;

public class NewArrayListTest {
	public static void main(String[] args) {
		new ArrTest();
	}
}

class ArrTest {

	ArrTest() {
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("한국");
		arr.add("외국어");
		arr.add("대학교");

		for (int i = 0; i < arr.size(); i++) {
			System.out.print(arr.get(i) + ",");

		}
		System.out.println("");
		arr.remove(0);
		for (int i = 0; i < arr.size(); i++) {
			System.out.print(arr.get(i) + ",");
		}
		System.out.println("");
		arr.add(1, "하하");
		for (int i = 0; i < arr.size(); i++) {
			System.out.print(arr.get(i) + ",");
		}
		System.out.println("");
		// 사이즈가 0이 되어버린다.
		arr.clear();
		for (int i = 0; i < arr.size(); i++) {
			System.out.print(arr.get(i) + ",");
		}
	}
}
