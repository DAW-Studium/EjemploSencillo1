<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="UTF-8">
<title>Ejemplo Sencillo1</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-12 mt-5">
				<form action="ServletPorcentaje" method="get">
					<label class="form-label">Número</label>
					<input class="form-control" type="number" step="0.01" name="numero" placeholder="Número" autofocus required="required"/>
					<label class="form-label">Porcentaje</label>
					<input class="form-control" type="number" step="0.01" name="porcentaje" placeholder="Porcentaje" required="required"/>
					<div class="my-3">
					<%
						if (request.getAttribute("resultado") != null) 
						{
							out.println("Resultado = " + request.getAttribute("resultado"));
						}
					%>
					</div>
					<input class="btn btn-primary mt-3" type="submit"
						value="Enviar" />
				</form>
			</div>
		</div>
	</div>
</body>
</html>