package kr.ac.hufs;

public class Book {

	public static void main(String[] args) {
		Book2[] mbArr = new Book2[5];
		mbArr[0] = new Book2("������ ���̱�", "����ī�� �Ϸ�Ű");
		mbArr[1] = new Book2("�θ��� �̾߱�", "�ÿ��� ������");
		mbArr[2] = new Book2("���丣��", "�� ����");
		mbArr[3] = new Book2("After you", "���� �𿹽�");
		mbArr[4] = new Book2("���̾� ��ȭ���� ����", "�����ó� ���̰�");

		for (int i = 0; i < mbArr.length; i++) {
			System.out.println("�迭[" + i + "]: " + mbArr[i].name + "[" + mbArr[i].author + "]");
		}
		Book2[] mbArr2 = { new Book2("ȫ�浿", "���"), new Book2("����", "��������"), new Book2("��", "��������"),
				new Book2("�������������� ����", "������ ������"), new Book2("������", "������") };

		for (int i = 0; i < mbArr2.length; i++) {
			System.out.println("�迭[" + i + "]: " + mbArr2[i].name + "[" + mbArr2[i].author + "]");
		}
	}
}

class Book2 {
	String name = "";
	String author = "";

	Book2() {

	}

	Book2(String _name, String _author) {
		this.name = _name;
		this.author = _author;

	}

	void setAll(String _name, String _author) {
		this.name = _name;
		this.author = _author;
	}
}
