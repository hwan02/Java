package test;
//비즈니스 로직(데이터 베이스 연동처리)
//할 일이 더 많다.
public class UserProc {


	public User getLoginUser(String id, String pw ) {
		//이렇게 써야 하는 이유는? DB하고 연동을 하면 DB에서 데이터 값을 못 가져온다. 데이터가 있다고 하고 불러오지는 못 하고 
		User entity=null;
		if (id.equals("pororo")&& pw.equals("1234")) {
			entity = new User(); // 중요!!!!!
			entity.setId(id);
			entity.setPw(pw);
			entity.setName("뽀로로");
			entity.setPoint(89.97);
		}
		return entity;
	}
		/*User entity = new User();
		if(ID.equals("pororo")) {
			System.out.println("아이디 : " + entity.getId());
			System.out.println("패스워드 : " + entity.getPw());
			System.out.println("이름 : " + entity.getName());
			System.out.println("이름 : " + entity.getPoint()+ "\n");
		} else {
			System.out.println("다시 입력해주세요.");
		}
		return entity;
	}*/
/* getLoginUser() 메서드를 만드시오
 * 매개변수로 들어온 pororo와 1234를 비교하여
 * 맞으면 entity객체를 만들어서 ==> User entity = new User();
 * setter를 이용하여 id, pw, 뽀로로, 89.97을 대입하시오
 * 
 * entity를 리턴
 */

}
