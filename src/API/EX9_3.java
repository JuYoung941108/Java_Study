package API;

public class EX9_3 {
	public static void main(String[] args) {
		// 하나의 문자열을 여러 참조변수가 공유한다. (같은 주소값)
		String str1 = "abc"; String str2 = "abc";
		// "abc" 문자열을 담은 객체가 생성된다. (다른 주소값)
		String str3 = new String("abc"); String str4 = new String("abc");

		String result1 = str1 == str2 ? "true" : "false"; String result2 = str3 == str4 ? "true" : "false";
		String result3 = str1.equals(str2) ? "true" : "false"; String result4 = str3.equals(str4) ? "true" : "false";

		System.out.println("str1 == str2의 주소값이 같은가? > "+ result1);
		System.out.println("str3 == str4의 주소값이 같은가? > "+ result2);
		System.out.println("str1.equals(str2)의 대상의 내용이 같은가? > "+ result3);
		System.out.println("str3.equals(str4)의 대상의 내용이 같은가? > "+ result4);

		
	}

}
