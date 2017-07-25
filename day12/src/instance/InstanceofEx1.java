package instance;
//instanceof를 이용한 연산 결과가 ture이면 참조 변수가 검사한 타입으로 형변환 가능
class AA{}
class BB extends AA{}
class CC extends AA{}
public class InstanceofEx1 {
public static void main(String[] args) {
	AA a=new AA();
	BB b=new BB();
	
	System.out.println(b instanceof AA);// true
	System.out.println(a instanceof CC);// false
	//System.out.println(b instanceof CC);
}
}
