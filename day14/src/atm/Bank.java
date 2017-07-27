package atm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bank implements Runnable {
	private long depositMoney = 100000; // 은행 잔고
	private long balance; // 찾는 금액
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//동기화를 안 하면 출력값이 이상해진다.
	@Override
	public synchronized void run() {
		System.out.println(Thread.currentThread().getName() + "고객님 어서 오세요~");

		System.out.println("출금하실 금액을 입력해주세요.");
		try {
			balance = Long.parseLong(br.readLine());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		withDraw();
	}

	public void withDraw() {
		if(depositMoney >= balance) {
			if(balance % 10000 == 0) {
				depositMoney = depositMoney - balance; //얘를 어디에 넣어요? depositMoney에 넣어야죠
				System.out.println("잔액은" + depositMoney + "원입니다.");
			}else {
				System.out.println("만원 단위로 출금 가능합니다.\n");
			}
		} else {
			System.out.println("잔액이 부족합니다.");
		}

	}

}
