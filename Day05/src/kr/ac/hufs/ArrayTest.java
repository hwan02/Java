package kr.ac.hufs;

public class ArrayTest {

	public static void main(String[] args) {
		int[] arr = new int[5];
		int arr2[] = new int[5];
		
		arr[1] = 100;
		arr[3] = 90;
		arr[4] = 100;
		arr[2] = 90;
		arr[0] = 90;
		/*for(int i=0; i<5; i++) {
			System.out.println(" " + arr[i]);*/
		// for each ����
			for(int j : arr) {
				System.out.println(" " + j);
		}
			
			// for������ arr �̿�� 1
			int length = arr.length;
			for(int i=0; i<5; i++) {
				System.out.println(" " + arr[i]);
			}
			// for������ arr �̿�� 2 �����ս��� ���̰� ���� �ؿ��� ������.
			for(int i=0; i< arr.length; i++) {
				System.out.println(" " + arr[i]);
			}
	}
}
