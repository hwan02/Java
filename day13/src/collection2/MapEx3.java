package collection2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapEx3 {

	public static void main(String[] args) {
		Book bk1 = new Book("java", "kim", 100);
		Book bk2 = new Book("bigdata", "lee", 250);
		Book bk3 = new Book("programming", "park", 300);
		// 정수값으로 만들었는데 타이틀 자체가 키가 되는 것이다.
		// 객체를 그대로 담아준다 값에
		Map<String, Book> map = new HashMap<>();
		map.put(bk1.getTitle(), bk1);
		map.put(bk2.getTitle(), bk2);
		map.put(bk3.getTitle(), bk3);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("찾는 도서명을 입력: ");
		//변수 하나를 만든다.
		//nextLine 한줄 입력 받기
		//next 단어 하나 입력 받기
		String title = sc.next();
		
		if(map.get(title)==null) {
			System.out.println("찾는 도서가 없어요~");
		} else {
			System.out.print("책이름: " + map.get(title).getTitle() + "\t");
			System.out.print("책저자: " + map.get(title).getAuthor()+ "\t");
			System.out.println("페이지" + map.get(title).getPage());
		}
		sc.close();
	}
}
