<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML "http://www.w3.org/TR/html5/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<title>Liga de Futebol</title>



<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
<style>
body,h1 {font-family: "Raleway", sans-serif}
body, html {height: 100%}
.bgimg {
    
    min-height: 100%;
    background-position: center;
    background-size: cover;
}
</style>


</head>
<body>

<div class="bgimg w3-display-container w3-animate-opacity w3-text-blue">
	<div class="w3-display-middle">
	    <h1 class="w3-jumbo w3-animate-top w3-center">TIMES</h1>
	    <hr class="w3-border-grey" style="margin:auto;width:40%">    
	    
	   
			
			<table class = "w3-table w3-striped w3-responsive w3-text-blue">
	
				<c:forEach var="time" items="${listTime}">
					<tr>
	
						<td><a href="timeJogadores?id=${time.id}">${time.nome}</a></td>
						<td><a href="editTime?id=${time.id}">Editar</a>
							&nbsp;&nbsp;&nbsp;&nbsp; <a
							href="deleteTime?id=${time.id}">Deletar</a></td>
	
					</tr>
				</c:forEach>
			</table>
			<h4 class ="w3-text-black w3-center">
				<a href="newTime" class = "w3-text-blue">Cadastrar novo Time</a>
			</h4>

	
    
    
  	</div>
  	
  	<div class = "w3-display-topMiddle w3-responsive">
  		<div class = "w3-bar">
  			<a href = "times"><button class = "w3-bar-item w3-btn w3-blue">Times</button></a>
  			<a href = "jogadores"><button class = "w3-bar-item w3-btn w3-green">Jogadores</button></a>
  		</div>
  	</div>
  	
  	<div class="w3-display-bottomMiddle w3-padding-large w3-responsive">
    	CRUD - Lab. Engenharia de Software - Jonathan Prust Vernizzi

  </div>
   	
  
</div>
  	
  	
  	
</body>
</html>