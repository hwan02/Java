package shape;

public class ShapeMain {

	public static void main(String[] args) {
		// 동적 바인딩
		Shape sh = null;
		sh = new Rectangle(4, 5);
		System.out.println("사각형의 넓이: " + sh.getSize());
		
		sh = new Triangle(3, 7);
		System.out.println("삼각형의 넓이: " + sh.getSize());
		// 정적바인딩 
		Rectangle rr = new Rectangle(4, 5);
		System.out.println("사각형의 넓이: " + rr.getSize());
		
		Triangle tt = new Triangle(3, 7);
		System.out.println("삼각형의 넓이: " + tt.getSize());
	}
}
