<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<jsp:useBean id="dadosContato" class="br.com.fiap.java.web.bean.DadosAcessoContato" scope="session">
</jsp:useBean>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h4 class="alert-heading">
		<%=dadosContato.getDataPrimeiroAcesso()%>
	</h4>
	<h4 class="alert-heading">
		<%=dadosContato.getDataUltimoAcesso()%>
	</h4>
</body>
</html>