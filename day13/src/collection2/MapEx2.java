package collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapEx2 {

	public static void main(String[] args) {
		Map<Integer, String> mp = new HashMap<>();
		mp.put(3, "��ī��");
		mp.put(1, "�Ḹ��");
		mp.put(4, "���̸�");
		mp.put(2, "���α�");
		//list ���� ����� ���� ���� �Ǿ� ���� ���� ����
//		List<Integer> list = new ArrayList<>(keys);
//		Collections.sort(list);
		// Ű�� �ڷ����� integer ����  �� �� �ִ� ���� ��ü���� �Ǿ�� �ؼ� ����Ŭ������ ��������� �Ѵ�.
		// ������ �� n�� �ְ�
		Set<Integer> keys = mp.keySet();
		for(Integer n : keys) {
			System.out.println(mp.get(n));
		}
	}
}
