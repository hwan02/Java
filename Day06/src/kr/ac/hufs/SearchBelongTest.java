package kr.ac.hufs;

import java.util.Scanner;

public class SearchBelongTest {

	public static void main(String[] args) {
	
		System.out.println("�ɱ׷� �Է� ��>> ");
		Scanner scan= new Scanner(System.in);
		int num = Integer.parseInt(scan.nextLine().trim());
		
		GirlStar[] gs = new GirlStar[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("�̸�, ����, �Ҽ�>> ");
			String str = scan.nextLine();
			String[] allInfo = str.split(", ");
			String name = allInfo[0];
			int age = Integer.parseInt(allInfo[1]);
			String belong = allInfo[2];
			gs[i] = new GirlStar(name, age, belong);
		}
		
		System.out.println("����Ǿ����ϴ�......");
//		ã���ִ� �۾�
		for(;;) {
			System.out.println("�̸� �˻�>> ");
			String sName = scan.nextLine();
			for(int j=0; j < num; j++) {
				if(sName.equals("exit")) {
					System.out.println("�ɱ׷� �˻� ���α׷��� �����մϴ�.");
					break;
				}
				//�� gs�� �ִ���?
				if(sName.equals(gs[j].name)) {
					System.out.println(gs[j].result());
					break;
				}else {
//					num-1????
					if(j == num-1) {
						System.out.println("��ȸ�Ͻ� �̸��� ã���� �� �����ϴ�.");
					}
				}
			}
		}
	}
}

class GirlStar{
	String name = "";
	int age = 0;
	String belong = "";
	
	
	GirlStar(String _name, int _age, String _belong){
		this.name = _name;
		this.age = _age;
		this.belong = _belong;
	}
	String result() {
		return this.name + "�� " + this.age + "���̰�, " + this.belong + " �Ҽ��Դϴ�.";  
	}
}