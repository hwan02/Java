package employee;

public class EmpMain {

	public static void main(String[] args) {
		//���� ���ε�
		Emp em = null; 
		
		em = new Engineer(201, "Tiger", "1234");
		em.setSalary(1500000);
		em.setBonus(75000);
		
		em = new Developer(101, "Scott", "5678");
		em.setSalary(2500000);
		em.setBonus(350000);
		
		//���� ���ε�
		Developer dev = new Developer(101, "Scott", "5678");
		dev.setSalary(2500000);
		dev.setBonus(350000);
		System.out.println(dev.toString());
		
		Engineer eng = new Engineer(201, "Tiger", "1234");
		dev.setSalary(1500000);
		dev.setBonus(75000);
		System.out.println(dev.toString());
	}
}
