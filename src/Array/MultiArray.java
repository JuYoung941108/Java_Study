package Array;

public class MultiArray {
	public static void main(String[] args) {
		// 이차원 배열을 생성한다.
		// [행] [열]
		int[][] arr = new int[2][3];

		arr[0][0] = 10; arr[0][1] = 20;	arr[0][2] = 30;
		arr[1][0] = 11;	arr[1][1] = 12;	arr[1][2] = 13;

		System.out.println("행의 개수: " + arr.length);
		System.out.println("0번 행의 열 개수: " + arr[0].length);
		System.out.println("1번 행의 열 개수: " + arr[1].length);

		// 중첩 반복문
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}


		// 개량 반복문
		for (int a[] : arr) {
			for (int b : a) {
				System.out.print(b + " ");
			}
			System.out.println();
		}
	}

}
