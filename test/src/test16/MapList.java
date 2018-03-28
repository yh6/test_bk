package test16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MapList {
	static void insertMap(Map<String,String> map) {    //static 으로 하면 함수 new없이 호출바로 가능
		for(int i=1;i<=10;i++) {
			map.put("key" +i, "value"+i);
		}
	}
	static void printMap(Map<String,String> map) {
		//메타데이터 뽑아낼때 
		Iterator<String> it = map.keySet().iterator(); 
		while(it.hasNext()) { 
			String key = it.next();
			String value = map.get(key);
			System.out.printf("key=%s,value=%s \n",key,value);  // %s는 문자열을 반환을 지정
			
		}
	}
	public static void main(String[] agrs) {
		List<Map<String,String>> mapList = new ArrayList<Map<String,String>>();
		Map<String,String> map = new HashMap<String,String>();
		mapList.add(map);
		for(Map<String,String> m:mapList) {
			System.out.println(m);
		}
		//insertMap(map);
	//	printMap(map);
		
	}
}
