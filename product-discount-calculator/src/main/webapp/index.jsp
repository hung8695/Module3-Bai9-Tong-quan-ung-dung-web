<%--
  Created by IntelliJ IDEA.
  User: Hung
  Date: 6/29/2021
  Time: 2:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Currency Converter</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
  </head>
  <body>
  <form action="/discount" method="post">
    <label>Product Description:</label><br/>
    <input type="text" name ="productDes" placeholder="product description"><br/>
    <label >List price: </label> <br/>
    <input type="text" name="price" placeholder="list price"><br/>
    <label>Discount Percent: </label><br/>
    <input type="text" name ="percent" placeholder="Discount Percent"><br/>
    <input type="submit" value="OK">
  </form>
  
  
  </body>
</html>
