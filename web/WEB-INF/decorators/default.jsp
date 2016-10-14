<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html class="no-js" lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title><dec:title default="playground" /></title> global css goes
here...

<sitemesh:write property='head' />
</head>
<body>
	<table>
		<tr><%@ include file="include/header.jsp"%></tr>

		<tr>
			<div class="container">
				<sitemesh:write property='body' />
			</div>
		</tr>
		<tr><%@ include file="include/footer.jsp"%></tr>
	</table>


	global javascript goes here...

</body>
</html>