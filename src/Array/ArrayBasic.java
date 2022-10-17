package Array;

public class ArrayBasic {
	public static void main(String[] args) {
		// 배열의 길이가 5인 int형 1차원 배열을 생성한다.
		int[] arr = new int[5];
		arr[0] = 1;	arr[1] = 2;	arr[2] = 3;	arr[3] = 4;	arr[4] = 5;

		// for문으로 arr 배열에 있는 값을 출력한다.
		for (int i = 0; i < arr.length; i++) {System.out.print(arr[i] + " ");}

		System.out.println();

		// forEach문으로 arr 배열에 있는 값을 출력한다.
		for (int val : arr) {System.out.print(val + " ");}

		System.out.println();

		// 배열의 길이가 5인 double형 1차원 배열을 생성한다.
		double[] arr2 = new double[5];

		// 배열의 길이가 5인 float형 1차원 배열을 생성한다.
		// 배열의 참조변수와 인스턴스를 분리해서 생성한다.
		float[] arr3;
		arr3 = new float[5];

		// 배열변수명.length: 배열 길이에 대한 정보를 얻는다.
		// 값을 읽을 수만 있으며, 변경할 수는 없다.
		System.out.println("배열 arr의 길이 > " + arr.length);
		System.out.println("배열 arr2의 길이 > " + arr2.length);
		System.out.println("배열 arr3의 길이 > " + arr3.length);

	}

}
