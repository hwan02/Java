package collection1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

//Set: �ߺ��� ���x, ��������x 
//�Է��� ���� �� ������ ��1���� ����Ǵ� Ư���� ������ �÷���...
public class SetEx {
	@SuppressWarnings(value = "unchecked") // Ÿ�� Ȯ���� ���� �ʴ´�.

	public static void main(String[] args) {
		Set set = new LinkedHashSet();
		set.add("one"); // add(Object)
		set.add(2);
		set.add(new Float(3.0f)); // ����Ŭ����, (int, float, double - primitive type)
		set.add(4.00);
		set.add(2);
		set.add(new Integer(2));
		set.add(new Double(4.00)); // 4.00�� �ߺ�

		System.out.println(set);

		if (set.containes("one"))
			System.out.println("�װ� �ֳ�~");
		else
			System.out.println("�װ� ����~");

		Iterator iter = set.iterator(); // set�� ���� ������ iterator������ Ÿ���� �ν��Ͻ� iter
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
