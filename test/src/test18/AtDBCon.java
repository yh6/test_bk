package test18;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public abstract class AtDBCon {
	protected Connection con;
	private String url;
	private String id;
	private String pwd;
	private String driver;

	public AtDBCon(String filePath) throws IOException {
		InputStream is;
		is = getClass().getClassLoader().getResourceAsStream(filePath); // filePath src에 파일을 찾눈다.

		Properties prop = new Properties();
		if (is != null) {
			prop.load(is);
			url = prop.getProperty("db.url");
			id = prop.getProperty("db.id");
			pwd = prop.getProperty("db.pwd");
			driver = prop.getProperty("db.driver");
			conectionDB();
		} else {
			String errorMsg = "file :" + filePath + "없음";
			throw new FileNotFoundException(errorMsg);
		}
	}

	private void conectionDB() {
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url,id,pwd);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	
	}
	//데이터 입력 추상메소드
	public abstract List<Map<String,String>> select();
	//데이터 

	public abstract int delete(Map<String, String> map);
	//데이저 조회 추상메소드
	public abstract int insert(Map<String, String> map);


	public int updete(Map<String, String> map) {
		// TODO Auto-generated method stub
		return 0;
	}
}
