package thread;

public class MyThreadEx1 {
	String str;
	int num;
	
	public MyThreadEx1(String str, int num) {
		this.str=str;
		this.num=num;
	}
	public void viwe() throws InterruptedException {
		for(int i=0; i <= num; i++) {
			System.out.println(str + " : " + i);
			Thread.sleep(30); //30/1000ÃÊ
		}
	}
	public static void main(String[] args) throws InterruptedException {
		MyThreadEx1 aa = new MyThreadEx1("one", 100);
		MyThreadEx1 bb = new MyThreadEx1("two", 100);
		MyThreadEx1 cc = new MyThreadEx1("three", 100);
		
		aa.viwe();
		bb.viwe();
		cc.viwe();
	}
}
