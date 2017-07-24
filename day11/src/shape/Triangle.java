package shape;

public class Triangle extends Shape{

	public Triangle() {
		super();
	}

	public Triangle(int x, int y) {
		super(x, y);
	}
	@Override
	public double getSize() {
		return (double) (getX()*getY())/2;
	}
}
