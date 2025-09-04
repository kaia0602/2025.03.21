<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%!int i = 1;
	int j = 1;%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>구구단 출력하기</title>
<style >
	table, td {
		border: 1px solid black ;
		border-collapse: collapse;
		padding: 3px;
		
	}
</style>
</head>
<body>
	<!-- 1~9단까지의 구구단 출력하기 -->
	<table>
	<%for (i = 1; i < 10; i++) {%>
		<tr>
		<%for (j = 1; j < 10; j++) {%>
		<td><%=i + " * " + j + " = " + i * j%></td>
		<%}%>
		</tr>
	<%}%>	
	</table>




</body>
</html>