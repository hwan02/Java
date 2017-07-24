package inputex;
/* argument를 이용하여 입력 후 처리
 * 
 * $ java InputTest 3 103 강호동 C 75.3
 */
public class InputTest3 {

	public static void main(String[] args) {
		int eno=Integer.parseInt(args[0]);
		String ename = args[1];
		char dept = args[2].charAt(0);
		double score=Double.parseDouble(args[3]);
		
		System.out.printf("사원번호: %d\n사원이름: %s\n부서코드: %c\n입사성적: %.1f점\n", eno, ename, dept, score);
	}
}
