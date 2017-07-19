package kr.ac.hufs;

public class AbstractTest2 {
	public static void main(String[] args) {

	}
}

abstract class Shape {
	abstract void draw();

}

abstract class Line extends Shape {
	int dimention = 1;

	void draw() {
		System.out.println("³ª Line");
	}
}

class Rect2 extends Shape {
	int dimention = 2;

	void draw() {
		System.out.println("³ª Line");
	}

	class Circle2 extends Shape {
		int dimention = 2;

	void draw() {
		System.out.println("³ª Line");
}
