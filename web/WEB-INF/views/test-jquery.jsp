<%@ include file="/WEB-INF/decorators/include/taglibs.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script src="${contextPath}/resources/js/jquery.min.js"></script>
<script>
	$(document).ready(function(){
		$("button").click(function(){
			$(".show-ajax").load("./testLoadPage h2");
			
		})
	})
</script>
</head>
<body>
	<c:out value="test jstl 222"></c:out>
	<h2>This is Ajax with load</h2>
	<button>Click here to load</button>
	<div class="show-ajax"></div>
</body>
</html>