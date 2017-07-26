package emp;
//����Ʈ ������, �Ű����� 3�� ������, getter & setter
// ���� ������ �ִ� ��ü�� �ű⿡ �ִ� ���� �̾Ƴ� �� �ִ�
//VO(Value Object) �Ǵ� entity, DTO(data transfer object), bean�̶�� ��
//�����͸� �ϳ��� ��� ������ �������� ���� Ŭ����
public class EmpVO {
	private String ename;
	private String dept;
	private int salary;
	
	public EmpVO() {
		super();
	}

	public EmpVO(String ename, String dept, int salary) {
		super();
		this.ename = ename;
		this.dept = dept;
		this.salary = salary;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
