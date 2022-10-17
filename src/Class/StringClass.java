package Class;

import java.util.Scanner;

public class StringClass {
	public static void main(String[] args) {
		int aLength, bLength;
		char aChar, bChar;
		// 문자열 객체를 생성한다.
		String str1 = new String("Hello World ! ");
		String str2 = new String("Hello my name is juyoung");
		String str3 = str1 + str2;
		// 문자열 객체를 결합한다.
		System.out.println(str3);

		// aLength 변수에 str1 문자열 객체의 길이를 대입한다.
		aLength = str1.length();
		// bLength 변수에 str2 문자열 객체의 길이를 대입한다.
		bLength = str2.length();
		// 문자열의 길이를 출력한다.
		System.out.println(aLength);
		System.out.println(bLength);

		// 문자열 타입의 데이터에 index 값을 읽어온다.
		aChar = str1.charAt(10);
		bChar = str2.charAt(20);
		System.out.println("str1의 10번째 문자 > " + aChar);
		System.out.println("str2의 20번째 문자 > " + bChar);

		System.out.println("str1의 값을 대문자로 변경 > " + str1.toUpperCase());
		System.out.println("str1의 값을 소문자로 변경 > " + str1.toLowerCase());

		System.out.println("str1의 'e'를 'a'로 변환 > " + str2.replace('e', 'a'));
		System.out.println("------------------------------구분선------------------------------");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		// 문자열 값을 입력받는다.
		System.out.println(s);
		// trim(): 입력받은 문자열의 앞, 뒤 공백을 제거한다.
		System.out.println(s.trim());
		// subString(): 입력받은 문자열을 자른다. (EX: 5, 0~4)
		System.out.println(s.substring(5));
		// indexOf("문자열"): 입력받은 문자열의 index 번호를 확인한다. (EX: Hello, 4)
		System.out.println(s.indexOf("o"));
		// contains("문자열"): 입력받은 문자열에 해당 문자가 포함되어 있는지 확인한다. (EX: Hello, true를 반환한다)
		System.out.println(s.contains("H"));
		// split("구분자"): 구분자를 기준으로 문자열을 분할한다.
		/*  구분자: " "
		 * 입력 값: Hello My name is JuYoung
		 * 출력 값: arr[0]= Hello
		 * 출력 값: arr[1]= My
		 * 출력 값: arr[2]= name
		 * 출력 값: arr[3]= is
		 * 출력 값: arr[4]= juyoung
		 */
		String arr[] = s.split(" ");
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d]= %s\n", i, arr[i]);
		}
	}

}
