package kr.ac.hufs;

public class LongShortWordTest {

	public static void main(String[] args) {
		new Words();
	}
}

class Words {
	String str = "���ι�����,�ҳ�ô�,������ũ,������̵�ɽ�,F(x),������,���̿�����,���,�������� ���̵�";
	int longestWordLength = 0;
	int shortestWordLength;
	
	
	Words() {

		String[] arr = str.split(",");
		System.out.println("�ɱ׷� ��: " + arr.length);
		System.out.println("���� ��ܾ ���� �ɱ׷��� �˻��մϴ�....");
		String longestWordStr = longestWord(arr);

		System.out.println("���� ��ܾ� �ɱ׷�>> " + longestWordStr);
		System.out.println("���� ��ܾ� �ɱ׷� �ܾ��>> " + longestWordLength);

		shortestWordLength = longestWordLength;
		
		String shortestWordStr = shortestWord(arr);
		System.out.println("���� ª�� �ܾ� �ɱ׷�>> " + shortestWordStr);
		System.out.println("���� ª�� �ܾ� �ɱ׷� �ܾ��>> " + shortestWordLength);


	}

	String longestWord(String[] _arr) {
		String[] arr = _arr;
		String result = "";
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() > longestWordLength) {
				longestWordLength = arr[i].length();
				result = arr[i];
			} else if (arr[i].length() == longestWordLength) {
				result += ", " + arr[i];
			}
		}
		return result;
	}
	
	
	String shortestWord(String[] _arr) {
		String[] arr = _arr;
		String result = "";
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() < shortestWordLength) {
				shortestWordLength = arr[i].length();
				result = arr[i];
			} else if (arr[i].length() == shortestWordLength) {
				result += ", " + arr[i];
			}
		}
		return result;
	}

}