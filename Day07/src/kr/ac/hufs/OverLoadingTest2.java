package kr.ac.hufs;

public class OverLoadingTest2 {

	public static void main(String[] args) {

	}
}

class Calc {
	int a = 0, b = 0; 

	// �żҵ� �����ε� or �żҵ� �ߺ�
	Calc(int _a, int _b) {
		this.a = _a;
		this.b = _b;
	}

	int operatorPlus() {
		return a+b;
	}
	int operatorPlus(int x, int y) {
		return x+y;
	}
	/* 
	String operatorPlus(int x, int y) {
		return String.valueOf(x+y);
	}
	*/
	/* �޼ҵ� �����ε� or �޼ҵ� �ߺ�
	 1. �Ű������� ������ �ٸ��ų�, Ÿ���� �޶����.
	 2. �Ű������� ������ ���� ���, Ÿ���� �޶�� �����ε����� �� �� �ִ�.
	 3. ���� Ÿ���� �ݵ�� ���ƾ� ��.
	*/
	int operatorSubstract() {
		return a-b;
	}
	/*double operatorSubstract() {
		return (double)(a-b);
	}
	*/
	Calc(String _name, String _author) {
		this.name = _name;
		this.publishYear = 1970;
		this.author = _author;
	}

	// �Ű������� Ÿ���� ���� �ٸ��ų� ������ �޶�� ��.  
	// �Ű������� ������ ������ Ÿ���� ���� �ٸ��� ���.
	Calc(String _name, int _publishYear, String _author) {
		this.name = _name;
		this.publishYear = 1970;
		this.author = _author;

	}

}