<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>1. 쿠키(Cookie) 설정</h2>
	<%
		// new Cookie() 생성자를 이용하여 저장할 쿠키를 작성
		Cookie cookie = new Cookie("myCookie", "쿠키맛나요");
		// 쿠키가 사용 될 경로 설정 
		// request.getContextPath(): 도메인 및 포트까지의 경로를 반환
		cookie.setPath(request.getContextPath());
		// setMaxAge: 유지시간을 초단위로 저장 
		// 계산식을 사용하면 가독성이 좋다. ex.(60 * 60)
		cookie.setMaxAge(3600);
		// 브라우저에 저장할 수 있도록 responce에 쿠키를 담아서 반환
		response.addCookie(cookie);
	%>
	
	<h2>2. 쿠키 설정 직후 쿠키값 확인하기</h2>
	<%
		// request 안에 있는 쿠키를 확인하는 방법
		// 쿠키 데이터를 배열에 저장하기, 
		Cookie[] cookies = request.getCookies();
		// 쿠키가 있는지 확인하는 if문: 최초 접속시 null, 그후의 접속부터는 
		// JSSESIONID가 있기 때문에 null 이 아님
		if (cookies != null) {
			// cookies 배열을 반복
			for (Cookie c : cookies) {
				// key 출력
				String cookieName = c.getName();
				// value 출력
				String cookieValue = c.getValue();
				
				out.println(String.format("%s : %s<br/>", cookieName, cookieValue));
				
			}
		}
	%>
	
	<h2>3. 페이지 이동 후 쿠키 값 확인하기</h2>
	<a href="CookieResult.jsp">
		다음 페이지에서 쿠키값 확인하기
	</a>

</body>
</html>