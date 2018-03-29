package test18;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
	public int updete() {
		return 0;
	}
	@Override
	public int delete() {
		return 0;
	}
	@Override
	public int insert() {
		return 0;
	}
}
