package kr.ac.hufs;

public class ArrayTest2 {

	public static void main(String[] args) {
		// String �迭
		String[] str = new String[4]; 
		str[0] = "��";
		str[1] = "����";
		str[2] = "����";
		str[3] = "�ܿ�";
		
		for(String i : str) {
			System.out.print(" " + i);
		}
		
		System.out.println();
		
		String[] str2 = {"����", "��κ�ʽ� ����", "���¿�", "�峪��"};
		
		for(String i : str2) {
			System.out.print("[" + i + "] ");
		}
		
		
	}
}
