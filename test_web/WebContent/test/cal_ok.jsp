<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.google.gson.*" %>
<%@ page import="java.util.*" %>
<%
Gson g = new Gson();
HashMap<String,String> hm = g.fromJson(request.getReader(), HashMap.class);
String numStr1 = hm.get("num1");
String numStr2 = hm.get("num2");
int num1 = Integer.parseInt(numStr1);
int num2 = Integer.parseInt(numStr2);
String op = hm.get("op");

int result = 0;
switch (op){
case "+" : 
	result = num1 + num2;
	break;
case "-" : 
	result = num1 - num2;
	break;
case "*" : 
	result = num1 * num2;
	break;
case "/" : 
	result = num1 / num2;
	break;
}
HashMap<String, Integer> resultMap = new HashMap<String,Integer>();
resultMap.put("num", result);
String json = g.toJson(resultMap);
System.out.println(json);
out.print(json);
%>