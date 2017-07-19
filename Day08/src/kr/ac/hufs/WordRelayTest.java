package kr.ac.hufs;

import java.util.Scanner;

public class WordRelayTest {

	public static void main(String[] args) {
		System.out.print("������>> ");
		Scanner scan = new Scanner(System.in);
		String[] playerArr = scan.nextLine().trim().split(",");
		new WordRelay(playerArr, scan);
	}
}

class WordRelay{
	String[] playerArr;
	String[] wordDatabase = new String[100];
	Scanner scan;
	
	WordRelay(String[] _playerArr, Scanner _scan){
		this.playerArr = _playerArr;
		this.scan = _scan;
		startGame();
	}
	
	void startGame() {
		System.out.print(this.playerArr[0] + ">> ");
		String nWord = scan.nextLine().trim();
		wordDatabase[0] = nWord;
		
		aa:
		for(int i=1;i<wordDatabase.length;i++) {
			System.out.print(this.playerArr[i%playerArr.length] + ">> ");
			nWord = scan.nextLine().trim();
			wordDatabase[i] = nWord;
			
			if(wordDatabase[i].substring(0, 1).equals(wordDatabase[i-1].substring(wordDatabase[i-1].length()-1, wordDatabase[i-1].length()))) {
				for(int j=0; j<i; j++) {
					if(wordDatabase[j].equals(nWord)) {
						System.out.println("������ �̹� ���� �ܾ��Դϴ�.");
						System.out.println(playerArr[i%playerArr.length] + " �����ϴ�.");
						break aa;
					}
				}	
			}else {
				System.out.println("�����ձ� ��Ģ�� ����̽��ϴ�.");
				System.out.println(playerArr[i%playerArr.length] + " �����ϴ�.");
				break;
			}
		}
		
		
	}
	
}

