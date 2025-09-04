package member.dao;

import common.JDBConnect;
import member.dto.MemberDTO;

public class MemberDAO extends JDBConnect {
	
	public MemberDTO getMember(String UserID, String UserPW) {
		MemberDTO dto = new MemberDTO();
		String query = "SELECT id, name FROM TOURIST_MEMBER WHERE id=? AND password=?";
		try {
			psmt = con.prepareStatement(query);
			psmt.setString(1, UserID);
			psmt.setString(2, UserPW);
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				dto.setId(rs.getString("id"));
				dto.setName(rs.getString("name"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return dto;
	}

	public void memberInsert(String id, String email, String name, String password, String phone,
			String gender, int agree, String content) {
		
		try {
		
			String query = "INSERT INTO TOURIST_MEMBER VALUES(?, ?, ?, ?, ?, ?, ?, ?, sysdate) ";
			psmt = con.prepareStatement(query);
			psmt.setString(1, id);
			psmt.setString(2, email);
			psmt.setString(3, name);
			psmt.setString(4, password);
			psmt.setString(5, phone);
			psmt.setString(6, gender);
			psmt.setInt(7, agree);
			psmt.setString(8, content);
			psmt.executeUpdate();
			
			} catch (Exception e) {
			e.printStackTrace();
		}
	} 
}

