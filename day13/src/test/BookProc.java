package test;
//비즈니스 로직(데이터 베이스 연동처리)

import java.util.ArrayList;
import java.util.List;


public class BookProc {
	public ArrayList<Book> getList(){
		Book bk1 = new Book("java", "kim", 100);
		Book bk2 = new Book("c++", "lee", 250);
		Book bk3 = new Book("jsp", "park", 300);
		//list를 만들고 데이터를 추가하시오
		//book.getlist를 쓸 수 있게 된다 ????????????????
		ArrayList<Book> list = new ArrayList<Book>();
		list.add(bk1);
		list.add(bk2);
		list.add(bk3);
//		List<Book> list = new ArrayList<>();
//		list.add(bk1);
//		list.add(bk2);
//		list.add(bk3);
//		for(Book ob :list) {
//			System.out.println(bk1.getTitle());
//		}
		
		
		return list;
	}
}
