package kr.ac.hufs;

public class ObjectArray2 {

	public static void main(String[] args) {
		Member2[] mbArr2 = new Member2[5];
		mbArr2[0] = new Member2("기사단장 죽이기", "무라카미 하루키");
		mbArr2[1] = new Member2("로마인 이야기", "시오노 나나미");
		mbArr2[2] = new Member2("인페르노", "댄 브라운");
		mbArr2[3] = new Member2("After you", "조조 모예스");
		mbArr2[4] = new Member2("나미야 잡화점의 기적", "히가시노 게이고");
		
		
		for(int i = 0; i < mbArr2.length; i++) {
			System.out.println("배열["+i+"]: " + mbArr2[i].name + "[" + mbArr2[i].author+"]" );
		}
	}
}

class Member2 {
	String name = "";
	String author = "";

	Member2() {

	}

	Member2(String _name, String _author) {
		this.name = _name;
		this.author = _author;

	}

	void setAll(String _name, String _author) {
		this.name = _name;
		this.author = _author;
	}
}
