<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bins.Question"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>




<%
ArrayList<Question> questions = (ArrayList<Question>) request.getAttribute("questions"); 
%>

<h1>WOOOOOW Bienvenue au QuIzZ de la MORT</h1>

<form action="" method="POST">

<fieldset>
<legend>gfgfgf</legend></fieldset>

<input type ="submit" value="Validez mes réponses"> 
</form>
</body>
</html>