package homework;

public class Homework3 {
	public static void main(String[] args) {
new Homework03();
	}
}

class Homework03{
	String name = "민들레";
	int kor = 90;
	int eng = 70;
	int mat = 75;
	 
	Homework03(){
		double sum = 0;
		double avg = 0;
		sum = (int) (kor + eng + mat);
		avg = (double) (sum/3);
		System.out.println("이름: " + name);
		System.out.println("합계점수: " + sum);
		System.out.println("평균점수: " + avg);
	}
}