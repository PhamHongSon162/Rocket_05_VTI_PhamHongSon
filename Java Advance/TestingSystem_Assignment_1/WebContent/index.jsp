<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Assignment1</title>
</head>
<body>
<h1>Hello World</h1>
<!-- Scriptlet tag -->
<% out.print("Welcome to jps") ; %>
<br>
<!-- Expression tag -->
  Current Time : <%= java.util.Calendar.getInstance().getTime() %>
  <br>
 <!-- Declaration Tag -->
 <%! String name = "Son" ; %>
 <%= "Hello : " +  name %>
 <br>
 <!--  Directives  -->
 <%@ page import="java.util.Date" %>
 Today is : <%= new Date() %>
</body>
</html>