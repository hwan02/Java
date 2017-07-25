package interfaceex;

// interface
interface Cryable {
	abstract public void cry();
}

interface Flyable {
	abstract public void fly();
}

class Eagle implements Cryable, Flyable {
	@Override
	public void fly() {
		System.out.println("µ¶¼ö¸®°¡ ³¯¾Æ´Ù³à¿ä."); // 2
	}

	@Override
	public void cry() {
		System.out.println("²Ù¿¢²Ù¿¢~"); // 4
	}
}

public class InterfaceEx2 {

	public static void main(String[] args) {
		Eagle eg = new Eagle();
		eg.cry();
		eg.fly();
	}
}

// ÀÏ¹Ý Å¬·¡½º
/*
 * abstract class Cryable { abstract public void cry(); }
 * 
 * abstract class Flyable { abstract public void fly(); }
 * 
 * class Eagle extends Flyable {
 * 
 * @Override public void fly() { System.out.println("µ¶¼ö¸®°¡ ³¯¾Æ´Ù³à¿ä."); //2 new
 * CryableEx().cry(); //3 } class CryableEx extends Cryable{
 * 
 * @Override public void cry() { System.out.println("²Ù¿¢²Ù¿¢~"); //4 } } }
 * 
 * public class InterfaceEx2 {
 * 
 * public static void main(String[] args) { new Eagle().fly(); // 1 } }
 */
