package collection2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapEx3 {

	public static void main(String[] args) {
		Book bk1 = new Book("java", "kim", 100);
		Book bk2 = new Book("bigdata", "lee", 250);
		Book bk3 = new Book("programming", "park", 300);
		// ���������� ������µ� Ÿ��Ʋ ��ü�� Ű�� �Ǵ� ���̴�.
		// ��ü�� �״�� ����ش� ����
		Map<String, Book> map = new HashMap<>();
		map.put(bk1.getTitle(), bk1);
		map.put(bk2.getTitle(), bk2);
		map.put(bk3.getTitle(), bk3);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ã�� �������� �Է�: ");
		//���� �ϳ��� �����.
		//nextLine ���� �Է� �ޱ�
		//next �ܾ� �ϳ� �Է� �ޱ�
		String title = sc.next();
		
		if(map.get(title)==null) {
			System.out.println("ã�� ������ �����~");
		} else {
			System.out.print("å�̸�: " + map.get(title).getTitle() + "\t");
			System.out.print("å����: " + map.get(title).getAuthor()+ "\t");
			System.out.println("������" + map.get(title).getPage());
		}
		sc.close();
	}
}
