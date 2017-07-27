package thread;

class DemonTest extends MyThreadEx2{
	public DemonTest(String str, int num) {
		super(str, num);
	}

	@Override 
	public void run() {
		while(ture) {
			try {
				Thread.sleep(300);
				System.out.println("hello");
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
public class MyThreadEx3 { 
	public static void main(String[] args) throws InterruptedException {
		DemonTest th = new DemonTest();
		th.setDaemon(true); // ture:main thread가 종료되면 demon도 종료 
		th.start();
		
		int n=0;
		while(n<10) {
			n++;
			Thread.sleep(300);
		}
	}
}
