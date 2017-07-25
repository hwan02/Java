package family;
/* 이름: 홍길동                   <-------------Family의 toString에서 작성
 * 아빠는 나가서 일을 한다.     <-------------Job인터페이스를 상속받아 Father의 work()에서 작성
 * 
 * 이름: 김순희
 * 엄마는 집안일을 한다.
 * 
 * 이름: 홍준표
 * 아들은 공부를 한다.
 */
public class MainEx {

	public static void main(String[] args) {
		Family [] family = new Family[] {
				new Father("홍길동"),
				new Mother("김순희"),
				new Son("홍준표"),};
		for(Family ob:family)
			System.out.println(ob.toString());
	}
}

