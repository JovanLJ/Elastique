<%@page import="filtres.Filtre"%>
<%@page import="java.util.ArrayList"%>
<%@page import="classes_metier.Client"%>
<%@page import="filtres.ContaineurFiltre"%>
<%@page import="filtres.CollectionFiltres"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%
     	Client clientBean = (Client) request.getSession().getAttribute("client");
     %>   <!--   // mon objet clientBean répuère le client envoyé depuis le controleur-->
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Félicitations</title>
	</head>
	<body>
	
		<h1> Connection réussie! Bienvenue <%=clientBean.getName() %> !</h1>
	<% System.out.println("entrée dans login-succès");%>
			<form name="input" action="${pageContext.request.contextPath}/SelectionServlet" method="get">
				<% CollectionFiltres coll = (CollectionFiltres)request.getSession().getAttribute("maCollection"); %>   
				<%for (ContaineurFiltre cf: coll.getCf()){%>
				<aside> 
				<h3> <%=cf.getNom() %> </h3>
						<% for(Filtre filtre : cf.getListeFiltre()) {
						%><input type="checkbox" name="selection" value="<%=filtre.getId()%>" label="<%=filtre.getIntitule()%>"  <%=filtre.getChecked()%>> <%=filtre.getIntitule()%>
						</br>
						<% };%> 
				</aside>
				<% }; %>
				<input type="submit" value="Filtrer">
			</form>	
			
				

		
		
	</body>
</html>
