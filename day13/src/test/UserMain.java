package test;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id;
		String pw;

		System.out.println("ID를 입력하시오 : ");
		id = sc.next();
		System.out.println("PW를 입력하시오 : ");
		pw = sc.next();

		UserProc up = new UserProc();
		// 입력된 값을 가지고 getLoginUser를 찾는 것
		User entity = up.getLoginUser(id, pw);

		if (entity != null) {
			System.out.println(entity.getName() + "님이 입장하셨습니다.");
			System.out.println("현재 포인트는 " + entity.getPoint() + "점입니다.");

			BookProc book = new BookProc();
			ArrayList<Book> list = book.getList();

			System.out.println("*** Book의 정보 보기 ***");
			for (Book ob : list) {
				System.out.println("책이름: " + ob.getTitle() + "\t");
				System.out.println("책저자: " + ob.getAuthor() + "\t");
				System.out.println("페이지: " + ob.getPage() + "\t");
			}
		} else {
			System.out.println("ID 또는 PW가 존재하지 않는 ID입니다.");
		}
	}
}
