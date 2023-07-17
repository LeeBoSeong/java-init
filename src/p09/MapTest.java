package p09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		map.put("age", 33);
		map.put("age", 7);//키 값이 중복 될땐 한가지만 나오고 중복되면 생성하지 않음
		map.put("rank", 11);//키 값을 모를땐 Iterator 사용하여 키값을 가져오셈

		Iterator<String> it = map.keySet().iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			System.out.println("key : " + key + ", value : " + map.get(key));
		}
		
		System.out.println("크기 : "+map.size());
		
//		System.out.println(map.get("age"));
//		System.out.println(map.get("like"));
//		System.out.println(map.get("rank"));

	}
}
