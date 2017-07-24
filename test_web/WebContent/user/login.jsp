<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="com.test.common.DBConn" %>
<%@ page import="com.test.dto.UserInfo" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String id = request.getParameter("id");
String pwd = request.getParameter("pwd");

if(id!=null && pwd!=null){
	UserInfo ui = new UserInfo();
	ui.setUserId(id);
	ui.setUserPwd(pwd);
	
	Connection con = null;
	PreparedStatement ps = null;
	String result = "";
	try{
		con = DBConn.getCon();
		String sql = "select userpwd from user_info where userid=?";
		ps = con.prepareStatement(sql);
		ps.setString(1, ui.getUserId());
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			String userpwd = rs.getString("userpwd");
	
			if(userpwd.equals(ui.getUserPwd())){
				result =  "로그인 성공";
			}else{
				result =  "비밀번호 틀렸어 임마!";
			}
		}
	}catch(Exception e){
		System.out.println(e);
	}
	if(result.equals("")){
		result =  "그런 아이디 없다잖아!!";
	}
	out.println(result);
}
%>
<form action="/user/login.jsp">
ID : <input type="text" name="id"/><br/>
PWD : <input type="text" name="pwd"/><br/>
<input type="submit" value="로그인!!"/>
</form>
</body>
</html>