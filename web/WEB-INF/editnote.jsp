<%-- 
    Document   : editnote
    Created on : Sep 29, 2020, 9:17:00 AM
    Author     : 816076
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Note</title>
    </head>
    <body>
        <form method="post" action="note">
            <h1>Simple Note Keeper</h1>
            <h2>Edit Note</h2>
            <p style="display:inline;">Title: </p><input type="textbox" value="${editTitle}"><br>
            <p style="display:inline;">Contents: </p>
            <textarea rows="7" cols="25" value="${editContents}"></textarea><br>
            <input type="submit" value="Save">
        </form>
    </body>
</html>
