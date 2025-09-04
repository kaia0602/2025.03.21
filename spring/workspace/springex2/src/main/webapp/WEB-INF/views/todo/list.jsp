<%@ page import="org.zerock.springex2.dto.MemberDTO" %><%--
  Created by IntelliJ IDEA.
  User: it
  Date: 25. 6. 13.
  Time: 오전 11:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <meta charset="UTF-8">
  <title>test</title>
  <!-- 부트 스트랩 CSS를 CDN 방식으로 다운로드 -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<!-- 부트스트랩 JavaScript를 CDN 방식으로 다운로드 -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
<body>
<div class="container-fluid">
  <div class="row">
    <div class="col">
      <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <div class="container-fluid">
          <a class="navbar-brand" href="#">Navbar</a>
          <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
          <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
            <div class="navbar-nav">
              <a class="nav-link active" aria-current="page" href="#">Home</a>
              <a class="nav-link" href="#">Features</a>
              <a class="nav-link" href="#">Pricing</a>
              <a class="nav-link disabled">Disabled</a>
                <%if(session.getAttribute("userDTO")==null){ %>
                  <a class="nav-link" href="/member/login">로그인</a>
                  <a class="nav-link" href="/member/join">회원가입</a>
                <%}else{ %>
                  <a class="nav-link" href="/member/logout">로그아웃</a>
                  <a class="nav-link" onclick="deleteMember()">회원탈퇴</a>
                <%} %>
                <%if(session.getAttribute("userDTO")!=null){ %>
						<span style="color:black;">
						<%=((MemberDTO)session.getAttribute("userDTO")).getId() %>님 환영합니다.
						</span>
                <%} %>
            </div>
          </div>
        </div>
      </nav>
    </div>
  </div>
  <div class="row content">
    <div class="col">
      <div class="card">
        <div class="card-body">
          <h5 class="card-title">Search</h5>
          <form action="/todo/list" method="get">
            <input type="hidden" name="size" value="${pageRequestDTO.size}">
            <div class="mb-3">
              <input type="checkbox" name="finished" ${pageRequestDTO.finished?"checked":""}> 완료여부
            </div>
            <div class="mb-3">
              <input type="checkbox" name="types" value="t" ${pageRequestDTO.checkType("t")?"checked":""}>제목
              <input type="checkbox" name="types" value="w" ${pageRequestDTO.checkType("w")?"checked":""}>작성자
              <input type="text" name="keyword" class="form-control" value="${pageRequestDTO.keyword}">
            </div>
            <div class="input-group mb-3 dueDateDiv">
              <input type="date" name="from" class="form-control" value="${pageRequestDTO.from}">
              <input type="date" name="to" class="form-control" value="${pageRequestDTO.to}">
            </div>
            <div class="input-group mb-3">
              <div class="float-end">
                <button class="btn btn-primary" type="submit">Search</button>
                <button class="btn btn-info" type="button">Clear</button>
              </div>
            </div>
          </form>
        </div>
      </div>
    </div>
  </div>
  <div class="row content">
    <div class="col">
      <div class="card">
        <div class="card-header">
          Featured
        </div>
        <div class="card-body">
          <h5 class="card-title">할일 리스트</h5>
          <table class="table">
            <thead>
            <tr>
              <th scope="col">Tno</th>
              <th scope="col">Title</th>
              <th scope="col">Writer</th>
              <th scope="col">DueDate</th>
              <th scope="col">Finished</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${responseDTO.dtoList}" var="dto">
              <tr>
                <%-- c:out: &,<,>," 같은 특수기호를 이스케이프 처리하는 JSTL 기능 --%>
                <%-- 이스케이프 처리: 특수기호가 출력될 수 있도록 앞에 역슬래시(\)를 넣어주는 처리 --%>
                <th scope="row"><c:out value="${dto.tno}"/></th>
                  <td>
                    <a href="/todo/read?tno=${dto.tno}&${pageRequestDTO.link}" class="text-decoration-none">
                      <c:out value="${dto.title}"/>
                    </a>
                  </td>
                <td><c:out value="${dto.writer}"/></td>
                <td>${dto.dueDate}</td>
                <%--<td>${dto.finished}</td>--%>
                <c:choose>
                  <c:when test="${dto.finished}">
                    <td>o</td>
                  </c:when>
                  <c:otherwise>
                    <td>x</td>
                  </c:otherwise>
                </c:choose>
              </tr>
            </c:forEach>
            </tbody>
          </table>
          <div class="float-end">
            <ul class="pagination flex-wrap">
              <c:if test="${responseDTO.prev}">
                <li class="page-item">
                  <a class="page-link" data-num="${responseDTO.start-1}">Previous</a>
                </li>
              </c:if>
              <%-- 페이지의 숫자 부분 --%>
              <%-- begin: 첫번째 페이지, end: 마지막 페이지, num: 반복에 사용할 변수--%>
              <c:forEach begin="${responseDTO.start}" end="${responseDTO.end}" var="num">
                <li class="page-item ${responseDTO.page == num? "active" : ""}">
                  <a class="page-link" data-num="${num}">${num}</a>
                </li>
              </c:forEach>
              <c:if test="${responseDTO.next}">
                <li class="page-item">
                  <a class="page-link" data-num ="${responseDTO.end+1}">Next</a>
                </li>
              </c:if>
            </ul>
          </div>
        </div>
      </div>
    </div>
  </div>
  <div class="row content">
    <h1>contents</h1>
  </div>
  <div class="row content">
    <div class="row fixed-bottom" style="z-index: -100">
      <footer class="py-1 my-1">
        <p class="text-center text-muted">Footer</p>
      </footer>
    </div>
  </div>
</div>
<script>
  document.querySelector(".pagination").addEventListener("click", function (e) {
    e.preventDefault()
    e.stopPropagation()
    const target = e.target;
    if(target.tagName !== 'A') { // A 태그인지 확인후 아니라면 아무처리도 하지않음
      return;
    }
    const num = target.getAttribute("data-num");
    const formObj = document.querySelector("form")
    // data-num 속성에 각 페이지를 저장하여 사용
    formObj.innerHTML += `<input type = 'hidden' name='page' value='\${num}'/>`
    formObj.submit()
  })
  document.querySelector(".btn-info").addEventListener("click", function () {
    location.href = "/todo/list"; // 검색조건을 모두 삭제하고 페이지를 새로 고침하는 버튼
  })
  document.querySelector(".btn-info").addEventListener("click", function (e) {
    // 각각의 input 내용을 초기화하는 방식
    let formObj = document.querySelector("form");
    formObj.finished.checked = false;
    formObj.types[0].checked = false;
    formObj.types[1].checked = false;
    formObj.keyword.value="";
    formObj.from.value="";
    formObj.to.value="";
  })
  function deleteMember(){
    if(confirm("탈퇴 하시겠습니까?")) {
      const formObj = document.createElement("form");
      formObj.innerHTML = "<input type='hidden' name='id' value='${sessionScope.userId}' />"
      formObj.method="post";
      formObj.action="/member/remove";
      document.body.appendChild(formObj);
      formObj.submit();
    }

  }
</script>
</body>
</html>
