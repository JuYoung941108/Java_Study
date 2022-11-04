package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DB_Select {
	public static void main(String[] args) {
		String id = "SYSTEM";
		String pw = "agg8827";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";

		Connection c = null;
		PreparedStatement p = null;
		ResultSet r = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // DB 드라이버 로드
			System.out.println("Driver Loading Success.");
			c = DriverManager.getConnection(url, id, pw);
			System.out.println("DB Connected.");

			p = c.prepareStatement("select * from testtbl");

			r = p.executeQuery();

			if (r != null) {
				while (r.next()) {
					System.out.print(r.getInt("num") + " ");
					System.out.print(r.getString("name") + " ");
					System.out.print(r.getString("addr") + " \n");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				r.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				p.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				c.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
