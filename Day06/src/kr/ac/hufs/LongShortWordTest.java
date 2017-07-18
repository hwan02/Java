package kr.ac.hufs;

public class LongShortWordTest {

	public static void main(String[] args) {
		new Words();
	}
}

class Words {
	String str = "나인뮤지스,소녀시대,에이핑크,브라운아이드걸스,F(x),마마무,아이오아이,라붐,서태지와 아이들";
	int longestWordLength = 0;
	int shortestWordLength;
	
	
	Words() {

		String[] arr = str.split(",");
		System.out.println("걸그룹 수: " + arr.length);
		System.out.println("가장 긴단어를 가진 걸그룹을 검색합니다....");
		String longestWordStr = longestWord(arr);

		System.out.println("가장 긴단어 걸그룹>> " + longestWordStr);
		System.out.println("가장 긴단어 걸그룹 단어수>> " + longestWordLength);

		shortestWordLength = longestWordLength;
		
		String shortestWordStr = shortestWord(arr);
		System.out.println("가장 짧은 단어 걸그룹>> " + shortestWordStr);
		System.out.println("가장 짧은 단어 걸그룹 단어수>> " + shortestWordLength);


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