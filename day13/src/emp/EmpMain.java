package emp;

import java.util.List;

public class EmpMain {

	public static void main(String[] args) {
		EmpDao dao = new EmpDao();
		System.out.println("**** ��� ��� ��� �ϱ� ****");
		
		List<EmpVO> list = dao.getEmpList();
		for(EmpVO ob : list) {
			System.out.println("�̸� : " + ob.getEname());
			System.out.println("�μ� : " + ob.getDept());
			System.out.println("�޿� : " + ob.getSalary()+ "\n");
 		}
		//-----------------------------------------
		System.out.println("*** lee ��� ����ϱ� ***");
		EmpVO em = dao.getEmp("lee");
		//������ �������� ������ ��¸� ���ش�.
		if(em==null)
			System.out.println("ã�� ����� �����~");
		else 
			System.out.println(em.getEname() + " " + em.getDept() + " " + em.getSalary());
		}
}
