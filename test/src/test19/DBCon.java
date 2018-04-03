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

public class DBCon extends AtDBCon{
	private Statement stat;
	private ResultSet rs;
	
	public DBCon(String filePath) throws IOException {
		super(filePath);
	}

	@Override
	public List<Map<String, String>> select() {
		String sql = "select * from user_info";
		if(stat ==null) {
			try {
				stat = con.createStatement();
				rs = stat.executeQuery(sql);
				List<Map<String,String>> list = new ArrayList<Map<String,String>>();
				while(rs.next()) {
					Map<String,String> map = new HashMap<String,String>();
					map.put("num", rs.getString("num"));
					map.put("age", rs.getString("age"));
					map.put("name", rs.getString("name"));
					map.put("address", rs.getString("address"));
					list.add(map);				
				}
				return list;
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		return null;
	}

	@Override
	public int delete(Map<String, String> map) {
		String sql = "delete from user_info ";
		sql += "where num=" + map.get("num");
		try {
			Statement stat = con.createStatement();
			int result = stat.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int insert(Map<String, String> map) {
		String sql = "insert into user_info(num,name,age,address)";
		sql += "values('" + map.get("num") +"','"+ map.get("name")+"','"+map.get("age")+"','"+map.get("address")+"')";	
		System.out.println(sql);
		try {
			Statement stat = con.createStatement();
			int result = stat.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

}
