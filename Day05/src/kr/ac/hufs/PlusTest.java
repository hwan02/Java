package kr.ac.hufs;

import java.util.Scanner;

public class PlusTest {

	public static void main(String[] args) {
		// 입력받은 값에서 -5, 10, 8, 9, 3 양의 정수 값만 더하기
		Scanner scan = new Scanner(System.in);
		int sum = 0;

		System.out.println("정수 5개를 입력하세요.> ");
//		int i = 1; 초기값을 의미  i <= 5 1, 2, 3, 4, 5 즉, 5개를 넣을 수 있다. i++는 하나씩 늘어난다? 밑에 조건을 충족 후 다시 늘어나 i에 1을 더한 값으로 시작을 한다 
		// 입력한 수는 num로 들어간다 그 이후 조건에 맞게 실행되고 넘어간다.  sum += num은 입력한 숫자들 중에서 음수를 제외하고 더한다.
		for (int i = 1; i <= 5; i++) {
			int num = scan.nextInt();
			if (num <= 0)
				continue;
			else
				sum += num;
		}
		System.out.println("입력하신 수 중 양수들의 합은 " + sum + "입니다.");

		scan.close();
	}
}