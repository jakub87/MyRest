
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Generuj uzytkownikow</title>
</head>
<body>
<H2>Generuj uzytkownikow</H2>
<br>

<table>
<form method="post" action="api/persons/generatepersons">
    <tr>
        <td>Ilu wygenerowac: </td>
        <td><input type="text" name="numberOfPersons" ></td>
    </tr>
    <tr>
        <td colspan="=2"><input type="submit" value="Generuj" ></td>
    </tr>
</form>
</table>


</body>
</html>
