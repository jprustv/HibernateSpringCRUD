<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
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


<div class="bgimg w3-display-container w3-animate-opacity w3-text-black">

	<div class = "w3-display-topMiddle w3-responsive w3-center">
  		<div class = "w3-bar">
  			<a href = "times"><button class = "w3-bar-item w3-btn w3-blue">Times</button></a>
  			<a href = "jogadores"><button class = "w3-bar-item w3-btn w3-green">Jogadores</button></a>
  		</div>
  	</div>

	<div class = "w3-display-middle">
	    <h1 class="w3-jumbo w3-animate-top w3-center w3-text-blue">Cadastrar / Atualizar</h1>
	    <hr class="w3-border-grey" style="margin:auto;width:40%">  

	    <form:form action="saveTime" method="post" modelAttribute="time">
        <table class = "w3-table w3-striped w3-responsive w3-text-blue">
            <form:hidden path="id"/>
            <tr>
                <td class = "w3-text-blue w3-large">Nome:</td>
                <td><form:input path="nome" class ="w3-input w3-border" /></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Salvar" class ="w3-btn w3-blue w3-center w3-block"></td>
            </tr>
        </table>

        </form:form>
	    
	    
    </div>
</div>



</body>
</html>