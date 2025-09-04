<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String popupMode = "on";

	// 모든 쿠키를 확인하는 반복문 작성
	Cookie[] cookies = request.getCookies();
	if (cookies != null) {
		for (Cookie c : cookies) {
			String cookieName = c.getName();
			String cookieValue = c.getValue();
			// popupClose라는 쿠키가 있는지 확인하는 if문
			if( cookieName.equals("PopupClose")) {
				// popupMode 변수에 popupClose의 value를 저장
				popupMode = cookieValue; 	
			}
		}
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	div#popup {
		position: absolute; top:100px; left: 50px;color: orange;
		width: 270px; height: 100px; background-color: gray;
	}
	div#popup>div {
		position: relative; background-color:#ffffff; top:0px;
		border:1px solid gray; padding: 10px; color: black;
	}
</style>

<script src="https://code.jquery.com/jquery-3.7.1.js" 
	integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4=" 
	crossorigin="anonymous"></script>
<script>
	// JQuery를 head안에 사용할 때 필요한 부분, javaScript의 
	// window.onload와 같은 역할
	$(function() {
		// colseBtn에 클릭 이벤트 생성
		$('#closeBtn').click(function() {
			// popup을 보이지 않게 숨겨줌
			$('#popup').hide();
			// input 태그의 타입이 checkBox에 id가 inactiveToday인 태그에 체크가 되어있으면
			// value값을 chkVal 변수에 저장하라
			var chkVal = $("input:checkbox[id=inactiveToday]:checked").val();
			if (chkVal == 1) {
				// ajax: 새로고침, 페이지를 새롭게 받지 않고 원본 페이지에 그대로 서버의 데이터를 적용할 때
				// 자바스크립트를 통해 새로고침 하지 않고 서버와 통신
				$.ajax({
					// 페이지 설정
					url : './PopupCookie.jsp',
					// 메서드의 타입: get, post
					type : 'get',
					// 보낼 데이터
					data : {inactiveToday : chkVal},
					// 보낼 데이터의 타입: text, json, xml
					dataType : "text",
					// 통신이 성공 했을때 실행할 함수
					// 함수의 매개변수(resData)에 서버에서 보내준 데이터가 들어있음
					success : function(resData) {
						if (resData != '') 
							// 새로고침 실행
							// location.reload();
					}
				})
			}
		});
	});
</script>

</head>
<body>
	<h2>팝업 메인 페이지(ver 0.1)</h2>
	<%
		for (int i = 0; i <= 10; i++) {
			out.print("현재 팝업창은 " + popupMode + " 상태입니다. <br/>");
		}
	
		if (popupMode.equals("on")) {
	%>
	
		<div id = "popup">
			<h2 align = "center">공지사항 팝업입니다.</h2>
			<div align = "right">
				<form name = "popFrm">
					<input type = "checkbox" id = "inactiveToday" value = "1" />
						하루동안 열지 않음
					<input type="button" value = "닫기" id = "closeBtn" />
				</form>
			</div>
		</div>
	<%
		}
	%>
</body>
</html>