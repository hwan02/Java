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
		System.out.println("¹Øº¯: " +base +"\n³ôÀÌ: " + height +"\n»ï°¢ÇüÀÇ ³ĞÀÌ´Â "+ (base*height/2));
	}
}