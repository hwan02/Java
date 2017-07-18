package kr.ac.hufs;

public class GcTest {

	public static void main(String[] args) {
		Gc g = new Gc();
		g.m1();

		String str1 = new String("한국외국어대학교");
		String str2 = new String("미국외국어대학교");

		str1 = str2; // new String("미국외국어대학교")는 Gc의 대상
		System.gc(); // 결과적으로 강제사항은 아니고, 권고사항
		// 가용메모리 여부에 따라서 실행여부를 JVM 결정
		System.out.println(str1);
		System.out.println(str2);
	}
}

class Gc {
	Gc() {
		// 생성자
	}

}

	void m1() {

	}
}
