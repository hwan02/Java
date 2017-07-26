package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class InputStreamTest {

	public static void main(String[] args) throws IOException {
		//3.버퍼 스트림(속도가 상대적으로 느리지 않음)
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);
		
		System.out.println("Input String : ");
		String str =br.readLine(); // 기다리지 않기 때문에 속도가 빠름
		System.out.println(str);
		
		
		
	}
/*		 2.문자(character stream) 캐릭터스트림이라고 주로 표현 엔터를 판단하기 때문에 속도가 좀 느리다.
		 BufferedReader를 빼는 이유는?
		InputStreamReader isr = new InputStreamReader(System.in);
		System.out.println("Input String : ");
		char ch = '\0';
		while (ch != '\n') {
			ch = (char) isr.read(); // 문자스트립(InputStreamReader), 한글처리 o
			System.out.println(ch);
		}
	}
*/

// 1.바이트 스트림 -------------------------------------------------
/*
 * System.out.println("Input String : "); 
 * char ch = '\0'; //null의 개념과 다르다.
 * while(ch != '\n') 
 * {
 *  ch=(char) System.in.read(); ///바이트 스트림 물결처럼 연속되는 데이터(InputStream), 기본적으로 한글처리가 안 된다. 
 * System.out.println(ch); 
 * } 
 */
}