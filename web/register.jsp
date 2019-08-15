<%--
  Created by IntelliJ IDEA.
  User: HP ENVY
  Date: 8/13/2019
  Time: 6:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <title>Register Page</title>
  </head>
  <body>
    <h1>Resgiter form</h1>
    <s:form action="store" method="POST">
      <s:textfield name="currentUser.username" label="Username: "/>
      <s:textfield type="password" name="currentUser.password" label="Password: "/>
      <s:textfield name="currentUser.email" label="Email: "/>
      <s:submit value="Submit"/>
      <s:reset value="Reset"/>
    </s:form>
  </body>
</html>