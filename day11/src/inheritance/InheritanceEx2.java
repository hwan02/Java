package inheritance;
// ������ ����

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

/* this.����
 * this.�޼���()
 * this()
 * this(����, ����...) --������(�ڱ��ڽ�)
 * 
 * super.����
 * super.�޼���()
 * super()
 * super(����, ����...) --������(�θ�)
 */
