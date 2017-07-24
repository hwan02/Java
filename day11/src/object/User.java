package object;
/* +: public, -:private, #:protected 
 * -name:String
 * -k:int
 * -e:int
 * -m:int
 * 
 * +setUse(name:String, k:int, e:int, m:int):void
 * +getTotal():int
 * +getUser():String
 */
public class User {
	private String name;
	private int k, e, m;
	
	public void setUser(String name, int k, int e, int m) {
		this.name = name;
		this.k=k;
		this.e=e;
		this.m=m;
	}
	public int getTotal() {
		return k+e+m;
	}
	public String getUser() {
		return "����� �̸���: " + name + "�̰� ������" + getTotal() + "���Դϴ�.";
		
	}
}
