<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page buffer="1kb" autoFlush="true" %>
<%
for(int i=1;i<=99;i++){
	out.write(i+".1234<br>");
} 
%>