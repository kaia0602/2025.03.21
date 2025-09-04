<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.Connection"%>
<%@ page import="java.sql.Statement"%>
<%@ page import="common.JDBConnect" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
	table, td, th {
		border: 1px solid black;
		border-collapse: collapse;
		text-align: center;
	}
</style>
<body>
	<% 
	JDBConnect jdbc = new JDBConnect();
	
		String sql = "SELECT * FROM board ORDER BY NUM";
		jdbc.stmt = jdbc.con.createStatement();
		
		jdbc.rs = jdbc.stmt.executeQuery(sql);
		
		
		%>
	<table>
	<tr>
		<th>번호</th>
		<th>제목</th>
		<th>내용</th>
		<th>작성자</th>
		<th>작성일</th>
		<th>조회수</th>
	</tr>	
		<%  while (jdbc.rs.next()) {
			int NUM = jdbc.rs.getInt(1);
			String TITLE = jdbc.rs.getString(2);
			String CONTENT = jdbc.rs.getString(3);
			String ID = jdbc.rs.getString(4);
			java.sql.Date POSTDATE = jdbc.rs.getDate("POSTDATE");
			int VISITCOUNT = jdbc.rs.getInt(6);
			
		%>	
		<tr>
			<td><%=NUM %></td>
			<td><%=TITLE%></td>
			<td><%=CONTENT %></td>
			<td><%=ID %></td>
			<td><%=POSTDATE %></td>
			<td><%=VISITCOUNT %></td>
		</tr>
		<%}%>
</table>
		
	<% 
		jdbc.close();
	%>
</body>
</html>