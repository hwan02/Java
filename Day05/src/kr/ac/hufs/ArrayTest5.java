package kr.ac.hufs;

import java.util.Scanner;

public class ArrayTest5 {

	public static void main(String[] args) {
		String[] str = {"설현", "헬로비너스 나라", "조승우", "김C"};
		String[] str2 = str;
		
		str2[1] = "권나라"; 
			
		for(int i =0; i< str.length; i++) {
			System.out.print(str[i] + " ");
		}
		// 기본형을 제외한 참조형은 주소값을 저장하기 때문에 같은 값이 나온다. 
		System.out.println();
		for(int i =0; i< str2.length; i++) {
			System.out.print(str2[i] + " ");
		}
	}
}
