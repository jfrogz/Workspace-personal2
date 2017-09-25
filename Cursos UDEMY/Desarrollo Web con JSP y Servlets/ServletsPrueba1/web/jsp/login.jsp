<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h1>Esto es el login, inicia sesion aquí</h1>

<form  method="post" action="?accion=IniciarSesion">
    <table>
        <tr>
            <td>Nombre de usuario: </td>
            <td><input type="text" name="usuario"></td>
        </tr>
        <tr>
            <td>Contraseña: </td>
            <td><input type="password" name="contrasena"></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Iniciar sesión"></td>
        </tr>
    </table>
</form>

<a href="?accion=inicio">Regresar</a>
</body>
</html>
