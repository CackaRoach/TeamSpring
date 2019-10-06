<%@ page language="java" contentType="text/html; charset=Shift_JIS"
    pageEncoding="Shift_JIS"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="Shift_JIS">
<title>Board</title>
</head>
<body>
	<div align="center">
		<h3>Hi, ${userVO.name}!</h3>
		<a href="logout.do">Logout</a>
	</div>
	<hr>
	<div align="center">
		<table border="1" style="border-collapse:collapse; text-align:center">
			<tr>
				<th bgcolor="#B2FF95">Index</th>
				<th bgcolor="#B2FF95">Title</th>
				<th bgcolor="#B2FF95">Time</th>
				<th bgcolor="#B2FF95">Author</th>
				<th bgcolor="#B2FF95">Hits</th>
			</tr>
			<c:forEach var="boardVO" items="${boardList}">
				<tr>
				<td>${boardVO.idx}</td>
				<td><a href="getBoardDetail.do?idx=${boardVO.idx}">${boardVO.title}</a></td>
				<td>${boardVO.uptime}</td>
				<td>${boardVO.author_name}</td>
				<td>${boardVO.hits}</td>
				</tr>
			</c:forEach>
		</table>
			<div align="center">
				<input type="button" onClick="location.href = 'addBoard.do'" value="Post">
			</div>
		</div>
		<div align="center">
			<form action="getBoardList.do" method="Post">
				<select name="searchCondition">
					<option value="title" <c:if test="${searchCondition == 'title'}">selected</c:if>>Title</option>
					<option value="contents" <c:if test="${searchCondition == 'contents'}">selected</c:if>>Contents</option>
					<option value="author_name" <c:if test="${searchCondition == 'author_name'}">selected</c:if>>Author</option>
					<option value="mixed" <c:if test="${searchCondition == 'mixed'}">selected</c:if>>Title + Contents</option>
				</select>
				<input type="text" name="searchKeyword" value="${searchKeyword}">
				<input type="submit" value="search">
			</form>
		</div>
</body>
</html>