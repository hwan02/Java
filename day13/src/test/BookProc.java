package test;
//����Ͻ� ����(������ ���̽� ����ó��)

import java.util.ArrayList;
import java.util.List;


public class BookProc {
	public ArrayList<Book> getList(){
		Book bk1 = new Book("java", "kim", 100);
		Book bk2 = new Book("c++", "lee", 250);
		Book bk3 = new Book("jsp", "park", 300);
		//list�� ����� �����͸� �߰��Ͻÿ�
		//book.getlist�� �� �� �ְ� �ȴ� ????????????????
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
