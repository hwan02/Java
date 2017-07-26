package collection2;

import java.util.HashMap;
import java.util.Map;

//Map:키와 값의 쌍을 이루는 저장 방식을 가지는 컨테이너 
//iterator 기능 없음
public class MapEx1 {

	public static void main(String[] args) {
		Map<Integer, String> mp = new HashMap<>();
		mp.put(101, "둘리"); //put() 맵에 데이터 추가
		mp.put(201, "도우너");
		mp.put(301, "마이콜");
		mp.put(401, "또치");
		// key를 찾아다닌다.
		System.out.println("key : " + 101 + "value : " + mp.get(101));
		System.out.println("key : " + 201 + "value : " + mp.get(201));
		System.out.println("key : " + 301 + "value : " + mp.get(301));
		System.out.println("key : " + 401 + "value : " + mp.get(401));
		
		mp.remove(401);
		System.out.println(mp.get(401));
		mp.clear(); //맵 전체 삭제
		System.out.println(mp.get(101));
	} 
	
}
