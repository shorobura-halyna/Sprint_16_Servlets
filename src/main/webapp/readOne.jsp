<%--
  Created by IntelliJ IDEA.
  User: halyna
  Date: 22.05.20
  Time: 17:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Read record from Address book</title>
</head>
<body>
<a href="/home">Home Page</a> |
<a href="/records/create">Add new record</a> |
<a href="/records/list">Show all records</a>
<br>
<br>
First name: ${record.getPerson().getFirstName()}
<br>
Last name: ${record.getPerson().getLastName()}
<br>
Address: ${record.getAddress()}

</body>
</html>
