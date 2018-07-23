<%--
  Created by IntelliJ IDEA.
  User: rita
  Date: 23.07.2018
  Time: 12:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Анкета</title>
</head>
<body>
    <form action="/question" method="post">
    <p>
        <b>Имя:</b><br>
        <input type="text" size="40"><br>
    </p>
    <p>
        <b>Фамилия:</b><br>
        <input type="text" size="40"><br>
    </p>
    <p>
        <b>Возраст:</b><br>
        <input type="text" size="40"><br>
    </p>
    <p><b>Ваш браузер:</b><br>
        <input type="radio" name="browser" value="ie"> Internet Explorer<br>
        <input type="radio" name="browser" value="opera"> Opera<br>
        <input type="radio" name="browser" value="firefox"> Firefox<br>
        <input type="radio" name="browser" value="chrome"> Chrome<br>
        <input type="radio" name="browser" value="safari"> Safari<br>
    </p>
    <p><b>Ваш почтовый ресурс:</b><br>
        <input type="radio" name="mail" value="gmail"> Gmail<br>
        <input type="radio" name="mail" value="mailru"> Mail.ru<br>
        <input type="radio" name="mail" value="iua"> I.ua<br>
        <input type="radio" name="mail" value="ukrnet"> Ukr.net<br>
        <input type="radio" name="mail" value="other"> Другое...<br>
    </p>
    <p><input type="submit" value="Отправить">
        <input type="reset" value="Очистить"></p>
    </form>
</body>
</html>
