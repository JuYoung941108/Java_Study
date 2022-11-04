package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 * java.lang.ClassNotFoundException
 * 경로: C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib
 * 라이브러리 추가 후 실행
 */

public class DB_Connection {
	public static void main(String[] args) {
		// JDBC 연결에 관련된 변수를 선언한다.(Connection c)
		String id = "SYSTEM"; // DB 연결 ID
		String pw = "agg8827"; // DB 연결 PW
		String url = "jdbc:oracle:thin:@localhost:1521:xe";

		// JDBC 연결 객체와 관련된 참조변수를 선언한다.
		Connection c = null; // DB 연결 객체 참조변수
		PreparedStatement p = null; // SQL 쿼리 전송 객체 참조변수
		ResultSet r = null; // 쿼리 결과(Select 결과) 수신용 객체 참조변수

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // DB 드라이버 로드
			System.out.println("Driver Loading Success.");
			c = DriverManager.getConnection(url, id, pw); // DB connection 객체
			System.out.println("DB Connected.");

		} catch (Exception e) {
			e.printStackTrace();
		}
//		finally {
//			try {
//				c.close(); // 커넥션 종료
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
	}

}
