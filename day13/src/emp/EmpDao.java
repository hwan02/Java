package emp;

import java.util.ArrayList;
import java.util.List;

//데이터 베이스에서 자원을 가져올 용도로 사용(DAO:data access object)
// VO를 담아서 가져오는 기능을 가짐 
public class EmpDao {

	//list로 담는게 무난
	List<EmpVO> list=null; // **초기값은 항상 null 객체를 생성하면 검색을 할 때 안 올라오는 현상이 발생할 수 있다.
	//데이터베이스 연결하는 부분을 넣어주는 부분
	public EmpDao(){
	list = new ArrayList<>();
	list.add(new EmpVO("kim", "영업부", 1000000));
	list.add(new EmpVO("lee", "개발부", 1500000));
	list.add(new EmpVO("park", "관리부", 3000000));
	}
	//메소드를 하나 만든다 List 타입 리턴?
	// list 하나만 전달하면 위에꺼를 한번에 전달하는 꼴이다. 이게 바로 객체지향이다
	public List<EmpVO> getEmpList(){
		return list;
	}
	// 메인함수가 완성되면 전체적인 그림이 보일 것이다.
	public EmpVO getEmp(String name) {
		//EmpVO형식으로
		for(EmpVO vo:list) {
			if(vo.getEname().equals(name))
				return vo;
		}
		return null;
	}
}
