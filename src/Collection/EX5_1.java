package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class EX5_1 {
	public static void main(String[] args) {
		Map m = new HashMap();
		
//		Iterator it = m.entrySet().iterator();
//		위의 문장은 아래의 문장과 같다.
		Set eSet=m.entrySet();
		Iterator it=eSet.iterator();
	}

}
