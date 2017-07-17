package kr.ac.hufs;

import java.util.Scanner;

public class PlusTest2 {

	public static void main(String[] args) {
		Plus2 p = new Plus2();
	}

}

// 클래스 만드는 이유 ? 객체 지향 처음에 한 방식은 절차 지향 방식
class Plus2 {
	// 전역변수와 인스턴스의 차이? 
	int total = 0;
	
	Scanner scan = new Scanner(System.in);

	// ()를 해주는 이유는?생성자 함수를 불러주는 것
	Plus2(){
		System.out.print("5개의 정수 값을 입력해주세요>>");
		for(int i = 1; i <=5; i++) {
			int num = scan.nextInt();
			if(num > 0) { 
				this.total += num;
			}else {
				continue;
			}
		}
		scan.close();
		pln("입력하신 양수의 합은 " + this.total + "입니다.");
	}
//	pln?? 임의로 지정한 매쏘드
	void pln(String _msg) {
		System.out.println(_msg);
	}
}
