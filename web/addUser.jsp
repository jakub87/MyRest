


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dodaj Uzytkownika</title>
</head>
<body>

<H2>Dodaj uzytkownika</H2>
<br>

<table>

<form method="post" action="api/persons/adduser">


    <tr>
        <td> Imie: </td>
        <td> <input type="text" name="firstName" ></td>
    </tr>
    <tr>
        <td> Nazwisko: </td>
        <td> <input type="text" name="lastName" >  </td>
    </tr>
    <tr>
        <td>PESEL: </td>
        <td><input type="text" name="personalIdentityNumber" > </td>
    </tr>
    <tr>
        <td> Wojewodztwo: </td>
        <td><input type="text" name="province" > </td>
    </tr>
    <tr>
        <td>Ulica: </td>
        <td><input type="text" name="street" >  </td>
    </tr>
    <tr>
        <td> Miasto: </td>
        <td> <input type="text" name="city" >  </td>
    </tr>
    <tr>
        <td>Rok urodzenia: </td>
        <td><input type="text" name="yearOfBirth" >  </td>
    </tr>
    <tr>
        <td colspan="2"><input type="submit" value="Dodaj" > </td>
    </tr>


</form>
</table>

</body>
</html>