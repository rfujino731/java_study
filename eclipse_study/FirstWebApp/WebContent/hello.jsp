<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Calendar" %>
<%@ page import="java.text.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
#ISO-8859-1
<title>Inital JSP</title>
</head>
<body>
<h1>Hello, JSP! java_study</h1>

<%
Calendar gcal = Calendar.getInstance();
SimpleDateFormat format1 = new SimpleDateFormat("Gyyyy年 MM月　dd日 (E)");
SimpleDateFormat format2 = new SimpleDateFormat("ah時 mm分");

String string1 = format1.format(gcal.getTime());
String string2 = format2.format(gcal.getTime());

out.println("本日の日付:" + string1 + "<br>現在の時刻: " + string2);
%>

</body>
</html>








