package test16;

import java.util.ArrayList;

import java.util.List;
import java.util.Map;

public class Iterator {
	
	public static void insertMap(Map<String,String> insertmap) {
		for(int i=1;i<10;i++) {
			insertmap.put("key", "value");
			System.out.println("key + i" );
		}
	}

	public static void main(String[] agrs) {
		List<Map<String, String>> list = new ArrayList<Map<String,String>>();
		
	}
}
