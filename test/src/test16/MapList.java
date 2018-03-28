package test16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MapList {
	static void insertMap(Map<String,String> map) {    //static ���� �ϸ� �Լ� new���� ȣ��ٷ� ����
		for(int i=1;i<=10;i++) {
			map.put("key" +i, "value"+i);
		}
	}
	static void printMap(Map<String,String> map) {
		//��Ÿ������ �̾Ƴ��� 
		Iterator<String> it = map.keySet().iterator(); 
		while(it.hasNext()) { 
			String key = it.next();
			String value = map.get(key);
			System.out.printf("key=%s,value=%s \n",key,value);  // %s�� ���ڿ��� ��ȯ�� ����
			
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
