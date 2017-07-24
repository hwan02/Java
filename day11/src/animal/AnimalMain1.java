package animal;

import java.util.Scanner;

//정적바인딩(static binding) :컴파일 타임에 호출할 함수를 알고 있다

public class AnimalMain1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		Dog dd=null; Cat cc=null; Fish ff=null; Duck dk=null;
		while(true) {
			System.out.print("1.Dog 2.Cat 3.Fish 4.Duck 5.Exit\n선택 : ");
			n=sc.nextInt();
			
			switch(n) {
			case 1: dd=new Dog(); dd.speak(); dd.walk(); break;
			case 2: cc=new Cat(); cc.speak(); cc.walk(); break;
			case 3: ff=new Fish(); ff.speak(); ff.walk(); break;
			case 4: dk=new Duck(); dk.speak(); dk.walk(); break;
			default: System.out.println("*** 종료합니다 ***");
						sc.close();
						System.exit(0);
			}
		}

	}
	
	
	
	
	

}

