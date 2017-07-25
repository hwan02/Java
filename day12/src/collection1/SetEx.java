package collection1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

//Set: 중복을 허용x, 순서유지x 
//입력한 값들 중 고유한 값1개만 저장되는 특성을 가지는 컬렉션...
public class SetEx {
	@SuppressWarnings(value = "unchecked") // 타입 확인을 하지 않는다.

	public static void main(String[] args) {
		Set set = new LinkedHashSet();
		set.add("one"); // add(Object)
		set.add(2);
		set.add(new Float(3.0f)); // 래퍼클래스, (int, float, double - primitive type)
		set.add(4.00);
		set.add(2);
		set.add(new Integer(2));
		set.add(new Double(4.00)); // 4.00과 중복

		System.out.println(set);

		if (set.containes("one"))
			System.out.println("그건 있네~");
		else
			System.out.println("그건 없네~");

		Iterator iter = set.iterator(); // set의 값을 가지는 iterator데이터 타입의 인스턴스 iter
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
