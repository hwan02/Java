package exception;

class MyException extends Exception{
	public MyException() {
		System.out.println("미성년자 출입금지\n 집으로 가셔~\n");
	}
}
public class ExceptionEx4 {

	public static void main(String[] args) throws MyException {
		int age=Integer.parseInt(args[0]);
		
		// 던지기를 왜 해주는가? s가 붙지 않는 것은 사용자가 만들어주는 예외 처리 내가 하기 싫으니까 니가 알아가 처리해라
		if(age<19)		
			throw new MyException();
		else
			System.out.println("환영합니다. 호갱님~");
	}
}
