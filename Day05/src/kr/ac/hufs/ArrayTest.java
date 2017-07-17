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
		// for each 구문
			for(int j : arr) {
				System.out.println(" " + j);
		}
			
			// for문에서 arr 이용시 1
			int length = arr.length;
			for(int i=0; i<5; i++) {
				System.out.println(" " + arr[i]);
			}
			// for문에서 arr 이용시 2 퍼포먼스에 차이가 난다 밑에가 느리다.
			for(int i=0; i< arr.length; i++) {
				System.out.println(" " + arr[i]);
			}
	}
}
