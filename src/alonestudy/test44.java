package alonestudy;

import java.util.ArrayList;
import java.util.List;

public class test44 {
	
	private static Object attribute;
	
	public static void setAttribute(String key, Object value) {
		attribute = value;
	}
	
	public static Object getAttribute(String key) {
		return attribute;
	}
	
	public static void main(String[] args) {
		
		List<String> strList = new ArrayList<String>();
		strList.add("우리");
		strList.add("지금");
		strList.add("나라");
		setAttribute("strList", strList);
		Object obj = getAttribute("strList");
		
		System.out.println(obj == strList);
		
		List<String> list = (List<String>)obj;
		
		System.out.println(list);
	}
}
