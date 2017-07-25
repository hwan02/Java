package access1;

import access2.AccessEx3;
import access2.AccessEx4;

public class AccessEx1 extends AccessEx4 {
	private int x = 10;
	private int y = 20;

	public static void main(String[] args) {
		AccessEx1 aa = new AccessEx1();
		System.out.println(aa.x + " " + aa.y);
		
		AccessEx2 bb = new AccessEx2();
		System.out.println(bb.x + " " + bb.y);
				
		AccessEx3 cc = new AccessEx3();
		System.out.println(cc.x + " " + cc.y);
		
		//AccessEx4 dd = new AccessEx4();
		//System.out.println(dd.a + " " + dd.b);
		System.out.println(aa.a + " " + aa.b);
	}
}
