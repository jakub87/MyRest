<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Persons API</title>
</head>
<body>
  <p><a href="generatePersons.jsp"> Generuj uzytkownikow </a> </p>
  <p><a href="api/persons/getallpersons"> Pokaz wszystkich uzytkownikow  </a> http://localhost:8081/MyRest_war_exploded/api/persons/getallpersons </p>
  <p><a href="addUser.jsp"> Dodaj uzytkownika </a> </p>

  <p> Szukaj po ID  </a> http://localhost:8081/MyRest_war_exploded/api/persons/findbyid/ID</p>
  <p> Szukaj po nazwisku  </a> http://localhost:8081/MyRest_war_exploded/api/persons/findbylastname/NAZWISKO </p>

  <p>Usun uzytkownika: http://localhost:8081/MyRest_war_exploded/api/persons/deletebyid/ID </a> </p>
  <p>Usun wszyskich uzytkownikow: http://localhost:8081/MyRest_war_exploded/api/persons/deleteall  </p>


</body>
</html>
