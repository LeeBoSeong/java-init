package p09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest2 {
	public static void main(String[] args) {
		Map<String, String> map1 = new HashMap<>();
		map1.put("name", "이왕균");
		map1.put("age", "25");
		map1.put("address", "땅굴");
		map1.put("IQ", "2");

		Map<String, String> map2 = new HashMap<>();
		map2.put("name", "이보성");
		map2.put("age", "25");
		map2.put("address", "금촌");
		map2.put("IQ", "200");

		Map<String, String> map3 = new HashMap<>();
		map3.put("name", "이원준");
		map3.put("age", "25");
		map3.put("address", "석계");
		map3.put("IQ", "4");

		Map<String, String> map4 = new HashMap<>();
		map4.put("name", "김용준");
		map4.put("age", "25");
		map4.put("address", "의정부");
		map4.put("IQ", "7");
		
		Map<String, String> map5 = new HashMap<>();
		map5.put("name", "이명관");
		map5.put("age", "25");
		map5.put("address", "도봉산");
		map5.put("IQ", "1");
		
		List<Map<String,String>> mapList = new ArrayList<>();
		mapList.add(map1);
		mapList.add(map2);
		mapList.add(map3);
		mapList.add(map4);
		mapList.add(map5);
		
		System.out.println(mapList);
	}
}
