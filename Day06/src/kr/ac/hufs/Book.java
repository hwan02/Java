package kr.ac.hufs;

public class Book {

	public static void main(String[] args) {
		Book2[] mbArr = new Book2[5];
		mbArr[0] = new Book2("기사단장 죽이기", "무라카미 하루키");
		mbArr[1] = new Book2("로마인 이야기", "시오노 나나미");
		mbArr[2] = new Book2("인페르노", "댄 브라운");
		mbArr[3] = new Book2("After you", "조조 모예스");
		mbArr[4] = new Book2("나미야 잡화점의 기적", "히가시노 게이고");

		for (int i = 0; i < mbArr.length; i++) {
			System.out.println("배열[" + i + "]: " + mbArr[i].name + "[" + mbArr[i].author + "]");
		}
		Book2[] mbArr2 = { new Book2("홍길동", "허균"), new Book2("개미", "베르나르"), new Book2("뇌", "베르나르"),
				new Book2("냉정과열정사이 로자", "에프니 가오리"), new Book2("도가니", "공지영") };

		for (int i = 0; i < mbArr2.length; i++) {
			System.out.println("배열[" + i + "]: " + mbArr2[i].name + "[" + mbArr2[i].author + "]");
		}
	}
}

class Book2 {
	String name = "";
	String author = "";

	Book2() {

	}

	Book2(String _name, String _author) {
		this.name = _name;
		this.author = _author;

	}

	void setAll(String _name, String _author) {
		this.name = _name;
		this.author = _author;
	}
}
