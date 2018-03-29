package test16;

import java.sql.ResultSet;
import java.util.Iterator;
import java.util.Map;

public class IteratorTest {
	
	public static void insertMap(Map<String,String> map) {
		for(int i=1;i<10;i++) {
			map.put("key" +i, "value"+i);
		}
	}
	public static void printMap(Map<String,String> map) {
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
		String key = it.next();
		String value = map.get(key);
		}
		
	}
	public static void main(String[] agrs) {
		
		
	}
}
