<%@page import="gioco.CartaForbiceSasso"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
img {
	width: 150px;
}

div {
	border: 1px solid yellow;
	margin-top: 20px;
}
</style>
</head>
<body>
<h1> Carta Forbice Sasso</h1>
<div>

<a href="?scelta=carta"><img src="data:image/jpeg;base64,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"></a>
<a href="?scelta=forbici"><img src="data:image/jpeg;base64,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"></a>
<a href="?scelta=sasso"><img src="data:image/jpeg;base64,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"></a>

</div>




<div>
<h2>scelta umano</h2>
<% String sceltaUmano = request.getParameter("scelta"); %>
<h3><%= sceltaUmano %></h3>
</div>

<div>
<h2>scelta Pc</h2>
<% String sceltaPc = CartaForbiceSasso.chiediPc(); %>
<h3><%= sceltaPc %></h3>
</div>

<div>
<h2>risultato</h2>
<% String risultato = null;
if(sceltaUmano != null && sceltaPc != null)
	risultato = CartaForbiceSasso.valuta(sceltaUmano, sceltaPc);

%>
<h3><%= risultato %></h3>

</div>



</body>
</html>