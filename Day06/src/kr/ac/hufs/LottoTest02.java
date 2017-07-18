package kr.ac.hufs;

public class LottoTest {

	public static void main(String[] args) {
		new Lotto();
	}
}

class Lotto {
	int[] lottoNum = new int[6];

	Lotto() {
		getRandomNum();
		int[] array = {100, 99, 86, 988, 19, 3, 88, 49};
		
		int[] sortingLottoNum = sortingSmall2Large(array);
		for (int i : sortingLottoNum) {
			System.out.print(i + " ");
		}

	}

	void getRandomNum() {
		for (int i = 0; i < lottoNum.length; i++) {
			lottoNum[i] = (int) (Math.random() * 45) + 1;
			for (int j = 0; j < i; j++) {
				if (lottoNum[i] == lottoNum[j]) {
					i--;
					break;
				}
			}
		}
	}

	int[] sortingSmall2Large(int[] _arr) {
		int[] arr = _arr;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	
	int[] sortingLarge2Small(int[] _arr) {
		int[] arr = _arr;
		for (int i = 0; i < lottoNum.length; i++) {
			for (int j = i + 1; j < lottoNum.length; j++) {
				if (lottoNum[i] < lottoNum[j]) {
					int temp = lottoNum[i];
					lottoNum[i] = lottoNum[j];
					lottoNum[j] = temp;
				}
			}
		}
		return arr;
	}

}