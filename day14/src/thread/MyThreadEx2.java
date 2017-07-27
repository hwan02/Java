package thread;

public class MyThreadEx2 extends Thread{ // Exceptio으로 던지기가 안 된다.
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
			} //30/1000초
		}
	}
	public static void main(String[] args) throws InterruptedException {
		MyThreadEx2 aa = new MyThreadEx2("one", 100);
		MyThreadEx2 bb = new MyThreadEx2("two", 100);
		MyThreadEx2 cc = new MyThreadEx2("three", 100);
		
		aa.start(); //start()는 실행할 준비를 하는 메서드, 이후 실행 준비가 완료되면 run()호출함
		bb.start();
		cc.start();
		/* start()는 쓰레드(VMThread)을 생성하고, 새롭게만들어진 Thread가 run()을 실행
		 * 기본적으로 main()쓰레드 1개는 수행되고 있음.. 합이 네개  
		 * 
		 */
	}
}
