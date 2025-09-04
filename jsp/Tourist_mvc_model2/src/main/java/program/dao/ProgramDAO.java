package program.dao;

import java.util.ArrayList;
import java.util.List;

import common.DBConnPool;
import program.dto.ProgramDTO;

public class ProgramDAO extends DBConnPool{

	public List<ProgramDTO> ProgramList() {
		List<ProgramDTO> list = new ArrayList<ProgramDTO>();
		String query = "SELECT * FROM tourist_program";
		
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			while(rs.next()) {
				ProgramDTO dto = new ProgramDTO();
				dto.setId(rs.getInt("id"));
				dto.setTitle(rs.getString("title"));
				dto.setText(rs.getString("text"));
				dto.setSubtext(rs.getString("subtext"));
				dto.setSchedule(rs.getString("schedule"));
				dto.setImg(rs.getString("img"));
				dto.setCreate_date(rs.getDate("create_date"));
				list.add(dto);
			}
		}catch(Exception e) {
			System.out.println("게시물 조회 중 예외 발생");
			e.printStackTrace();
		}
		
		return list;
		
	}
	
		
	
}
