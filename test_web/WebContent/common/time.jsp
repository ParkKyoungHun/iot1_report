<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<form>
<%
Date toDate = new Date();
SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
String toDateStr = sdf.format(toDate); 
out.println(toDateStr);
out.println("<input type='button' onclick='test(" + "abc" + ")' value='자살할까?'/>");
%>  
</form>
<input type='button' onclick='test('abc')' value='자살할까?'/>
<script> 
function test(str){
	alert(str);
}
</script>