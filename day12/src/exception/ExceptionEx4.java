package exception;

class MyException extends Exception{
	public MyException() {
		System.out.println("�̼����� ���Ա���\n ������ ����~\n");
	}
}
public class ExceptionEx4 {

	public static void main(String[] args) throws MyException {
		int age=Integer.parseInt(args[0]);
		
		// �����⸦ �� ���ִ°�? s�� ���� �ʴ� ���� ����ڰ� ������ִ� ���� ó�� ���� �ϱ� �����ϱ� �ϰ� �˾ư� ó���ض�
		if(age<19)		
			throw new MyException();
		else
			System.out.println("ȯ���մϴ�. ȣ����~");
	}
}
