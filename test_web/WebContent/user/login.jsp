<%@ include file="/common/header.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="com.test.common.DBConn" %>
<%@ page import="com.test.dto.UserInfo" %>
<script>
var setObj;
var loopCnt = 0;
function doLogout(){
	location.href="<%=rootPath%>/user/login_ok.jsp";
}
</script>
<link rel="stylesheet" href="<%=rootPath%>/ui/signin.css"/>
<body>
<%
if(login){
	out.println("현재시간 : " + toDateStr);
	out.println("<br/>");
	out.println(userId + "님 환영해요~");
	out.println("<br/>");
	out.println("==" + userId + "님 의 정보 ==");
	out.println("<br/>");
	out.println("성명 : " + userName);
	out.println("<br/>");
	out.println("나이 : " + age);
	out.println("<br/>");
	out.println("주소 : " + address);
	out.println("<br/>"); 
	out.println("전화번호 : " + hp1 + hp2 + hp3);
	out.println("<br/>"); 
	out.println("<input type='button' value='로그아웃' onclick='doLogout()'/>");
	out.println("<input type='button' value='게시판가기' onclick='doMovePage(\"board\")'/>");
}else{
%>
    <div class="container">

      <form class="form-signin"  action="<%=rootPath%>/user/login_ok.jsp">
        <h2 class="form-signin-heading">Please sign in</h2>
        <label for="inputEmail" class="sr-only">Email address</label>
        <input type="text" id="id" name="id" class="form-control" placeholder="Email address" required autofocus>
        <label for="inputPassword" class="sr-only">Password</label>
        <input type="password"  name="pwd" id="pwd" class="form-control" placeholder="Password" required>
        <div class="checkbox">
          <label>
            <input type="checkbox" value="remember-me"> Remember me
          </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
      </form>

    </div> <!-- /container -->

<%
}
%>
</body>
</html>