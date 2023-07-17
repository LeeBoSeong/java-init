package p09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MapTest4 {
	public static void main(String[] args) {

		Map<String, String> map1 = new HashMap<>();
		map1.put("name", "이보성");
		map1.put("gender", "m");
		map1.put("cm", "190");
		map1.put("mbti", "X");

		Map<String, String> map2 = new HashMap<>();
		map2.put("name", "이원준");
		map2.put("gender", "f");
		map2.put("cm", "180");
		map2.put("mbti", "isfp");

		Map<String, String> map3 = new HashMap<>();
		map3.put("name", "이명관");
		map3.put("gender", "f");
		map3.put("cm", "120");
		map3.put("mbti", "estp");

		Map<String, String> map4 = new HashMap<>();
		map4.put("name", "이왕균");
		map4.put("gender", "f");
		map4.put("cm", "140");
		map4.put("mbti", "tisf");

		Map<String, String> map5 = new HashMap<>();
		map5.put("name", "김용준");
		map5.put("gender", "f");
		map5.put("cm", "170");
		map5.put("mbti", "iiii");

		List<Map<String, String>> mapList = new ArrayList<>();
		mapList.add(map1);
		mapList.add(map2);
		mapList.add(map3);
		mapList.add(map4);
		mapList.add(map5);

		for(int i = 0; i< mapList.size();i++){
			Map<String,String> maps = mapList.get(i);
			Iterator<String> it = maps.keySet().iterator();
			while (it.hasNext()) {
				String keyStr = it.next();
				System.out.print("KEY : "+ keyStr +"| Velue : " + maps.get(keyStr)+" ||");
			}
			System.out.println();
		}

		System.out.println(mapList);
	}
}
