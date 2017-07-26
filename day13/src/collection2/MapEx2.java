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
		mp.put(3, "피카츄");
		mp.put(1, "잠만보");
		mp.put(4, "파이리");
		mp.put(2, "꼬부기");
		//list 정열 기능이 없다 정열 되어 있지 않은 상태
//		List<Integer> list = new ArrayList<>(keys);
//		Collections.sort(list);
		// 키의 자료형이 integer 영역  올 수 있는 값은 객체형이 되어야 해서 래퍼클래스를 지정해줘야 한다.
		// 임의의 값 n을 주고
		Set<Integer> keys = mp.keySet();
		for(Integer n : keys) {
			System.out.println(mp.get(n));
		}
	}
}
