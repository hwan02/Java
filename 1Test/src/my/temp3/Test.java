package my.temp3;

public class Test {
	public static void main(String[] args) {
		Shape s = new Shape();
		s.area(); //이 메소드는 아무것도 없습니다. 기대하지말라고
		Circle c = new Circle();
		Rectangle r = new Rectangle();
		Triangle t = new Triangle();

		Printer out = new Printer();
		out.print(c);
		out.print(r);
		out.print(t);
		//out.print("hello");
	}
}
