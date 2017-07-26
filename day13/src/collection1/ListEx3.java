package collection1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* 책이름: java 책저자: kim 페이지: 100
 * 책이름: bigdata 책저자: lee 페이지: 250
 * 책이름: programming 책저자: park 페이지: 300
 */
public class ListEx3 extends Book {

	public static void main(String[] args) {
		// 매개변수(parameter)가 있는 생성자를 만들 것이다. 공간 안의 곡선이나 곡면 위의 점의 각 좌표를 
		//특정한 변수의 함숫값으로 나타내어야 하는 경우가 있다. 그러한 경우에 사용된 특정한 변수를 매개변수라고 한다.
		Book bk1 = new Book("java", "kim", 100);
		Book bk2 = new Book("bigdata", "lee", 250);
		Book bk3 = new Book("programming", "park", 300);
		//li라는 리스트를 만들어서 하나씩 넣어주는 것 위에 값들이 들어가 있다고 생각하면 된다.
		List<Book> li = new ArrayList<>();
		li.add(bk1);
		li.add(bk2);
		li.add(bk3);
		
		//for루프, getter를 이용해서 출력
		//foreach 배열값을 나타낼 때
		//list는 배열이 확장된 개념 그릇이다. 
		//임의의 기억공간 ob를 만들어준다.
		for(Book ob: li) {
			System.out.print("책이름: " + ob.getTitle() + "\t");
			System.out.print("책저자: " + ob.getAuthor()+ "\t");
			System.out.println("페이지" + ob.getPage()+ "\t");
		}
		// 똑같은 방식 
		Iterator<Book> iter = li.iterator();
		while(iter.hasNext())
		{// next를 가져오는 ob라는 변수가 다음 값을 가져와라
			Book ob = iter.next();
			System.out.print("책이름: " + ob.getTitle() + "\t");
			System.out.print("책저자: " + ob.getAuthor()+ "\t");
			System.out.println("페이지" + ob.getPage()+ "\t");
		}
		// 또 다른 방식
		// for int i size보다 작다고 하고 
		System.out.println(li.size());
		for(int i=0; i<li.size(); i++) {
		System.out.print("책이름: " + li.get(i).getTitle() + "\t");
		System.out.print("책저자: " + li.get(i).getAuthor()+ "\t");
		System.out.println("페이지" + li.get(i).getPage()+ "\t");
		}
//		bk1.setTitle("java");
//		bk1.setAuthor("kim");
//		bk1.setPage(100);
//		System.out.println("책이름: " + bk1.getTitle()+ "책저자: " + bk1.getAuthor() + "페이지" + bk1.getPage() );
//		bk2.setTitle("bigdata");
//		bk2.setAuthor("lee");
//		bk2.setPage(250);
//		System.out.println("책이름: " + bk2.getTitle()+ "책저자: " + bk2.getAuthor() + "페이지" + bk2.getPage() );
//		bk3.setTitle("programming");
//		bk3.setAuthor("park");
//		bk3.setPage(300);
//		System.out.println("책이름: " + bk3.getTitle()+ "책저자: " + bk3.getAuthor() + "페이지" + bk3.getPage() );
//
//		System.out.println();
		
	}
}
