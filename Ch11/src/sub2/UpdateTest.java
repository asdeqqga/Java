package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * 날짜 : 2022/09/15
 * 이름 : 라성준
 * 내용 : JDBC Update 실습하기
 */
public class UpdateTest {
	public static void main(String[] args) {
		// DB정보
		String host = "jdbc:mysql://127.0.0.1:3306/java2db";
		String user = "root";
		String pass = "1234";
		try {
			// 1단계
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2단계
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// 3단계
			Statement stmt = conn.createStatement();
			
			// 4단계
			String sql = "UPDATE `User` SET `name`='홍길동',`hp`='010-1121-0001' ";
				   sql += "WHERE `uid` ='j101';";
			stmt.executeUpdate(sql);	   
			
			// 5단계 - SELECT 결과처리
			// 6단계 - 데이터베이스 종료
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Insert 완료...");
	}
}
