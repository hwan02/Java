package family;
/* �̸�: ȫ�浿                   <-------------Family�� toString���� �ۼ�
 * �ƺ��� ������ ���� �Ѵ�.     <-------------Job�������̽��� ��ӹ޾� Father�� work()���� �ۼ�
 * 
 * �̸�: �����
 * ������ �������� �Ѵ�.
 * 
 * �̸�: ȫ��ǥ
 * �Ƶ��� ���θ� �Ѵ�.
 */
public class MainEx {

	public static void main(String[] args) {
		Family [] family = new Family[] {
				new Father("ȫ�浿"),
				new Mother("�����"),
				new Son("ȫ��ǥ"),};
		for(Family ob:family)
			System.out.println(ob.toString());
	}
}

