package API;

public class StringClass3 {
	public static void main(String[] args) {

		String s = "Hello";

		// String concat(String str): 문자열(str)을 뒤에 덧붙인다.
		String s2 = s.concat(" World");
		System.out.println(s2);

		// boolean contains(CharSequence s): 지정된 문자열(s)이 포함되어 있는지를 확인한다.
		boolean b = s.contains("H");
		System.out.println(b);

		// boolean endWith(String suffix): 지정된 문자열(suffix)로 끝나는지 검사한다.
		String file = "Hello.txt";
		boolean b2 = file.endsWith("txt");

		// boolean equlas(Object obj): 매개변수로 받은 문자열(obj)과 String 인스턴스의 문자열을 비교한다.
		// obj가 String이 아니거나 문자열이 다르면 false를 반환한다.
		boolean b3 = s.equals("Hello");
		boolean b4 = s.equals("hello");
		System.out.println(b2);
		System.out.println(b3);

		// boolean equlasIgnoreCase(String str): 문자열과 String 인스턴스의 문자열을 대소문자 구분없이 비교한다.
		boolean b5 = s.equalsIgnoreCase("hEllo");
		boolean b6 = s.equalsIgnoreCase("hellO");
		System.out.println(b5);
		System.out.println(b6);

		// int index(int ch): 주어진 문자(ch)가 문자열에 존재하는 확인하여 위치(index)를 알려준다.
		// index는 0부터 시작하며 못찾으면 -1을 반환한다.
		int idx = s.indexOf('o');
		int idx2 = s.indexOf('w');
		System.out.println(idx);
		System.out.println(idx2);
	}

}
