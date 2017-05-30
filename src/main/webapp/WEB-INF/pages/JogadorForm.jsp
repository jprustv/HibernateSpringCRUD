<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE HTML "http://www.w3.org/TR/html5/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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


<div class="bgimg w3-display-container w3-animate-opacity w3-text-green">

	<div class = "w3-display-topMiddle w3-responsive w3-center">
  		<div class = "w3-bar">
  			<a href = "times"><button class = "w3-bar-item w3-btn w3-blue">Times</button></a>
  			<a href = "jogadores"><button class = "w3-bar-item w3-btn w3-green">Jogadores</button></a>
  		</div>
  	</div>

	<div class = "w3-display-middle">
	    <h1 class="w3-jumbo w3-animate-top w3-center w3-text-green">Cadastrar / Atualizar</h1>
	    <hr class="w3-border-grey" style="margin:auto;width:40%">  


	    <form:form action="saveJogador" method="post" modelAttribute="jogador">
        <table class = "w3-table w3-striped w3-responsive w3-text-green">
            <form:hidden path="id"/>
            <tr>
                <td class = "w3-text-green w3-large">Nome:</td>
                <td><form:input path="nome" class ="w3-input w3-border" /></td>
            </tr>
            
            <tr>
            	<td class = "w3-text-green w3-large">Time:</td>
            	<td>
            	
            	<form:select multiple="false" path="time">
         			<form:options items="${listTime}" itemValue="id" itemLabel="nome"/>
    			</form:select>
            	 
            	           		
            	</td>
            
            <tr>
                <td class = "w3-text-green w3-large">Idade:</td>
                <td><form:input path="idade" class ="w3-input w3-border" /></td>
            </tr>
            
            <tr>
                <td class = "w3-text-green w3-large">Altura:</td>
                <td><form:input path="altura" class ="w3-input w3-border" /></td>
            </tr>
            <tr>
                <td class = "w3-text-green w3-large">Peso:</td>
                <td><form:input path="peso" class ="w3-input w3-border" /></td>
            </tr>
            <tr>
                <td class = "w3-text-green w3-large">Pé de Chute:</td>
                <td><form:input path="peChute" class ="w3-input w3-border" /></td>
            </tr>
            <tr>
                <td class = "w3-text-green w3-large">Pontuação:</td>
                <td><form:input path="pontuacao" class ="w3-input w3-border" /></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Salvar" class ="w3-btn w3-green w3-center w3-block"></td>
            </tr>
        </table>

        </form:form>
	    
	    
    </div>
    
    
</div>



</body>
</html>