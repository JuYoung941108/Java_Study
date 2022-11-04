package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DB_Update {
	public static void main(String[] args) {
		String id = "SYSTEM";
		String pw = "agg8827";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";

		try (Connection c = DriverManager.getConnection(url, id, pw);
//				PreparedStatement p = c.prepareStatement("update testtbl set name=? where addr=?")) {
//			p.setString(1, "kim");
//			p.setString(2, "부산");

//				PreparedStatement p = c.prepareStatement("update testtbl set num=? where addr=?")) {
//			p.setInt(1, 5); // 바꿀 속성 값을 적는다.(1: 조건절의 위치, 5: 바꿀 속성 값)
//			p.setString(2, "상주"); // 바꿀 위치에 있는 속성 값(2: 조건절의 위치, addr: where addr)

				PreparedStatement p = c.prepareStatement("update testtbl set addr=? where name=?")) {
			p.setString(1, "서울");
			p.setString(2, "yoon");

			int result = p.executeUpdate();
			if (result != 0) {
				System.out.println("Update 성공");
			} else {
				System.out.println("Update 실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
