package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//checked Exceptoin: 명시적 예외처리 필요
public class ExceptionEx3 {

	String str;

	public ExceptionEx3() {
		input();
	}
	
	public void input() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 오류가 발생한다 던지기를 하거나 try catch를 사용
		try {
			str=br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("문자열 입력 오류");
		}
		
	}

	public void output() {
		System.out.println("결과: " + str);
	}
	// ???????????????????????????
	public static void main(String[] args) {
		new ExceptionEx3().output();
		
	}
}
