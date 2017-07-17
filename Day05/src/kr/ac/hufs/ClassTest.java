package kr.ac.hufs;

public class ClassTest {

}
class C {
	void m1() {
		int i = 0;
		for(;;) {
			if(i<5) pln ("i :" +i);
			else break;
			i++;
		}
	}

void m2() {
	int ii = 0;
	for(int i=0, j=0, k=0; (i+j+k)<10; j+=2) {
		ii++;
		pln("반복루트: i :" +i +", j :" + j ", k :" + k--);
	}
}
void pln(String str) {
	System.out.println(str);
}
public static void main(String[] args) {
	
	C c = new C();
	c.m2();
}
}