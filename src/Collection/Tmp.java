package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Tmp {
	public static void main(String[] args) {

		List list = new ArrayList();
		// list.iterator() == Iterator의 객체를 반환한다.
		Iterator it = list.iterator();

		// hasNext(): 읽어 올 요소가 있는지 확인한다.
		while (it.hasNext()) {
			// next(): 있으면 요소를 읽어온다.
			System.out.println(it.next());
		}
	}
}
