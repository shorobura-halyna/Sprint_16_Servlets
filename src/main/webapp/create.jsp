<%--
  Created by IntelliJ IDEA.
  User: halyna
  Date: 22.05.20
  Time: 15:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create new Record in Address Book</title>
</head>
<body>
<a href="/home">Home Page</a> |
<a href="/records/create">Add new record</a> |
<a href="/records/list">Show all records</a>
<br>
<form action="/records/create" method="post">
    First name: <input type="text" name="firstName"><br>
    Last name: <input type="text" name="lastName"> <br>
    Address: <input type="text-area" name="address"> <br>
    <button>Create</button>
    <button>Clear</button>
</form>
</body>
</html>
