package kr.ac.hufs;

import java.util.Scanner;

public class AbstractTest3 {

	public static void main(String[] args) {
		//Calculator c = new Calculator();
		
		// abstract Ŭ������ �ν��Ͻ� ��ü�� ���� �� ����.
		// �׷��⿡ �ڽ�Ŭ�������� ����� �޾Ƽ� ����ȭ ��Ű�� �� ������,
		// �ν��Ͻ� ��ü�� ���� ���� ����.
		
		System.out.print("���� �Է��ϼ���(����[,] ����)>> ");
		Scanner scan = new Scanner(System.in);
		String inputNums = scan.nextLine().trim();
		String[] numArray = inputNums.split(",");
		int[] num = new int[numArray.length];
		for(int i=0; i<numArray.length; i++) {
			num[i] = Integer.parseInt(numArray[i]);
		}
		scan.close();
		
		GeniusCalulator gc = new GeniusCalulator();
		
		if(num.length == 2) {
			int addResult = gc.add(num[0], num[1]);
			int subtractResult = gc.subtract(num[0], num[1]);
			int mutiplyResult = gc.mutiply(num[0], num[1]);
			int divideResult = gc.divide(num[0], num[1]);
			System.out.println("��>> " + addResult);
			System.out.println("��>> " + subtractResult);
			System.out.println("����>> " + mutiplyResult);
			System.out.println("������>> " + divideResult);
		}else {
			// �迭�� ��, ��, ��, ������
			int arrSumRes = gc.arrAdd(num);
			System.out.println("�迭�� ��>> " + arrSumRes);
			int arrSubstractRes = gc.arrSubstract(num);
			System.out.println("�迭�� ��>> " + arrSubstractRes);
			int arrMultiplyRes = gc.arrMultiply(num);
			System.out.println("�迭�� ����>> " + arrMultiplyRes);
			int arrDivideRes = gc.arrDivide(num);
			System.out.println("�迭�� ������>> " + arrDivideRes);
		}
	}
}


abstract class Calculator{
	int a=0,b=0;
	
	abstract int add(int _a, int _b);
	abstract int subtract(int _a, int _b);
	abstract int mutiply(int _a, int _b);
	abstract int divide(int _a, int _b);
}

class GeniusCalulator extends Calculator{
	int[] numArr;
	
	GeniusCalulator(){}
	
	GeniusCalulator(int[] _numArr){
		this.numArr = _numArr;
	}
	
	int arrAdd(int[] _arr) {
		int sum =0;
		for(int i=0; i<_arr.length; i++) {
			sum += _arr[i];
		}
		return sum;
	}
	
	int arrSubstract(int[] _arr) {
		int res=_arr[0];
		for(int i=1; i<_arr.length; i++) {
			res -= _arr[i];
		}
		return res;
	}
	
	int arrMultiply(int[] _arr) {
		int res=_arr[0];
		for(int i=1; i<_arr.length; i++) {
			res *= _arr[i];
		}
		return res;
	}
	
	int arrDivide(int[] _arr) {
		int res=_arr[0];
		for(int i=1; i<_arr.length; i++) {
			res /= _arr[i];
		}
		return res;
	}
	
	@Override
	int add(int _a, int _b) {
		return _a+_b;
	}

	@Override
	int subtract(int _a, int _b) {
		return _a-_b;
	}

	@Override
	int mutiply(int _a, int _b) {
		return _a*_b;
	}

	@Override
	int divide(int _a, int _b) {
		return _a/_b;
	}
}