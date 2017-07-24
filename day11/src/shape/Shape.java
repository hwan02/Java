package shape;

public class Shape {
	private int x;
	private int y;

	public Shape(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Shape() {
		super();
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double getSize() {
		return 0.0;
	}
}
