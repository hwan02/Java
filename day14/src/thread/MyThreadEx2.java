package thread;

public class MyThreadEx2 extends Thread{ // Exceptio���� �����Ⱑ �� �ȴ�.
	String str;
	int num;
	
	public MyThreadEx2(String str, int num) {
		this.str=str;
		this.num=num;
	}
	@Override
	public void run() {
		for(int i=0; i <= num; i++) {
			System.out.println(str + " : " + i);
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} //30/1000��
		}
	}
	public static void main(String[] args) throws InterruptedException {
		MyThreadEx2 aa = new MyThreadEx2("one", 100);
		MyThreadEx2 bb = new MyThreadEx2("two", 100);
		MyThreadEx2 cc = new MyThreadEx2("three", 100);
		
		aa.start(); //start()�� ������ �غ� �ϴ� �޼���, ���� ���� �غ� �Ϸ�Ǹ� run()ȣ����
		bb.start();
		cc.start();
		/* start()�� ������(VMThread)�� �����ϰ�, ���ӰԸ������ Thread�� run()�� ����
		 * �⺻������ main()������ 1���� ����ǰ� ����.. ���� �װ�  
		 * 
		 */
	}
}
