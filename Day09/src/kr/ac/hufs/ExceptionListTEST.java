package kr.ac.hufs;

import java.util.Scanner;

public class ExceptionListTEST {

	public static void main(String[] args) {
		new ExceptionList();
	}
}

class ExceptionList {

	ExceptionList() {
		ArimaticsException();
		ArrayIndexOutOfBoundsException();
	}

	void ArimaticsException() {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("����>> ");
			int dividend = scan.nextInt();
			System.out.println("�и�>> ");
			int divisor = scan.nextInt();
			System.out.println("������ ��� ��" + dividend / divisor);
		} catch (ArithmeticException ae) {
			System.out.println("���� 0���� ������ �� �����ϴ�.");
		} finally {
			scan.close();
		}
	}

	void ArrayIndexOutOfBoundsException() {
		int[] arr = { 98, 99, 100, 90, 80 };
		try {
			for (int i = 0; i <= arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
		} catch (ArrayIndexOutOfBoundsException aioobe) {
			System.out.print("�迭�� ������ ����� ����� �Ͻ� �� �����ϴ�..");
		}
	}
	// ���� ó��
	/*
	 * try{ ���ܰ� �߻��� �� �ִ� ���๮ }catch(���ܸ� ó���� ����){ ���� �߻��� ó���� ���๮ }finally{ ���ܰ� �߻��ϴ�
	 * ���� �ʴ� ������ ���๮ } }
	 */
	// ���� �߻��ϴ� ����
	// ArithmeticException: ������ 0���� �������� �� �߻�
	// NullPointException: null reference type variable �߻�
	// String a = null;
	// a.indexOf("����"); ���⼭ NullPointException�߻�
	// classCastException: class ����ȯ�ÿ� ����ȯ�� �� ���� �� �߻�
	// OutOfMemoryException: �޸𸮰� ������ ��� �߻�
	// ArrayIndexOutOfBoundsException: �迭�� �ε��� ������ ��� ���
	// IOException: ����� ���� �� ���� �ϰų� ���ͷ����� ���� �� �߻�
	// NumberFormatException: ���� Ÿ������ �Է����� �ʾҰų� ���ڷ� ��ȯ �� ����Ÿ���� �ƴ� �� �߻�
	// InputMismatchException: ��ĳ�ʿ��� �Է�Ÿ���� ���� ���� �� �߻�
}