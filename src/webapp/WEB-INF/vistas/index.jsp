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
    <section>
        <a href="/capturarPokemon" class="btn btn-success">Agregar Nuevo</a>
        <ul>
            <li>Lista de especies</li>
            <div class="container mt-4">
                <table class="table">
                    <thead>
                    <tr>
                        <th>ID</th>
                        <th>Apodo</th>
                        <th>Especie</th>
                    </tr>
                    </thead>
                    <tbody>
                    <forEach var="pokemon" items="${pokemones}">
                        <tr>
                            <td>${pokemon.id}</td>
                            <td>${pokemon.apodo}</td>
                            <td>${pokemon.especie}</td>

                        </tr>
                    </forEach>

                    </tbody>
                </table>
            </div>
            <a class="btn btn-succes">Capturar</a>

        </ul>
    </section>

</body>
</html>
