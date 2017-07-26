package emp;

import java.util.List;

public class EmpMain {

	public static void main(String[] args) {
		EmpDao dao = new EmpDao();
		System.out.println("**** 모든 사원 출력 하기 ****");
		
		List<EmpVO> list = dao.getEmpList();
		for(EmpVO ob : list) {
			System.out.println("이름 : " + ob.getEname());
			System.out.println("부서 : " + ob.getDept());
			System.out.println("급여 : " + ob.getSalary()+ "\n");
 		}
		//-----------------------------------------
		System.out.println("*** lee 사원 출력하기 ***");
		EmpVO em = dao.getEmp("lee");
		//정보만 가져오기 때문에 출력만 해준다.
		if(em==null)
			System.out.println("찾는 사람이 없어요~");
		else 
			System.out.println(em.getEname() + " " + em.getDept() + " " + em.getSalary());
		}
}
