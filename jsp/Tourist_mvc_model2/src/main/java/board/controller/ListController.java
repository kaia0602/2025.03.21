package board.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import board.dao.BoardDAO;
import board.dto.BoardDTO;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/boardList.do")
public class ListController extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		BoardDAO dao = new BoardDAO();
		List<BoardDTO> boardLists = new ArrayList<BoardDTO>();
		
		Map<String, Object> param = new HashMap<>();
		String searchWord = req.getParameter("searchWord");
		if(searchWord != null && searchWord.length() > 0){
			param.put("searchWord", searchWord);
		}
		
		ServletContext application = getServletContext();
		int pageSize = Integer.parseInt(application.getInitParameter("POSTS_PER_PAGE"));
		int blockPage = Integer.parseInt(application.getInitParameter("PAGES_PER_BLOCK"));
		
		int pageNum = 1;
		String pageTemp = req.getParameter("pageNum");
		if(pageTemp != null && !pageTemp.equals("")) {
			pageNum = Integer.parseInt(pageTemp);
		}
		int start = (pageNum - 1) * pageSize + 1;
		int end = pageNum * pageSize;
		param.put("start", start);
		param.put("end", end);
		
		int totalCount = dao.selectCount(param);
		
		
		boardLists = dao.selectListPage(param);
		req.setAttribute("boardLists", boardLists);
		req.setAttribute("totalCount", totalCount);
		req.setAttribute("pageSize" ,pageSize );
		req.setAttribute("blockPage" ,blockPage );
		req.setAttribute("pageNum" ,pageNum );
		req.getRequestDispatcher("/board_list2.jsp").forward(req, resp);
	}

}
