package Array;

class ArrayUtil {
	static int[] c;

	public static int[] concat(int[] a, int[] b) {
		c = new int[a.length + b.length];

		int i;

		for (i = 0; i < a.length; i++) {

			c[i] = a[i];
		}

		for (i = 0; i < b.length; i++) {

			c[i + a.length] = b[i]; // *
		}

		return c;
	}

	public static void print(int[] a) {
		for (int i = 0; i < a.length; i++) {

		}
	}
}

public class AraryUtilClassTest {
	public static void main(String[] args) {
		int[] arr1 = { 1, 5, 7, 9 };
		int[] arr2 = { 3, 6, -1, 100, 77 };
		int[] arr3 = ArrayUtil.concat(arr1, arr2);
		ArrayUtil.print(arr3);

	}

}
