package p09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MapTest3 {
	public static void main(String[] args) {

		Map<String, String> maps1 = new HashMap<>();
		maps1.put("name", "아이폰14");
		maps1.put("ry", "2023");
		maps1.put("price", "200만원");
		maps1.put("bettary", "1");

		Map<String, String> maps2 = new HashMap<>();
		maps2.put("name", "갤럭시23");
		maps2.put("ry", "2023");
		maps2.put("price", "170만원");
		maps2.put("bettary", "2");

		Map<String, String> maps3 = new HashMap<>();
		maps3.put("name", "블랙벨;");
		maps3.put("ry", "2017");
		maps3.put("price", "80만원");
		maps3.put("bettary", "3");

		Map<String, String> maps4 = new HashMap<>();
		maps4.put("name", "LG울트라");
		maps4.put("ry", "2018");
		maps4.put("price", "100만원");
		maps4.put("bettary", "4");

		Map<String, String> maps5 = new HashMap<>();
		maps5.put("name", "샤오미");
		maps5.put("ry", "2023");
		maps5.put("price", "100만원");
		maps5.put("bettary", "5");

		List<Map<String, String>> mapList = new ArrayList<>();
		mapList.add(maps1);
		mapList.add(maps2);
		mapList.add(maps3);
		mapList.add(maps4);
		mapList.add(maps5);
//
//		for (int i = 0; i < mapList.size(); i++) {
//			Map<String, String> maps = mapList.get(i);
//			Iterator<String> it = maps.keySet().iterator();
//			while (it.hasNext()) {
//				String key = it.next();
//				System.out.print(key + " : " + maps.get(key) + "||");
//			}
//			System.out.println();
//		}
//		
		for (Map<String, String> maps: mapList) { //향상된 for문
			Iterator<String> it = maps.keySet().iterator();
			while (it.hasNext()) {
				String key = it.next();
				System.out.print(key + " : " + maps.get(key) + "||");
			}
			System.out.println();
		}
		System.out.println(mapList);
	}
}
