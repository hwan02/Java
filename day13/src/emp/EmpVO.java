package emp;
//디폴트 생성자, 매개변수 3개 생성자, getter & setter
// 값을 가지고 있는 객체다 거기에 있는 값을 뽑아낼 수 있다
//VO(Value Object) 또는 entity, DTO(data transfer object), bean이라고도 함
//데이터를 하나로 묶어서 전송할 목적으로 만든 클래스
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
