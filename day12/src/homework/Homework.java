package homework;

public class Homework {
	public static void main(String[] args) {
		Triangle t = new Triangle(10, 3);
		t.view();
	}
}

class Triangle{
	private int base;
	private int height;
	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;
	}
	public void view() {
		System.out.println("�غ�: " +base +"\n����: " + height +"\n�ﰢ���� ���̴� "+ (base*height/2));
	}
}