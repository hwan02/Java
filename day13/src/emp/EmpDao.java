package emp;

import java.util.ArrayList;
import java.util.List;

//������ ���̽����� �ڿ��� ������ �뵵�� ���(DAO:data access object)
// VO�� ��Ƽ� �������� ����� ���� 
public class EmpDao {

	//list�� ��°� ����
	List<EmpVO> list=null; // **�ʱⰪ�� �׻� null ��ü�� �����ϸ� �˻��� �� �� �� �ö���� ������ �߻��� �� �ִ�.
	//�����ͺ��̽� �����ϴ� �κ��� �־��ִ� �κ�
	public EmpDao(){
	list = new ArrayList<>();
	list.add(new EmpVO("kim", "������", 1000000));
	list.add(new EmpVO("lee", "���ߺ�", 1500000));
	list.add(new EmpVO("park", "������", 3000000));
	}
	//�޼ҵ带 �ϳ� ����� List Ÿ�� ����?
	// list �ϳ��� �����ϸ� �������� �ѹ��� �����ϴ� ���̴�. �̰� �ٷ� ��ü�����̴�
	public List<EmpVO> getEmpList(){
		return list;
	}
	// �����Լ��� �ϼ��Ǹ� ��ü���� �׸��� ���� ���̴�.
	public EmpVO getEmp(String name) {
		//EmpVO��������
		for(EmpVO vo:list) {
			if(vo.getEname().equals(name))
				return vo;
		}
		return null;
	}
}
