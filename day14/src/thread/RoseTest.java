package thread;
/* �������� �켱������ ������ �ִ� ��
 * 
 */

public class RoseTest extends Thread {
	private String str;

	public RoseTest(String str) {
		this.str = str;
	}

	@Override
	public void run() {
		for (int i = 0; i <= 500; i++) {
			System.out.println(str + " : " + i);
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(str + "\t" + Thread.currentThread()); // �̸��� �켱���� �׷��� ���� ���´�
		}
	}

	public static void main(String[] args) throws InterruptedException {
		RoseTest aa = new RoseTest("���");
		RoseTest bb = new RoseTest("����");
		RoseTest cc = new RoseTest("���");
		
		aa.start();
		aa.join(); //aa�� ���� ������ bb, cc Thread�� ���
		bb.start();
		cc.start();
	}

}
