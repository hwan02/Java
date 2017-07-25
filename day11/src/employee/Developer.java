package employee;

public class Developer extends Emp {

	private long salary;
	private long bonus;

	public Developer() {
		super();
	}

	public Developer(int eno, String ename, String phone) {
		super(eno, ename, phone);
	}

	@Override
	public void setSalary(long salary) {
		this.salary = salary;
	}

	@Override
	public void setBonus(long bonus) {
		this.bonus = bonus + 100000;
	}

	@Override
	public String toString() {
		return "�����ȣ" + super.getEno() + "\n����̸�: " + super.getEname() + "\n������ȣ: " + super.getPhone() + "\n�⺻�޿�: "
				+ salary + "\n���ʽ�: " + bonus + "\n���ޱݾ�: " + (salary + bonus) + "��\n";
	}
}