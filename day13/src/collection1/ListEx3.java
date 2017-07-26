package collection1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* å�̸�: java å����: kim ������: 100
 * å�̸�: bigdata å����: lee ������: 250
 * å�̸�: programming å����: park ������: 300
 */
public class ListEx3 extends Book {

	public static void main(String[] args) {
		// �Ű�����(parameter)�� �ִ� �����ڸ� ���� ���̴�. ���� ���� ��̳� ��� ���� ���� �� ��ǥ�� 
		//Ư���� ������ �Լ������� ��Ÿ����� �ϴ� ��찡 �ִ�. �׷��� ��쿡 ���� Ư���� ������ �Ű�������� �Ѵ�.
		Book bk1 = new Book("java", "kim", 100);
		Book bk2 = new Book("bigdata", "lee", 250);
		Book bk3 = new Book("programming", "park", 300);
		//li��� ����Ʈ�� ���� �ϳ��� �־��ִ� �� ���� ������ �� �ִٰ� �����ϸ� �ȴ�.
		List<Book> li = new ArrayList<>();
		li.add(bk1);
		li.add(bk2);
		li.add(bk3);
		
		//for����, getter�� �̿��ؼ� ���
		//foreach �迭���� ��Ÿ�� ��
		//list�� �迭�� Ȯ��� ���� �׸��̴�. 
		//������ ������ ob�� ������ش�.
		for(Book ob: li) {
			System.out.print("å�̸�: " + ob.getTitle() + "\t");
			System.out.print("å����: " + ob.getAuthor()+ "\t");
			System.out.println("������" + ob.getPage()+ "\t");
		}
		// �Ȱ��� ��� 
		Iterator<Book> iter = li.iterator();
		while(iter.hasNext())
		{// next�� �������� ob��� ������ ���� ���� �����Ͷ�
			Book ob = iter.next();
			System.out.print("å�̸�: " + ob.getTitle() + "\t");
			System.out.print("å����: " + ob.getAuthor()+ "\t");
			System.out.println("������" + ob.getPage()+ "\t");
		}
		// �� �ٸ� ���
		// for int i size���� �۴ٰ� �ϰ� 
		System.out.println(li.size());
		for(int i=0; i<li.size(); i++) {
		System.out.print("å�̸�: " + li.get(i).getTitle() + "\t");
		System.out.print("å����: " + li.get(i).getAuthor()+ "\t");
		System.out.println("������" + li.get(i).getPage()+ "\t");
		}
//		bk1.setTitle("java");
//		bk1.setAuthor("kim");
//		bk1.setPage(100);
//		System.out.println("å�̸�: " + bk1.getTitle()+ "å����: " + bk1.getAuthor() + "������" + bk1.getPage() );
//		bk2.setTitle("bigdata");
//		bk2.setAuthor("lee");
//		bk2.setPage(250);
//		System.out.println("å�̸�: " + bk2.getTitle()+ "å����: " + bk2.getAuthor() + "������" + bk2.getPage() );
//		bk3.setTitle("programming");
//		bk3.setAuthor("park");
//		bk3.setPage(300);
//		System.out.println("å�̸�: " + bk3.getTitle()+ "å����: " + bk3.getAuthor() + "������" + bk3.getPage() );
//
//		System.out.println();
		
	}
}
