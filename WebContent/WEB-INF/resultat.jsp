<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ULTIMATE CHIFOUMI - Fin de partie</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous"/>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body style="max-width:800px; margin-left: auto; margin-right: auto;text-align: center;">

	<h1 class="page-header">CHI-FOU-MI !*TIN NIN NIN NINNIN*</h1>
	
	<div class="panel panel-primary" style="max-width: 300px; margin: auto;">
		<div class="panel-heading">Vous avez joué</div>
		<div class="panel-body"><%= request.getAttribute("coupJoueur") %></div>
	</div>
	<div class="panel panel-danger" style="max-width: 300px;  margin-left:auto; margin-right: auto; margin-top: 2em;">
		<div class="panel-heading">Le serveur a joué</div>
		<div class="panel-body"><%= request.getAttribute("coupServeur") %></div>
	</div>
	<h2 class="margin-left: auto; margin-right: auto;">Résultat</h2>
	
	<p style="font-size: 4em;"><%= request.getAttribute("resultat") %></p>
	
	<div style="margin: auto;"><%= request.getAttribute("gif") %></div>
	
	<button href="/" class="btn btn-default">Rejouer</button>
	
</body>
</html>