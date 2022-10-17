package Array;

import java.util.Arrays;

public class ArrayCopyTest {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30 };

		// 얕은 복사: 위치 값을 복사한다.
		int[] arr2 = arr;

		int[] arr3 = new int[3];
		for (int i = 0; i < arr3.length; i++) {
			// 깊은 복사: 데이터 값을 복사한다.
			arr3[i] = arr[i];
		}

		// 깊은 복사: 데이터 값을 복사한다.
		int[] arr4 = Arrays.copyOf(arr, arr.length);

		// Arrays.toString(배열변수명): 배열의 내용을 문자열로 출력한다.
		System.out.println("arr: " + Arrays.toString(arr));
		System.out.println("arr2: " + Arrays.toString(arr2));
		System.out.println("arr3: " + Arrays.toString(arr3));
		System.out.println("arr4: " + Arrays.toString(arr4));

		System.out.println();

		arr4[0] = 100;
		arr4[1] = 200;
		arr4[2] = 300;

		for (int i : arr4) {
			System.out.print(i + " ");
		}
	}

}
