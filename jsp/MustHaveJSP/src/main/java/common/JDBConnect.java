package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBConnect {
	// 데이터베이스 접속정보 
	public Connection con;
	// 정적 쿼리문을 실행하는 객체
	public Statement stmt;
	// 동적 쿼리문을 실행하는 객체
	public PreparedStatement psmt;
	// SELECT문의 결과를 받는 객체
	public ResultSet rs;
	
	public JDBConnect() {
		try {
			// DB에 맞는 클래스 설정
			Class.forName("oracle.jdbc.OracleDriver");
			
			// 접속할 데이터 베이스의 주소
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			// 접속 가능한 아이디
			String id = "musthave";
			// 패스워드
			
			String pwd = "1234";
			// getConnection(주소, id, pwd): 데이터베이스에 실제 접속하는 함수
			con = DriverManager.getConnection(url, id, pwd);
			
			System.out.println("DB 연결 성공(기본 생성자)");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		
	public void close() {
		// JDBConnect에서 생성했던 객체를 종료하는 메서드
		try {
			// ResultSet: Select문의 결과를 담는 객체
			if (rs != null) rs.close();
			// Statement: SQL문을 한건만 실행할 수 있는 객체
			if (stmt != null) stmt.close();
			// preparedStatement: SQL문을 여러번 실행할 수 있는 객체
			if (psmt != null) psmt.close();
			// DB 접속 객체
			if (con != null) con.close();
				
			System.out.println("JDBC 자원해제");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


