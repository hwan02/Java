package inheritance;
// 생성자 연습

class ParentEx{
	public ParentEx() {
		System.out.println("parent class");
	}
}
class ChildEx extends ParentEx{
	public ChildEx() {
		super(); 
		System.out.println("child class");
	}
	
}
public class InheritanceEx2 {
	
	public static void main(String[] args) {
		ChildEx ce = new ChildEx();
	}
}

/* this.변수
 * this.메서드()
 * this()
 * this(인자, 인자...) --생성자(자기자신)
 * 
 * super.변수
 * super.메서드()
 * super()
 * super(인자, 인자...) --생성자(부모)
 */
