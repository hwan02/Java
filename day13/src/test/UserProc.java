package test;
//����Ͻ� ����(������ ���̽� ����ó��)
//�� ���� �� ����.
public class UserProc {


	public User getLoginUser(String id, String pw ) {
		//�̷��� ��� �ϴ� ������? DB�ϰ� ������ �ϸ� DB���� ������ ���� �� �����´�. �����Ͱ� �ִٰ� �ϰ� �ҷ������� �� �ϰ� 
		User entity=null;
		if (id.equals("pororo")&& pw.equals("1234")) {
			entity = new User(); // �߿�!!!!!
			entity.setId(id);
			entity.setPw(pw);
			entity.setName("�Ƿη�");
			entity.setPoint(89.97);
		}
		return entity;
	}
		/*User entity = new User();
		if(ID.equals("pororo")) {
			System.out.println("���̵� : " + entity.getId());
			System.out.println("�н����� : " + entity.getPw());
			System.out.println("�̸� : " + entity.getName());
			System.out.println("�̸� : " + entity.getPoint()+ "\n");
		} else {
			System.out.println("�ٽ� �Է����ּ���.");
		}
		return entity;
	}*/
/* getLoginUser() �޼��带 ����ÿ�
 * �Ű������� ���� pororo�� 1234�� ���Ͽ�
 * ������ entity��ü�� ���� ==> User entity = new User();
 * setter�� �̿��Ͽ� id, pw, �Ƿη�, 89.97�� �����Ͻÿ�
 * 
 * entity�� ����
 */

}
