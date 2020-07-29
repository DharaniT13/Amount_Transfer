<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Amount Transfer</title>
	</head>
	<body>
		<form action="transfer">
			<input type="text" name="transferamount" autocomplete="off">
			<input type="submit">
		</form>
		<table border="1">
			<thead>
				<tr>
					<th>Transfer id</th>
					<th>Transfer Amount</th>
					<th>Balance</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="tran" items="${tran}">
				<tr>
					<td><c:out value="${tran.transferid}" /></td>
					<td><c:out value="${tran.transferamount}" /></td>
					<td><c:out value="${tran.balance}" /></td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
	</body>
</html>