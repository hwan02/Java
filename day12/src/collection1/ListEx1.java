package collection1;

import java.util.ArrayList;
import java.util.List;

// List(�������̽�): �ߺ����, ��������
// �迭�� ���, ���� �� �ִ� ���� ���� �ڵ����� ���� �Ǵ� �����̳�
public class ListEx1 {
		@SuppressWarnings(value = "unchecked")
		public static void main(String[] args) {
			List list = new ArrayList(); //ArrayList�� LinkedList ����
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
			
			list.remove("second"); //�ε�����ȣ, ��ü�� �־ ���� �� ����
	}
}
