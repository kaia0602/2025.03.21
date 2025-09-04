<%--
  Created by IntelliJ IDEA.
  User: it
  Date: 25. 6. 11.
  Time: 오후 4:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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

  <div class="row content">
    <div class="col">
      <div class="card">
        <div class="card-header">
          login
        </div>
        <div class="card-body">
          <form method="post" action="/member/login">
              <ul><%=request.getAttribute("loginErrMsg")==null?
                      "" : request.getAttribute("loginErrMsg")%></ul>
            <div class="input-group mb-3">
              <span class="input-group-text">아이디</span>
              <input type="text" name="id" class="form-control" placeholder="아이디를 입력해 주세요"/>
            </div>
            <div class="input-group mb-3">
              <span class="input-group-text">비밀번호</span>
              <input type="text" name="pw" class="form-control" placeholder="비밀번호를 입력해 주세요"/>
            </div>
            <div class="my-4">
              <div class="float-end">
                <button type="submit" class="btn btn-primary">login</button>
              </div>

            </div>
          </form>
        </div>
      </div>
    </div>
  </div>
</div>

</body>
</html>
