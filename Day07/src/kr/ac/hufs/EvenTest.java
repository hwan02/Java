package kr.ac.hufs;

public class EvenTest {

	public static void main(String[] args) {
		new Even();
	}
}

class Even {
	int[] arr = { 4, 14, 7, 9, 28, 30, 34 };

	Even() {
	if(allEven(this.arr))
	{
		pln("배열 속의 모든 구성요소는 짝수입니다.");
	}else {
		pln("배열 속의 구성요소에는 최소 하나 이상의 홀수가 포함되어 있습니다.");
	}
	}
		// ??????????
		boolean allEven(int[] _arr) {
			boolean isallEven = true;
			
			for(int i =0; i<_arr.length; i++) {
				if(_arr[i] % 2 !=0) {
					isallEven = false;
				}
			}
			return isallEven;
	} 
		void pln(String _msg) {
			System.out.println(_msg);
		}
}
