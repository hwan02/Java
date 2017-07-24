package day11;

public class OverrideTest {

}
	@Override
	public void setSalary(long salary) {
		this.salary=salary;
	}
	@Override
	public void setBonus(long bonus) {
		this.bonus=bonus+100000;
	}
	@Override
	public String toString() {
		return "사원번호"+super.getEno()
				+"\n사원이름: " +super.getEname()
				+"\n내선번호: " +super.getPhone()
				+"\n기본급여: " +salary
				+"\n보너스: " + bonus
				+"\n지급금액: " +(salary+bonus)+"원\n";
	}
 