package inputex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//콘솔로 데이터 입력
//이름을 입력하시오: 강호동
//당신 이름은 강호동입니다.
public class InputTest1 {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);  // 임시의 기억공간
		
		String name;
		char gender;
		
		System.out.print("이름을 입력하시오: ");
		name = br.readLine(); //한 줄 입력이 된다.
		System.out.print("성별을 입력하시오: ");
		gender=br.readLine().charAt(0); // 한글자입력 "남\n\r" 0번째 자리 1번째 자리 2번째 자리
		
		System.out.println("당신의 이름은 " + name + "입니다.");
		System.out.println("당신의 성별은 " + gender + "자 입니다.");
		
		
	}
}
