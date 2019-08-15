<%--
  Created by IntelliJ IDEA.
  User: HP ENVY
  Date: 8/15/2019
  Time: 8:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Calculate Form</title>
</head>
<body>
    <h1>Calculate form</h1>

    <s:form action="calculate-pay-amount" method="POST">
        <s:textfield name="monthlyPayment.borrowedAmount" key="form.borrowedAmount.label"/>
        <s:textfield name="monthlyPayment.interestRate" key="form.interestRate.label"/>
        <s:textfield name="monthlyPayment.month" key="form.month.label"/>
        <br>
        <s:textfield name="monthlyPayment.amount" key="form.amount.label"/>
        <s:submit value="Submit"/>
    </s:form>
</body>
</html>
