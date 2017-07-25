package exception;

// unchecked exception: 명시적 예외처리 필요 없음, runtime exception
// 종류는 NullPointerException, IllegalArgumentException, 밑에꺼, SystemException
public class ExceptionEx2 {

	public static void main(String[] args) {
		int[] num = { 10, 20, 30 };
		// foreach를 사용 안하고 했을 때 예외가 발생
//		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(num[i]);
			}
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("배열 갯수 초과");
//		}
	}
}
