<%@ page language="java" contentType="text/html; ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>PokeAPI Gota Catch´em all</title>
    <link rel="stylesheet" href="../css3/style.css" type="text/css" media="all"/>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>
<div classs="container mt-4">
    <form>
        <div class="card">
        <div class="card-header">
            <h4>Capturar Pokemon</h4>
        </div>
        <div class="card-body">
            <div class="form-group">
                <label>Id</label><input type="text" name="id" readonly="readonly" class="form-control">
            </div>
            <div class="form-group">
                <label>Apodo</label><input type="text" name="apodo"  class="form-control">
            </div>
        </div>
        <div class="card-footer">
            <input type="submit" value="Guardar" class="btn btn-info"/>
            <a href="/listar" class="btn btn-link">Regresar</a>
        </div>
        </div>
    </form>
</div>
</body>

</html>