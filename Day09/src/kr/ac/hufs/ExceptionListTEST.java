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
			System.out.println("분자>> ");
			int dividend = scan.nextInt();
			System.out.println("분모>> ");
			int divisor = scan.nextInt();
			System.out.println("나누기 결과 몫" + dividend / divisor);
		} catch (ArithmeticException ae) {
			System.out.println("숫자 0으로 나누실 수 없습니다.");
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
			System.out.print("배열의 범위를 벗어나서 출력을 하실 수 없습니다..");
		}
	}
	// 예외 처리
	/*
	 * try{ 예외가 발생할 수 있는 실행문 }catch(예외를 처리할 선언문){ 예외 발생시 처리할 실행문 }finally{ 예외가 발생하던
	 * 하지 않던 실행할 실행문 } }
	 */
	// 자주 발생하는 예외
	// ArithmeticException: 정수를 0으로 나누었을 때 발생
	// NullPointException: null reference type variable 발생
	// String a = null;
	// a.indexOf("하하"); 여기서 NullPointException발생
	// classCastException: class 형변환시에 형변환할 수 없을 때 발생
	// OutOfMemoryException: 메모리가 부족한 경우 발생
	// ArrayIndexOutOfBoundsException: 배열의 인덱스 범위를 벗어난 경우
	// IOException: 입출력 동작 시 실패 하거나 인터럽션이 있을 때 발생
	// NumberFormatException: 숫자 타입으로 입력하지 않았거나 숫자로 변환 시 숫자타입이 아닐 때 발생
	// InputMismatchException: 스캐너에서 입력타입이 맞지 않을 때 발생
}