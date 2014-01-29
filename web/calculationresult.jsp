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
	<style>
	    #result_container { width: 400px; padding: 1em 3em; border:1px solid blue;}
	    
	</style>
    </head>
    <body>
	<div id="result_container">
        <h1>Success, calculation is done...</h1>
	    
		<%
		    String calcarea = (String)request.getAttribute("area");
		    String unit = (String)request.getAttribute("calcunit");
		    

		    out.print("<h3>" + "area:" + " <b>" + calcarea + " sq " + unit + "</b></h3>");
		%>
		<a href="index.html">Back to the form</a>
	</div>
    </body>
</html>
