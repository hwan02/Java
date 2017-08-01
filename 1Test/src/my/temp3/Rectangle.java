package my.temp3;

public class Rectangle extends Shape {
	int w =4,h =5;
	
	public void areaRec(){
		System.out.println("사각형의 넓이:"+(h*w));
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		
	}
}
