package kr.ac.hufs;

public class ObjectArray2 {

	public static void main(String[] args) {
		Member2[] mbArr2 = new Member2[5];
		mbArr2[0] = new Member2("������ ���̱�", "����ī�� �Ϸ�Ű");
		mbArr2[1] = new Member2("�θ��� �̾߱�", "�ÿ��� ������");
		mbArr2[2] = new Member2("���丣��", "�� ����");
		mbArr2[3] = new Member2("After you", "���� �𿹽�");
		mbArr2[4] = new Member2("���̾� ��ȭ���� ����", "�����ó� ���̰�");
		
		
		for(int i = 0; i < mbArr2.length; i++) {
			System.out.println("�迭["+i+"]: " + mbArr2[i].name + "[" + mbArr2[i].author+"]" );
		}
	}
}

class Member2 {
	String name = "";
	String author = "";

	Member2() {

	}

	Member2(String _name, String _author) {
		this.name = _name;
		this.author = _author;

	}

	void setAll(String _name, String _author) {
		this.name = _name;
		this.author = _author;
	}
}
