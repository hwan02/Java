package kr.ac.hufs;

public class OverLoadingTest {

	public static void main(String[] args) {

	}
}

class Book {
	String name = "";
	int publishYear = 0;
	String author = "";

	// ������ �����ε� or ������ �ߺ�
	Book() {
		this("����", 1970, "�̻�");
	}

	Book(String _name, String _author) {
		this.name = _name;
		this.publishYear = 1970;
		this.author = _author;
	}

	// �Ű������� Ÿ���� ���� �ٸ��ų� ������ �޶�� ��.  
	// �Ű������� ������ ������ Ÿ���� ���� �ٸ��� ���.
	Book(String _name, int _publishYear, String _author) {
		this.name = _name;
		this.publishYear = 1970;
		this.author = _author;

	}

}