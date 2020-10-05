<%-- 
    Document   : viewnote
    Created on : Sep 29, 2020, 9:17:21 AM
    Author     : 816076
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Note</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>View Note</h2>
        <p style="font-weight:bold; display:inline;">Title: </p><p style="display:inline;">${note.title}</p><br>
        <p style="font-weight:bold">Contents: </p>
        <p>${note.contents}</p>
        <a href="note?edit">Edit</a>
    </body>
</html>
