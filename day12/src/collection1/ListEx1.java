package collection1;

import java.util.ArrayList;
import java.util.List;

// List(인터페이스): 중복허용, 순서유지
// 배열과 비슷, 담을 수 있는 값의 수가 자동으로 증가 되는 컨테이너
public class ListEx1 {
		@SuppressWarnings(value = "unchecked")
		public static void main(String[] args) {
			List list = new ArrayList(); //ArrayList와 LinkedList 가능
			list.add("one");
			list.add("second");
			list.add("3rd");
			list.add(4);
			list.add(new Integer(4));
			list.add(new Float(5.0f));
			list.add("second");
			list.add(5.0f);
			System.out.println(list);
			
			System.out.println(list.get(1));
			System.out.println(list.size());
			
			list.remove("second"); //인덱스번호, 객체를 넣어서 지울 수 있음
	}
}
