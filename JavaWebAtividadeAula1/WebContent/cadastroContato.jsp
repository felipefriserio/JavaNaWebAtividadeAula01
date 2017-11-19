<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Cadastro</title>
</head>
<body>
	<!-- Navigation -->
    <nav class="navbar 	 navbar-expand-lg navbar-dark bg-dark fixed-top">
      <div class="container">
        <a class="navbar-brand" href="#">
          <i>Cadastro Contato</i>
        </a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
          <ul class="navbar-nav ml-auto">
            <li class="nav-item active">
              <a class="nav-link" href="#">Home
                <span class="sr-only">(current)</span>
              </a>
            </li>
          </ul>
        </div>
      </div>
    </nav>

    <!-- Conteudo -->
    <div class="container" style="margin-top: 75px;">
	    <form class="form-horizontal" action="cadastroContato" method="post">
			<fieldset>
				<!-- Text input-->
				<div class="form-group">
				  <label class="col-md-4 control-label" for="Nome">Nome</label>  
				  <div class="col-md-5">
				 	 <input id="Nome" name="Nome" type="text" placeholder="Nome completo" class="form-control input-md" required="">
				  </div>
				</div>
				
				<!-- Text input-->
				<div class="form-group">
				  <label class="col-md-4 control-label" for="Idade">Idade</label>  
				  <div class="col-md-4">
				  	<input id="Idade" name="Idade" type="text" placeholder="Idade" class="form-control input-md" required="">
				  </div>
				</div>
				
				<!-- Text input-->
				<div class="form-group">
				  <label class="col-md-4 control-label" for="Email">Email</label>  
				  <div class="col-md-4">
				  	<input id="Email" name="Email" type="text" placeholder="Email" class="form-control input-md" required="">
				  </div>
				</div>
				
				<!-- Text input-->
				<div class="form-group">
				  <label class="col-md-4 control-label" for="Telefone">Telefone</label>  
				  <div class="col-md-4">
				  	<input id="Telefone" name="Telefone" type="text" placeholder="Telefone" class="form-control input-md" required="">
				  </div>
				</div>
				
				<div class="row justify-content-end">
				    <div class="col-4">
				      <button type="submit" class="btn btn-outline-primary">Cadastrar</button>
				    </div>
				</div>
			
			</fieldset>
		</form>
    </div>
    <!-- /.container -->


<script>
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>
</script>
</html>