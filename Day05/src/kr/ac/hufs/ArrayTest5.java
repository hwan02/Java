package kr.ac.hufs;

import java.util.Scanner;

public class ArrayTest5 {

	public static void main(String[] args) {
		String[] str = {"����", "��κ�ʽ� ����", "���¿�", "��C"};
		String[] str2 = str;
		
		str2[1] = "�ǳ���"; 
			
		for(int i =0; i< str.length; i++) {
			System.out.print(str[i] + " ");
		}
		// �⺻���� ������ �������� �ּҰ��� �����ϱ� ������ ���� ���� ���´�. 
		System.out.println();
		for(int i =0; i< str2.length; i++) {
			System.out.print(str2[i] + " ");
		}
	}
}
