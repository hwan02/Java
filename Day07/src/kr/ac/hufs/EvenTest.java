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
		pln("�迭 ���� ��� ������Ҵ� ¦���Դϴ�.");
	}else {
		pln("�迭 ���� ������ҿ��� �ּ� �ϳ� �̻��� Ȧ���� ���ԵǾ� �ֽ��ϴ�.");
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
