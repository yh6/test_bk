package test19;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import test18.AtDBCon;
/*int a = 3;
String str = Integer.toStirng(a);
String a=123;
String b=123;
a==b -> true
.equals 값을 비교
*/
public class MariaCon extends AtDBCon{

	MariaCon() throws IOException {
		super("dbcon.properties");
	}
	public static void main(String[] agrs) {
		try {
			MariaCon mc = new MariaCon();
			List<Map<String,String>> list = mc.select();
			for(Map<String,String> map:list) {
				String name = map.get("name");
				if("흑길동".equals(name)) {
					map.put("name", "박보검");
					int result = mc.updete(map);
					System.out.println("수정건수 : " + result);
					
				}
			}
			
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}
	@Override
	public List<Map<String, String>> select() {
		try {
			Statement stat = con.createStatement();
			//con.prepareStatement();
			String sql = "select * from user_info";
			ResultSet rs = stat.executeQuery(sql);			
			List<Map<String,String>> list = new ArrayList<Map<String,String>>();
			while(rs.next()){
				Map<String,String> usermap = new HashMap<String,String>();
				usermap.put("name",rs.getString("name"));
				usermap.put("num",rs.getString("num"));
				usermap.put("age",rs.getString("age"));
				usermap.put("address",rs.getString("address"));
				list.add(usermap);
			//	System.out.println(usermap);
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public int updete(Map<String,String> map) {
		String sql = "update user_info set name='" + map.get("name")+ "'" + "where num=" + map.get("num");
		try {
			Statement stat = con.createStatement();
			int result = stat.executeUpdate(sql); 
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return 0;
	}
	@Override
	public int delete(Map<String, String> map) {
		return 0;
	}
	@Override
	public int insert(Map<String, String> map) {
	
		return 0;
	}
	
}
