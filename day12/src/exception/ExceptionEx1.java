package exception;

/* $java ExceptionEx1 2 ==> 2
 * $java ExceptionEx1 0 ==> 0���� ���� �� �����ϴ�.
 * $java ExceptionEx1 a ==> ���ڷ� �ٲ� �� �����ϴ�.
 * $java ExceptionEx1   ==> �Էµ� ���� �����ϴ�.
 */
public class ExceptionEx1 {

	public static void main(String[] args) {
		int var = 5;
		
		try {
		int n = Integer.parseInt(args[0]);
		System.out.println(var / n);
		} catch(Exception e) {
			System.out.println("�Էµ� ���� ������ �ֽ��ϴ�.");
		}
		
		
		//---------------------------------------
		// ��ü�� ��������� �Ѵ�. e 
		/*try 
		{
			int n = Integer.parseInt(args[0]);
			System.out.println(var / n);
		} catch (ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�.");
		} catch(NumberFormatException e) {
			System.out.println("���ڷ� �ٲ� �� �����ϴ�.");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�Էµ� ���� �����ϴ�.");
		} finally {
			System.out.println("** ������ ����� **");
		}*/
	}
}
