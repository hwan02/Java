package kr.ac.hufs; // ��Ű����

public class ClassTest // Ŭ������: ClassTest ���۰� �� {} 
{ 

	public static void main(String[] args) // public static void main ���� �Լ�, �ݵ�� �ϳ��� �־�� �� 
	{
		// String[] args �Ű�����, �Ķ����, ���������� �Ķ����
		Hufs hf = new Hufs();
		hf.setAge(24);
		

	}

}

class Hufs
{
	int age = 20; // int ������ ���� Ÿ��, age ������, 20 ������(���ͷ�) 
	              // ���� ����, Ŭ���� ������ �ڿ��� ����
	
	static String name = "����"; 
	//�޼ҵ�(�Լ�)
	void setAge(int _age) { // void: �޼ҵ� ������ ���� ���� ����, void �ǹ�: �� ��
		                    // setAge: �޼ҵ� ��
							// int _age: int �Ű����� Ÿ��, _age �Ű����� ��
							//               �� �޼ҵ忡 ���� �����ϴ� ���� ����
		this.age = _age; 
		// this.age: hufs�� ���� ���� age�� ����Ŵ
	}
	
	int getAge() { // int �Լ� ���� ��� ������ ���� Ÿ��
		int age = this.age; // ��������: ���� �޼ҵ� �������� ��ȿ
							// �翬�� ���������� ���� �������� ����
		return age;
	}
}