<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ page trimDirectiveWhitespaces="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<!--CDN ������� jQuery ���̺귯���� �ε�-->
        <script
  src="https://code.jquery.com/jquery-1.12.4.js"
  integrity="sha256-Qw82+bXyGq6MydymqBxNPYTaUXXq7c8v3CwiYwLLNXU="
  crossorigin="anonymous"></script>
<title>Insert title here</title>
</head>
<body>



<%request.setAttribute("name", "Dr jo"); 
%>
��û URI : ${pageContext.request.requestURI} <br>
	request name �Ӽ� �� : ${requestScope.name} <br>	
	request ��ü ���� name �Ӽ� �� : ${name} <br>
	session loginInfo ��ü : ${sessionScope.loginInfo} <br>
	session ��ü ���� loginInfo ��ü : ${loginInfo} <br>
	session loginInfo ��ü id  : ${sessionScope.loginInfo.id} <br>
	session ��ü ���� loginInfo ��ü id  : ${loginInfo.id} <br>
	code �Ķ���� : ${param.code}

</body>
</html>