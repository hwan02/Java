package constructor;

/* 클래스 명: UserInfo
 *  -name:String
 *  -addr:String
 *  +UserInfo()
 *  +UserInfo(name:String, addr:String)
 *  +getter
 *  --------------------------------
 *  [출력]
 *  ** 주소록 **				   <==  디폴트 생성자에서 출력
 *  이름: 우주소녀                   <==  main메서드에서 getter를 이용해서 출력
 *  주소: 처인구 모현면
 */
public class ConstructorEx3 {

	public static void main(String[] args) {
		UserInfo ui = new UserInfo("우주소녀", "처인구 모현면");
		System.out.println("이름: " + ui.getName());
		System.out.println("주소: " + ui.getAddr());
	}
}

class UserInfo {
	private String name;
	private String addr;
	
	public UserInfo() {
		super();
		System.out.println("** 주소록 **");
	}
	public UserInfo(String name, String addr) {
		this();
		this.name = name;
		this.addr = addr;
	}

	public String getName() {
		return name;
	}

	public String getAddr() {
		return addr;
	}
}