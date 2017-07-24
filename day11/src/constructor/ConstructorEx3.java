package constructor;

/* Ŭ���� ��: UserInfo
 *  -name:String
 *  -addr:String
 *  +UserInfo()
 *  +UserInfo(name:String, addr:String)
 *  +getter
 *  --------------------------------
 *  [���]
 *  ** �ּҷ� **				   <==  ����Ʈ �����ڿ��� ���
 *  �̸�: ���ּҳ�                   <==  main�޼��忡�� getter�� �̿��ؼ� ���
 *  �ּ�: ó�α� ������
 */
public class ConstructorEx3 {

	public static void main(String[] args) {
		UserInfo ui = new UserInfo("���ּҳ�", "ó�α� ������");
		System.out.println("�̸�: " + ui.getName());
		System.out.println("�ּ�: " + ui.getAddr());
	}
}

class UserInfo {
	private String name;
	private String addr;
	
	public UserInfo() {
		super();
		System.out.println("** �ּҷ� **");
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