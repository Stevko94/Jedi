
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Topic</title>
    </head>
    <body>
        <h1>${topic.title}</h1>
        <p>${topic.description}</p>
        <h3>Comment</h3>
       
        <form action="./${topic.id}" method="post">
            <input  type="text" name="Comment" >
            <input type="hidden" name="topic_id" value="${topic.id}">
            <input  type="submit" value="Post">
            </form>
             <c:forEach items="${coments}" var="coment">
            <p>${coment.com}</p>
        </c:forEach>
    </body>
</html>
