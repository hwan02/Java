package kr.ac.hufs;

public class MultipleTest {

	public static void main(String[] args) {

		// ±¸±¸´Ü

		for (int i = 2; i < 10; i++) 
		{
			if (i == 5) 
			{
				continue; // break;
			}
			for (int j = 1; j < 10; j++) 
			{
				System.out.println(i + "x" + j + "=" + twoDigitalFormat(i * j));
			}
			System.out.println("***********");
		}
	}

	static String twoDigitalFormat(int _num) {
		return _num > 9 ? _num + "" : "0" + _num;
	}
}
