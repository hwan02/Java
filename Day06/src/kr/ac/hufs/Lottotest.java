package kr.ac.hufs;

public class Lottotest {

	public static void main(String[] args) {
		new Lotto();
	}
}

class Lotto {

	int[] lottoNum = new int[6];
	int randomNum;

	Lotto() {
		for (int i = 0; i < 6; i++) {
			randomNum = (int) (Math.random() * 45 + 1 );
			lottoNum[i] = randomNum; 
				 
			for (int j = 0; j < i; j++) {
					if (lottoNum[i] == lottoNum [j]) {
						randomNum = (int) (Math.random() * 45 + 1);
						lottoNum[i] = randomNum; 
				}

			}
			lottoNum[i] = randomNum;
		}

	for(

	int i = 0;i<lottoNum.length;i++)System.out.print(lottoNum[i]+" ");

}

}
