package kr.ac.hufs;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapTest {

	public static void main(String[] args) {
		new HashMapSample();
	}
}

class HashMapSample {
	HashMap<String, String> hm = new HashMap<>();

	HashMapSample() {
		hm.put("s", "삼성");
		hm.put("l", "LG");
		hm.put("a", "애플");
		hm.put("g", "구글");
		// Hashmap에서는 입력시 key:value 형식을 취하고,
		// 메소드 명은 put(k,v) 형태로 입력함
		// clear(): Hashmap 전체 요소 삭제
		// size(): 크기
		// isEmpty(): 비어있는지 여부 true, false로 리턴

		Scanner scan = new Scanner(System.in);

		//hm.clear();
		//System.out.println("크기>> " + hm.size());
		
		for (;;) {
			System.out.print("키>> ");
			String key = scan.nextLine().trim();
			if(key.equals("종료")) {
				System.out.println("종료합니다.");
				break;
			}else {
				showHashMap(key);
			}
		}
		scan.close();
	}

	void showHashMap(String _key) {
		String value = hm.get(_key);
		if (value == null) {
			System.out.println("찾으신 값은 없습니다.");
		} else {
			System.out.println("값>> " + hm.get(_key));
		}

	}
}