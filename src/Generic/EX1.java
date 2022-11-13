package Generic;

import java.util.ArrayList;

public class EX1 {
	public static void main(String[] args) {
		// Object는 여러 종류의 타입을 저장할 수 있다.
//		ArrayList<Object> list = new ArrayList<Object>();
		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(10); // list.add(new Integer(10);
		list.add(20);
		list.add(30);
		// 지네릭 타입을 <Integer>로 명시했을 경우 아래와 같은 에러가 발생한다.
		// The method add(Integer) in the type ArrayList<Integer> is not applicable for the arguments (String)
//		list.add("40"); // String을 추가한다.

		// Index의 3번째 요소인 문자열 "40"을 Integer로 형변환한다.
		// java.lang.ClassCastException
//		Integer i = (Integer) list.get(3); // Compile OK

		// 지네릭 타입을 <Integer>로 명시했을 경우 형변환 생략이 가능하다.
		Integer i = list.get(2);

		System.out.println(list);

	}

}
