package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DB_Delete {
	public static void main(String[] args) {
		String id = "SYSTEM";
		String pw = "agg8827";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";

		Connection c = null;
		PreparedStatement p = null;
		ResultSet r = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver Loading Success.");
			c = DriverManager.getConnection(url, id, pw);
			System.out.println("DB Connected.");
			p = c.prepareStatement("delete from testtbl where addr=?");
			p.setString(1, "의정부"); // 1: 조건절의 위치, 의정부: 삭제할 열의 속성 값

			int result = p.executeUpdate();
			if (result != 0) {
				System.out.println("Delete 성공");
			} else {
				System.out.println("Delete 실패");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
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
