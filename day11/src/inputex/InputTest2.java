package inputex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* [����]
 * A���� �Է��Ͻÿ�: 15
 * B���� �Է��Ͻÿ�: 10
 * 
 * 15 + 10 = 25
 *  
 */
public class InputTest2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a, b;
		System.out.println("A ���� �Է��Ͻÿ�");
		a =Integer.parseInt(br.readLine());
		System.out.println("b ���� �Է��Ͻÿ�");
		b =Integer.parseInt(br.readLine());
		System.out.println("\n" + a +"+"+  b +  "=" + "" + (a+b)  );
	}
}

