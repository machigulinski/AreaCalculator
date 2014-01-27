<%-- 
    Document   : calculationresult
    Created on : Jan 27, 2014, 12:24:22 PM
    Author     : Machi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>result page</title>
    </head>
    <body>
        <h1>Success, calculation is done...</h1>
	    
		<%
		    String calcarea = (String)request.getAttribute("area");

		    out.print("<h3>" + "area:" + " <b>" + calcarea + "</b></h3>");
		%>
		<a href="index.html">Back to the form</a>
    </body>
</html>
