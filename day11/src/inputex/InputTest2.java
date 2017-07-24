package inputex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* [문제]
 * A값을 입력하시오: 15
 * B값을 입력하시오: 10
 * 
 * 15 + 10 = 25
 *  
 */
public class InputTest2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a, b;
		System.out.println("A 값을 입력하시오");
		a =Integer.parseInt(br.readLine());
		System.out.println("b 값을 입력하시오");
		b =Integer.parseInt(br.readLine());
		System.out.println("\n" + a +"+"+  b +  "=" + "" + (a+b)  );
	}
}

