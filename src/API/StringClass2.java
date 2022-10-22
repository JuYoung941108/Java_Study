package API;

public class StringClass2 {
	public static void main(String[] args) {

		// String(String s): 주어진 문자열을 갖는 String 인스턴스를 생성한다.
		String str = new String("Hello");
		System.out.println(str);

		// String(char[] value): 주어진 문자열(Value)을 갖는 String 인스턴스를 생성한다.
		char[] c = { 'H', 'e', 'l', 'l', 'o' };
		String s = new String(c);
		System.out.println(s);

		// String(StringBuffer buf): StringBuffer 인스턴스가 갖고있는 문자열과 같은 내용의 String 인스턴스를 생성한다.
		StringBuffer sb = new StringBuffer("Hello");
		String s2 = new String(sb);
		System.out.println(s2);

		// char charAt(int index): 지정된 위치(index)에 있는 문자를 알려준다.
		String s3 = "Hello";
		String s4 = "12345";
		char c2 = s3.charAt(1);
		char c3 = s4.charAt(2);
		System.out.println(c2);
		System.out.println(c3);

		// int compareTo(String str): 문자열(str)과 사전순서로 비교한다.
		// 같으면 0, 사전순으로 이전이면 -1, 이후면 1을 출력한다.
		int i = "aaa".compareTo("aaa");
		int i2 = "aaa".compareTo("bbb");
		int i3 = "bbb".compareTo("aaa");
		System.out.println(i);
		System.out.println(i2);
		System.out.println(i3);
	}

}
