package Collection;

import java.util.Arrays;

public class EX6 {
	public static void main(String[] args) {
		// 배열과 2차원 배열을 생성한다.
		int[] arr = { 0, 1, 2, 3, 4 };
		int[][] arr2D = { { 11, 12, 13 }, { 21, 22, 23 } };

		// Arrays.toString: 배열의 요소들을 문자열로 출력한다.
		System.out.println("arr= " + Arrays.toString(arr));
		// Arrays.deepToString: 2차원 배열의 요소들을 문자열로 출력한다.
		System.out.println("arr2D= " + Arrays.deepToString(arr2D));

		System.out.println();

		// Arrays.copyOf(복사할 배열명, 복사할 배열명.length)
		// 배열의 길이(.length == 5)만큼 배열을 복사한다.
		int[] arr2 = Arrays.copyOf(arr, arr.length);
		System.out.println("arr2= " + Arrays.toString(arr2));
		// Arrays.copyOf(복사할 배열명, 복사할 인덱스 값)
		// 배열의 요소를 3개까지 복사한다.(index 0~2 -> 1, 2, 3)
		int[] arr3 = Arrays.copyOf(arr, 3);
		System.out.println("arr3= " + Arrays.toString(arr3));
		// Arrays.copyOf(복사할 배열명, 복사할 인덱스 값)
		// 배열의 인덱스 값 7까지 복사 후, 나머지 값(빈 값)은 0으로 채워진다.
		int[] arr4 = Arrays.copyOf(arr, 7);
		System.out.println("arr4= " + Arrays.toString(arr4));
		// Arrays.copyOfRange(복사할 배열명, 복사할 인덱스 값, 복사할 인덱스 값)
		// 배열을 index 위치 2~3까지 복사한다.(4는 제외된다)
		// 2: 2, 3: 3, 4: 제외
		int[] arr5 = Arrays.copyOfRange(arr, 2, 4);
		System.out.println("arr5= " + Arrays.toString(arr5));
		// Arrays.copyOfRange(복사할 배열명, 복사할 인덱스 값, 복사할 인덱스 값)
		// 배열을 index 위치 0~6까지 복사한다.(7은 제외된다)
		// 0: 0, 1: 1, 2: 2, 3: 3, 4: 4, 5: 0, 6: 0, 7: 제외
		int[] arr6 = Arrays.copyOfRange(arr, 0, 7);
		System.out.println("arr6= " + Arrays.toString(arr6));

		System.out.println();

		// 배열의 길이가 5인 배열을 생성한다.
		int[] arr7 = new int[5];
		// fill(요소를 채울 배열명, 요소 값)
		// arr7의 요소를 '9'로 채운다. [9, 9, 9, 9, 9]
		Arrays.fill(arr7, 9);
		System.out.println("arr7= " + Arrays.toString(arr7));
		// setAll(요소를 채울 배열명, 함수형 인터페이스 선언)
		// 람다식을 이용해 arr7의 요소를 random 값으로 받는다.
		Arrays.setAll(arr7, i -> (int) (Math.random() * 6 + 1));
		System.out.println("arr7= " + Arrays.toString(arr7));

		System.out.println();

		// 배열 arr7의 길이만큼 i가 반복 수행된다.
		for (int i : arr7) {
			// char형의 배열을 선언한다.
			char[] graph = new char[i];
			/*
			 * graph 배열의 요소를 '*'로 채운다.
			 * for문이 반복되는 동안 i 값이 바뀔 때마다 찍히는 '*'의 개수도 달라진다.
			 * == graph 배열에 채워지는 '*'의 개수도 달라진다.
			 */
			Arrays.fill(graph, '*');
			// graph의 배열 요소와 graph에 담긴 각 인덱스의 값(i)을 출력한다.
			System.out.println(new String(graph) + i);
		}

		System.out.println();

		// String형의 배열을 선언후, graph의 숫자만큼 별을 출력한다.
		for (int i : arr7) {
			String[] graphTest = new String[i];
			Arrays.fill(graphTest, "*");
//			Arrays.toString(graphTest).replaceAll(",", "");
			System.out.println(Arrays.toString(graphTest) + i);

		}

		System.out.println();

		String[][] str2D = new String[][] { { "aaa", "bbb" }, { "AAA", "BBB" } };
		String[][] str2D2 = new String[][] { { "aaa", "bbb" }, { "AAA", "BBB" } };

		System.out.println(Arrays.equals(str2D, str2D2));
		System.out.println(Arrays.deepEquals(str2D, str2D2));

		System.out.println();

		// char형의 배열을 선언 후, 초기화한다.
		char[] chArr = { 'A', 'D', 'C', 'B', 'E' };

		System.out.println("<SORT>");
		// 배열 정렬 전
		System.out.println("===== Before sorting =====");
		System.out.println("chArr= " + Arrays.toString(chArr));
		/*
		 * 정렬을 하지않고 'binarySerch'를 하게 되면 잘못된 결과가 나온다.
		 * 때문에, 'binarySerch'를 하기 전에는 반드시 정렬(sort)을 해줘야 한다.
		 * Arrays.binarySearch(정렬할 배열명, '특정 요소 값') 
		 * chArr 배열에 있는 'B' 요소를 찾는다. 
		 */
		System.out.println("index of B= " + Arrays.binarySearch(chArr, 'B'));
		System.out.println("===== After sorting =====");
		// 배열 정렬 후
		Arrays.sort(chArr);
		System.out.println("chArr= " + Arrays.toString(chArr));
		System.out.println("index of B= " + Arrays.binarySearch(chArr, 'B'));
	}

}
