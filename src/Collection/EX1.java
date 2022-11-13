package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class EX1 {
	public static void main(String[] args) {
		// 기본 길이(용량, Capacity)가 10인 ArrayList를 생성한다.
		ArrayList list1 = new ArrayList(10);
		
		/*
		 * list1.add(5); 라고 써도 상관은 없다.
		 * 킹치만 autoboxing에 의해 기본형이 참조형으로 자동 변환되기 때문에
		 * list1.add(5); -> list1.add(new Integer(5));가 맞다.
		 * Integer, Long, Double, Float..
		 * add: 인자로 전달된 객체를 리스트에 추가한다.
		 */
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));

		/*
		 * subList: List의 일부를 뽑아내서 List를 생성한다.(읽기 전용)
		 * 1,4: 범위는 1, 2, 3까지이며 4는 생략된다.(출력 값: 4, 2, 0)
		 * ArrayList list2 = new ArrayList(list1.subList(1, 4)); 를 풀어쓰면 아래와 같다.
		 * List sub = list1.subList(1,4); (sub는 읽기만 가능하다)
		 * ArrayList list2 = new ArrayList(sub); (sub와 같은 내용의 ArrayList를 생성한다)
		 */
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		print(list1, list2);

		System.out.println();

		/*
		 * Collection == Interface
		 * Collections == Util Class
		 * sort: 배열 혹은 리스트를 오름차순 정렬한다.
		 */
		Collections.sort(list1);
		Collections.sort(list2);
		print(list1, list2);

		System.out.println();

		// containsAll: 리스트의 모든 요소를 갖고있는지 확인한다.
		// list1이 list2의 모든 요소를 포함하고 있는가?
		System.out.println("list1.containsAll(list2): " + list2.containsAll(list2));

		System.out.println();

		// list2에 'B', 'C' 요소를 추가한다.
		list2.add("B");
		list2.add("C");
		// list2의 3번째 위치에 'A' 요소를 추가한다.(0, 1, 2, 3('A')..)
		list2.add(3, "A");
		print(list1, list2);
		
		System.out.println();

		// set: 특정 위치에 있는 요소의 값을 변경한다.
		// list2의 3번째 위치에 있는 'A'를 'AA'로 변경한다.
		list2.set(3, "AA");
		print(list1, list2);

		System.out.println();
		
		list1.add(0,"1");
		// indexOf: 지정된 요소의 위치(Index)를 알려준다.
		System.out.println("index: "+list1.indexOf("1")); // String의 위치
		System.out.println("index: "+list1.indexOf(1)); // Integer의 위치
		System.out.println("index: "+list1.indexOf(new Integer(1))); // Integer의 위치
		
		System.out.println();

		// remove: 리스트의 요소를 삭제한다.
		// index 내의 문자열 "1"을 삭제한다.
		System.out.print("list1.remove(\"1\"): ");
		list1.remove("1");
		print2(list1);
		
		// index 내의 Integer 타입의 '1'을 삭제한다.
		list1.remove(new Integer(1));
		System.out.print("list1.remove(new Integer(1)): ");
		print2(list1);
		
		// index의 3번째에 위치한 Integer 타입의 '4'를 삭제한다.
//		list1.remove(3);
//		print2(list1);
		
		// index 내에 Integer 타입의 '3'이 지워진다.
//		list1.remove(new Integer(3));
//		print2(list1);
		
		System.out.println();
		
		// list1에서 list2와 겹치는 부분을 남기고 삭제한다.
		System.out.println("list1.retainAll(list2): "+list1.retainAll(list2));
		print(list1,list2);
		
		System.out.println();
		
		// list2에서 list1에 포함된 객체들을 삭제한다.
		/*
		 * 1. get(i)으로 list2에서 하나씩 꺼낸다.
		 * 2. contains()로 꺼낸 객체가 list1에 있는지 확인한다.
		 * 3. remove(i)로 해당 객체를 list2에서 삭제한다.
		 */
		for (int i = list2.size() - 1; i >= 0; i--) {
			if (list1.contains(list2.get(i))) {
				list2.remove(i);
			}
		}
		print(list1, list2);

	}

	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1: " + list1);
		System.out.println("list2: " + list2);
	}
	static void print2(ArrayList list1) {
		System.out.println("list1: " + list1);
	}

}
