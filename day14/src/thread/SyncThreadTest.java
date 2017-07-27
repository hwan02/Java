package thread;
// 채팅프로그램을 만들면 서로 간의 데이터를 주고 받죠 얘를 쓰레드처리해준다. 동기화가 제대로 안 되면 에이가 세개를 전달하고 나면 비가 두개를 전달해야 하는 문제
// 네트워크 프로그래밍을 공부하게 되면
/* 실행 순서의 동기화 처리
 *  : 쓰레드의 실행 순서를 정하고 반드시 따르게 하는 것  다 같이 들어가서 다 같이 볼 일보고 다 같이 나와야 하는 경우가 생긴다
 *  ex) A쓰레드의 처리가 완료된 후 B 쓰레드가 처리되도록 하는 경우
 *  
 *  형식) 접근지정자 synchronized 메서드명(){} 
 */
class FamilyThread extends Thread{
	private Washroom wr;
	private String who;
	public FamilyThread(Washroom wr, String who) {
		super();
		this.wr = wr;
		this.who = who;
	}
	@Override
	public void run() {
		try {
			wr.openDoor(who);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
// ---------------------------------------------------------------
class Washroom{

	public synchronized void openDoor(String name) throws InterruptedException {
		// 입장, 볼일 보는 중.... 퇴장
		System.out.println(name + "님이 입장");
		for(int i = 0; i<50000; i++) {
			if(i % 10000 == 0) {
				Thread.sleep(2000);
				System.out.println(name + "님이 볼일 보는 중......");
			}
		}
		System.out.println(name + "님이 퇴장");
	}
	
}
//---------------------------------------------------------------
public class SyncThreadTest {

	public static void main(String[] args) {
		Washroom wr = new Washroom();
		
		FamilyThread father = new FamilyThread(wr, "father");
		FamilyThread mother = new FamilyThread(wr, "mother");
		FamilyThread sister = new FamilyThread(wr, "sister");
		FamilyThread brother = new FamilyThread(wr, "brother");
		FamilyThread me = new FamilyThread(wr, "me");
		
		father.start();
		mother.start();
		sister.start();
		brother.start();
		me.start();
	}
}
