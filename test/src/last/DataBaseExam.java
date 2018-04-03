package last;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DataBaseExam {

	Connection con;
	Scanner scan;

	DataBaseExam() {
		try {
			scan = new Scanner(System.in);
			Class.forName("org.mariadb.jdbc.Driver");
			String Url = "jdbc:mysql://localhost:3306/java";
			con = DriverManager.getConnection(Url, "root", "dusgml66");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	public void insertUser() {
		System.out.println("��ȣ: ");
		String num = scan.nextLine();
		System.out.println("����: ");
		String age = scan.nextLine();
		System.out.println("�ּ�: ");
		String address = scan.nextLine();
		System.out.println("�̸�: ");
		String name = scan.nextLine();
		String sql = "insert into user_info(num,name,age,address)";
		sql += "values('" + num + "','" + name + "','" + age + "','" + address + "')";
		try {
			Statement stat = con.createStatement();
			int result = stat.executeUpdate(sql);
			if (result == 1) {
				System.out.println("�Է� ����");
			} else {
				System.out.println("�Է� ����");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void printUers() {
		String sql = "select * from user_info";
		try {
			Statement stat = con.createStatement();
			ResultSet rs = stat.executeQuery(sql);
			while (rs.next()) {
				System.out.println("num=" + rs.getString("num") + ",");
				System.out.println("age=" + rs.getString("age") + ",");
				System.out.println("name=" + rs.getString("name") + ",");
				System.out.println("address=" + rs.getString("address"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] agrs) {
		DataBaseExam dbe = new DataBaseExam();
		// dbe.insertUser();
		System.out.println("1:�������,2:��������Ʈ,3:����");
		while (true) {
			System.out.println("���ϴ� ��ȣ�� �Է��ϼ���");
			String cmd = dbe.scan.nextLine();
			if ("1".equals(cmd)) {
				dbe.insertUser();
			} else if ("2".equals(cmd)) {
				dbe.printUers();
			} else {
				System.out.println("���α׷� ����");
				System.exit(0);
			}

		}
	}
}
