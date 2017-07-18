package kr.ac.hufs;

import java.util.Scanner;

public class EndtoendTest {
	public static void main(String[] args) {
		Endtoend game = new Endtoend();
		game.run();
	}
}

class Endtoend {
	Scanner scanner = new Scanner(System.in);
	String startWord = "�ڹ�";
	Player[] players;

	Endtoend() {
	}

	void createPlayers() {
		System.out.println("���ӿ� �����ϴ� �ο��� �� ���Դϱ�?");
		int playersNum = scanner.nextInt();
		// ???????
		players = new Player[playersNum];

		for (int i = 0; i < playersNum; i++) {
			System.out.println("�������� �̸��� �Է��ϼ���.");
			String name = scanner.nextLine();
			players[i] = new Player(name);
		}
	}
	void run() {
		createPlayers();
		String lastWord	= startWord;

		System.out.println("�����ϴ� �ܾ��" + lastWord + "�Դϴ�.");
//		???????????
		int next = 0;
		
		while(true) {
			String newWord = players[next].sayWord();
			// ! ????????
			if(!players[next].succeed(lastWord)) {
				System.out.println(players[next].getName()+ "�� �����ϴ�.");
				break;
			}
			next++;
			lastWord = newWord;
		}
	}
	class Player{
		Scanner scanner = new Scanner(System.in);
		String name;
		String word;
		
		Player(String name){
			this.name = name;
		}
		String getName() {
			return name;
		}
		String sayWord() {
			System.out.println(name + ">>" );
			word = scanner.nextLine();
			return word;
		}
		boolean succeed(String lastWord) {
			int lastIndex = lastWord.length() -1;
			if(lastWord.charAt(lastIndex) == word.charAt(0))
				return true;
			else
				return false;
		}
	}
}