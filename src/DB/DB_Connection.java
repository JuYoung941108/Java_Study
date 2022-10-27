package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DB_Connection {
	public static void main(String[] args) {
		// DB 연결에 필요한 변수를 선언한다.
		String id = "root";
		String pw = "agg8827";
		String url = "jdbc:mysql://localhost:3306/test_db";

		// DB 연결 관련 참조변수를 선언한다.
		Connection c = null; 		// DB 연결 객체
		PreparedStatement p = null; // SQL 쿼리 전송
		ResultSet r = null; 		// 쿼리 결과(Select 결과) 수신용

		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); 	  // DB 드라이버를 로드한다.
			System.out.println("Driver Loading Success.");
			c = DriverManager.getConnection(url, id, pw); // DB 커넥션 객체를 받는다.
			System.out.println("DB Connected Success.");
		} catch (Exception e) {
			// printStackTrace: 에러의 발생 근원지를 찾고 단계별로 에러를 출력한다.
			e.printStackTrace();

			// 에러 발생 여부와 관계없이 try/catch 이후에 실행된다.
		} finally {
			try {
				c.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
