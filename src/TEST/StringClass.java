package TEST;

import java.util.Scanner;

public class StringClass {
	String str;
	static String[] text = new String[4];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		StringClass stringClass = new StringClass();

		for (int i = 0; i <= text.length; i++) {
			System.out.println(i + ". 문자열을 입력하세요.");
			stringClass.str = sc.nextLine();
			text[i] = stringClass.str;
			System.out.println(text[i]);
			System.out.println(text[i].contains("열혈"));
		}
	}

//	public static boolean Iscontain(String str, String[] text) {
//		String s = "열혈";
//
//		for (int i = 0; i < text.length; i++) {
//			text[i].contains(s);
//			if (text[i].contains(s)) {
//				System.out.println("test");
//			}
//			return true;
//		}
//		return false;
//
//	}
}
