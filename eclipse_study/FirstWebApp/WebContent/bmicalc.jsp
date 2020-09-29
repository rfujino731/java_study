<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String value1 = request.getParameter("height1");
	String value2 = request.getParameter("weight1");
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>BMIの計算結果</title>
</head>
<body>
<h2>あなたのBMIの計算結果</h2>

<%
	double height,weight,bmi;
	height = Double.parseDouble(value1);
	weight = Double.parseDouble(value2);
	height /= 100;
	
	bmi = weight / (height * height);
	
	out.println("あなたのBMIの計算結果は、" + bmi + "です");
%>
</body>
</html>