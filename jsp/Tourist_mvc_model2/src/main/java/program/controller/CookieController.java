package program.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/PopupCookie.do")
public class CookieController extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String chkVal = req.getParameter("title").replace(" ", "");

		if (chkVal != null) {
			Cookie cookie = new Cookie("title", chkVal);
			cookie.setPath(req.getContextPath());
			cookie.setMaxAge(60*60*24);
			resp.addCookie(cookie);
		}
		
	}

}
