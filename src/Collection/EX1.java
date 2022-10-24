package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EX1 {
	public static Map<String, Integer> map = new HashMap();

	public static void insert(String k, Integer v) {
		// 중복되는 key, value값이 있다면 출력문과 함께 끝난다.
		if (map.containsKey(k) && map.containsKey(v)) {
			System.out.println("동일한 key가 존재합니다.");
		} else {
			// 중복되지 않는다면 map에 key와 value의 값을 넣어준다.
			map.put(k, v);
		}
	}
	
	public static void showInfo() {
		// map에 있는 key값만 set 형태로 반환한다.
		Set<String>set=map.keySet();
		for (String key : set) {
			int value=map.get(key);
			
		}
	}

	public static void main(String[] args) {

	}

}
