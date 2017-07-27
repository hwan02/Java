package thread;
/* 쓰레드의 우선순위를 임위로 주는 것
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
			System.out.println(str + "\t" + Thread.currentThread()); // 이름과 우선순위 그룹이 찍혀 나온다
		}
	}

	public static void main(String[] args) throws InterruptedException {
		RoseTest aa = new RoseTest("사랑");
		RoseTest bb = new RoseTest("가시");
		RoseTest cc = new RoseTest("장미");
		
		aa.start();
		aa.join(); //aa가 끝날 때까지 bb, cc Thread는 대기
		bb.start();
		cc.start();
	}

}
