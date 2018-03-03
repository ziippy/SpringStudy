<%@page contentType="text/html; charset=EUC-KR"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
                      "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>기본 에러 화면</title>
</head>
<body>
	<center>
		<h1>
			기본 에러 화면입니다.
		</h1>
		<table border="1" cellpadding="0" cellspacing="0">
			<tr>
				<td bgcolor="orange">Message: ${exception.message}</td>
			</tr>
		</table>
		<hr>
	</center>
</body>
</html>
