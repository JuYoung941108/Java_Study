package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class EX5 {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		Collection c = new HashSet(); // * Best!
//		HashSet list = new HashSet();

		a.add("1");
		a.add("2");
		a.add("3");
		a.add("4");
		a.add("5");

		Iterator it = a.iterator();

		while (it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}

		/*
		 * iterator는 1회용이기 때문에 나머지 요소까지 읽은 후 다시 호출하면 false를 반환한다.
		 * 때문에, 한번 사용 후 'Iterator 참조변수명 = list.iterator()'로 iterator를 다시 호출해야 한다.
		 */

		it = a.iterator();

		while (it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}

		/*
		 * next()가 아닌 get()으로도 요소를 읽어올 수 있지만 HashSet에는 get() 메소드가 없으므로,
		 * ArrayList와 HashSet에 둘 다 있는 next()를 사용하는 것이 바람직하다.(== Iterator를 사용하는 것이 좋다)
		 * 또한, 변경을 최소화하는 코드를 작성하는 것이 좋다.
		 */
//		for (int i = 0; i < list.size(); i++) {
//			Object obj = list.get(i);
//			System.out.println(obj);
//		}

	}

}
