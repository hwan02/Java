package day11;
/* Ŭ���� �� : Emp
 * -(private), +(public), #(protected),  (default)
 * -name:String
 * -dept:String
 * -salary:int
 * 
 * +setEmp(name:String,dept:String,salary:int) :void
 * +printEmp():void
 */
//���һ���� ���ߺο� �ٹ��ϸ� 1520000���� �޿��� �޽��ϴ�
class Emp{
	private String name;
	private String dept;
	private int salary;
	
	public void setEmp(String name,String dept,int salary) {
		this.name=name;
		this.dept=dept;
		this.salary=salary;
	}
	public void printEmp() {
		System.out.println(name + "����� " + dept + "�� �ٹ��ϸ� "
					+ salary +"���� �޿��� �޽��ϴ�" );
	}
}
public class ObjectTest1 {
	public static void main(String[] args) {
		Emp em=new Emp();
		em.setEmp("����", "���ߺ�", 1520000);
		em.printEmp();

	}

}
