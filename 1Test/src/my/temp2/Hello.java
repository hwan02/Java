package my.temp2;

public class Hello {
 int i = 10;
 public static void main(String[] args) {
	Hello h = new Hello();
	Hello h2 = new Hello();
	h.i++;
	System.out.println(h.i);
	System.out.println(h2.i);
	int i = 100;
	System.out.println(i);
	h.m1();
	h2.m1();
	
}
 public void m1(){
	 int i = 1000;
	 System.out.println(i);
	 m2();
 }
 public void m2(){
	 int i = -1;
	 System.out.println(i);
 }
}
