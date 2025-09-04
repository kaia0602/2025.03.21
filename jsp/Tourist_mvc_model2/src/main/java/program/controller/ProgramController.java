package program.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import program.dao.ProgramDAO;
import program.dto.ProgramDTO;

@WebServlet("/programList.do")
public class ProgramController extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ProgramDAO dao = new ProgramDAO();
		List<ProgramDTO> programLists = new ArrayList<>();
			
		programLists = dao.ProgramList();
		req.setAttribute("programLists", programLists);
		req.getRequestDispatcher("/board_program.jsp").forward(req, resp);
		
		dao.close();
	
	}
	
	
}
