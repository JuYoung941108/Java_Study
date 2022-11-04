package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DB_Insert {
	public static void main(String[] args) {
		String id = "SYSTEM";
		String pw = "agg8827";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";

		try (Connection c = DriverManager.getConnection(url, id, pw);
				PreparedStatement p = c.prepareStatement("insert into testtbl values(testtbl_seq.NEXTVAL,?,?)");) {

			// 시퀀스는 값 안넣어줘도 되니까 생략 가능하다.(NUM 생략)
			p.setString(1, "lee");
			p.setString(2, "의정부");

			int result = p.executeUpdate();
			if (result != 0) {
				System.out.println("Insert 성공");
			} else {
				System.out.println("Insert 실패");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
