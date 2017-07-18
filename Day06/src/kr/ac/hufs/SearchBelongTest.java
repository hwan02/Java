package kr.ac.hufs;

import java.util.Scanner;

public class SearchBelongTest {

	public static void main(String[] args) {
	
		System.out.println("걸그룹 입력 수>> ");
		Scanner scan= new Scanner(System.in);
		int num = Integer.parseInt(scan.nextLine().trim());
		
		GirlStar[] gs = new GirlStar[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("이름, 나이, 소속>> ");
			String str = scan.nextLine();
			String[] allInfo = str.split(", ");
			String name = allInfo[0];
			int age = Integer.parseInt(allInfo[1]);
			String belong = allInfo[2];
			gs[i] = new GirlStar(name, age, belong);
		}
		
		System.out.println("저장되었습니다......");
//		찾아주는 작업
		for(;;) {
			System.out.println("이름 검색>> ");
			String sName = scan.nextLine();
			for(int j=0; j < num; j++) {
				if(sName.equals("exit")) {
					System.out.println("걸그룹 검색 프로그램을 종료합니다.");
					break;
				}
				//왜 gs를 넣는지?
				if(sName.equals(gs[j].name)) {
					System.out.println(gs[j].result());
					break;
				}else {
//					num-1????
					if(j == num-1) {
						System.out.println("조회하신 이름은 찾으실 수 없습니다.");
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
		return this.name + "는 " + this.age + "세이고, " + this.belong + " 소속입니다.";  
	}
}