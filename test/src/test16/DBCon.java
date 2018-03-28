package test16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBCon {
	
	public static void main(String[] agrs) {
		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/java"; //mysql데이터베이스이름
		String Id = "root";
		String Pwd = "dusgml66";
		try {
			Class.forName("org.mariadb.jdbc.Driver"); //전화기위치 Class->new해줌 reflection 
			con = DriverManager.getConnection(url,Id,Pwd);
			String sql = "select * from user_info";
			Statement stmt = con.createStatement(); //쿼리 하얀바탕
			ResultSet rs = stmt.executeQuery(sql); //executeQurey("select * from user_info")
			//
			while(rs.next()) {
				String name = rs.getString("name");
				String age = rs.getString("age");
				String address = rs.getString("address");
				System.out.println(name + "," + age + "," + address );
			}
			
			System.out.println("데이터베이스 접속에 성공");
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
